package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.dto.UrunDetayDto;
import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.entity.Urun;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import com.bahadirmemis.springboot.service.entityservice.UrunEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UrunController {

    @Autowired
    private UrunEntityService urunEntityService;
    
    @Autowired
    private KategoriEntityService kategoriEntityService;

    @GetMapping("/merhaba")
    public String merhaba(){
        return "Merhaba Dünya";
    }

    @GetMapping("/urunler")
    public List<Urun> findAllUrunList(){
        return urunEntityService.findAll();
    }

    @GetMapping("/urunler/{id}")
    public Urun findUrunById(@PathVariable Long id){
        return urunEntityService.findById(id);
    }


    @GetMapping("/urunler/dto/{id}")
    public UrunDetayDto findUrunDtoById(@PathVariable Long id){

        Urun urun = urunEntityService.findById(id);

        UrunDetayDto urunDetayDto = convertUrunToUrunDetayDto(urun);

        return urunDetayDto;
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
