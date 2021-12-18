package com.bahadirmemis.springboot.transactional.ts16;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts16Service2 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Transactional(propagation = Propagation.NESTED)
    public void save(){
        Kategori kategori = new Kategori();
        kategori.setAdi("transactional16-2");
        kategori.setKirilim(1L);
        kategoriEntityService.save(kategori);
    }
}
