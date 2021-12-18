package com.bahadirmemis.springboot.transactional.ts21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Ts21Service1 {

    @Autowired
    private Ts21Service2 ts21Service2;

    public void save(){
        ts21Service2.save();
    }
}
