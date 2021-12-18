package com.bahadirmemis.springboot.transactional.ts11;

import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ts11Service1 {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Autowired
    private Ts11Service2 ts11Service2;

    public void save(){
        ts11Service2.save();
    }
}
