package com.bahadirmemis.springboot.transactional.ts13;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Ts13Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.SUPPORTS)
    public void save(){

        Kategori kategori = new Kategori();
        kategori.setAdi("transactional13-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        System.out.println("13-2");
    }
}
