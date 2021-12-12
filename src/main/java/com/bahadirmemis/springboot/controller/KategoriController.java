package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.converter.KategoriConverter;
import com.bahadirmemis.springboot.dto.KategoriDto;
import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/kategoriler")
public class KategoriController {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @GetMapping("")
    public List<KategoriDto> findAll(){

        List<Kategori> kategoriList = kategoriEntityService.findAll();

        List<KategoriDto> kategoriDtoList = KategoriConverter.INSTANCE.convertAllKategoriListToKategoriDtoList(kategoriList);

        return kategoriDtoList;
    }

    @GetMapping("/{id}")
    public Kategori findById(@PathVariable Long id){

        Kategori kategori = kategoriEntityService.findById(id);

        return kategori;
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody KategoriDto kategoriDto){ //TODO: Input değeri dto tipinde olmalı

        Kategori kategori = KategoriConverter.INSTANCE.convertKategoriDtoToKategori(kategoriDto);

        //TODO: Check it
        if (kategori.getUstKategori() != null && kategori.getUstKategori().getId() == null){
            kategori.setUstKategori(null);
        }

        kategori = kategoriEntityService.save(kategori);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(kategori.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("")
    public KategoriDto update(@RequestBody KategoriDto kategoriDto){//TODO: Input değeri dto tipinde olmalı

        Kategori kategori = KategoriConverter.INSTANCE.convertKategoriDtoToKategori(kategoriDto);

        //TODO: Check it
        if (kategori.getUstKategori() != null && kategori.getUstKategori().getId() == null){
            kategori.setUstKategori(null);
        }

        kategori = kategoriEntityService.save(kategori);

        KategoriDto kategoriDtoResult = KategoriConverter.INSTANCE.convertKategoriToKategoriDto(kategori);

        return kategoriDtoResult;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        kategoriEntityService.deleteById(id);
    }
}
