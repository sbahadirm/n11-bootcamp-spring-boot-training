package com.bahadirmemis.springboot.transactional.ts13;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Ts13Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts13Service2 ts13Service2;

    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional13-1");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        ts13Service2.save();

        System.out.println("13-1");
    }
}
