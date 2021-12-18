package com.bahadirmemis.springboot.transactional.ts9;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts9Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save2(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transaction9-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);

        System.out.println("9-2");

    }
}
