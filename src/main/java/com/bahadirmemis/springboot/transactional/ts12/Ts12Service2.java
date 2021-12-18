package com.bahadirmemis.springboot.transactional.ts12;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Ts12Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.MANDATORY)
    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional12-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);
    }
}
