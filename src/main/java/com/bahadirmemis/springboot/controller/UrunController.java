package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.dto.UrunDetayDto;
import com.bahadirmemis.springboot.dto.UrunDto;
import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.entity.Urun;
import com.bahadirmemis.springboot.exception.UrunNotFoundException;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import com.bahadirmemis.springboot.service.entityservice.UrunEntityService;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/urunler/")
public class UrunController {

    @Autowired
    private UrunEntityService urunEntityService;
    
    @Autowired
    private KategoriEntityService kategoriEntityService;

    @GetMapping("")
    public MappingJacksonValue findAllUrunList() {

        List<Urun> urunList = urunEntityService.findAll();

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id");

        SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("UrunFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(urunList);

        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/{id}")
    public EntityModel<Urun> findUrunById(@PathVariable Long id){

        Urun urun = urunEntityService.findById(id);

        if (urun == null){
            throw new UrunNotFoundException("Urun not found. id: " + id);
        }

        WebMvcLinkBuilder linkToUrun = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(this.getClass())
                        .findAllUrunList()
        );

        EntityModel entityModel = EntityModel.of(urun);

        entityModel.add(linkToUrun.withRel("tum-urunler"));

        return entityModel;
    }

    @GetMapping("/dto/{id}")
    public UrunDetayDto findUrunDtoById(@PathVariable Long id){

        Urun urun = urunEntityService.findById(id);

        UrunDetayDto urunDetayDto = convertUrunToUrunDetayDto(urun);

        return urunDetayDto;
    }

    @PostMapping("")
    public ResponseEntity<Object> saveUrun(@RequestBody UrunDto urunDto){

        Urun urun = convertUrunDtoToUrun(urunDto);

        urun = urunEntityService.save(urun);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(urun.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("{id}")
    public void deleteUrun(@PathVariable Long id){

        urunEntityService.deleteById(id);
    }

    private Urun convertUrunDtoToUrun(UrunDto urunDto) {
        Kategori kategori = kategoriEntityService.findById(urunDto.getKategoriId());

        Urun urun = new Urun();
        urun.setAdi(urunDto.getAdi());
        urun.setFiyat(urunDto.getFiyat());
        urun.setKayitTarihi(urunDto.getKayitTarihi());
        urun.setKategori(kategori);

        return urun;
    }

    private UrunDetayDto convertUrunToUrunDetayDto(Urun urun) {
        Kategori kategori = kategoriEntityService.findById(urun.getKategori().getId());

        UrunDetayDto urunDetayDto = new UrunDetayDto();
        urunDetayDto.setUrunAdi(urun.getAdi());
        urunDetayDto.setUrunFiyati(urun.getFiyat());
        urunDetayDto.setKategoriAdi(kategori.getAdi());
        return urunDetayDto;
    }
}
