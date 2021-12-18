package com.bahadirmemis.springboot.transactional.ts10;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts10Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts10Service2 ts10Service2;

    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional10-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        ts10Service2.topluKaydet();

        System.out.println("10-1");
    }
}
