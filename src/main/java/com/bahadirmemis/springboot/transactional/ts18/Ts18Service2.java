package com.bahadirmemis.springboot.transactional.ts18;

import com.bahadirmemis.springboot.entity.Kategori;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class Ts18Service2 {

    public Kategori getKategori(){
        return null;
    }
}
