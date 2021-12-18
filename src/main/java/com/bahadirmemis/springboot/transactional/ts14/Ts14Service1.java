package com.bahadirmemis.springboot.transactional.ts14;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ts14Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts14Service2 ts14Service2;

    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional14-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        ts14Service2.save();

        System.out.println("14-1");
    }
}
