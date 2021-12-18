package com.bahadirmemis.springboot.transactional.ts3;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Ts3Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts3Service2 ts3Service2;

    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional3-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        ts3Service2.save();

        System.out.println("transactional service ends");

    }
}
