package com.bahadirmemis.springboot.transactional.ts16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Ts16Service1 {

    @Autowired
    private Ts16Service2 ts16Service2;

    public void save(){
        ts16Service2.save();
    }
}
