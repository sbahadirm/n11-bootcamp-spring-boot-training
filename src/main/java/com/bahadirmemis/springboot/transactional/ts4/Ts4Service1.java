package com.bahadirmemis.springboot.transactional.ts4;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ts4Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts4Service2 ts4Service2;

    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional4-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        ts4Service2.save();

        System.out.println("4-1");
    }
}
