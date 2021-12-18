package com.bahadirmemis.springboot.transactional.ts1;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ts1Service {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional1");
        kategori.setKirilim(1L);

        kategoriEntityService.save(kategori);

        System.out.println("end");
    }
}
