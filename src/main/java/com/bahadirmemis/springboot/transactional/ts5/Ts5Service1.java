package com.bahadirmemis.springboot.transactional.ts5;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts5Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts5Service2 ts5Service2;

    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional5-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        ts5Service2.save();

        System.out.println("5-1");
    }
}
