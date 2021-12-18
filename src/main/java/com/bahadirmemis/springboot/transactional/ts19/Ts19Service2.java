package com.bahadirmemis.springboot.transactional.ts19;

import com.bahadirmemis.springboot.entity.Kategori;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts19Service2 {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Kategori getKategori(){
        return null;
    }
}
