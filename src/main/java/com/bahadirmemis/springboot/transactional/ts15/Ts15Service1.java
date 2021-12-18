package com.bahadirmemis.springboot.transactional.ts15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@Service
public class Ts15Service1 {

    @Autowired
    private Ts15Service2 ts15Service2;

    public void save() {

        Date date1 = new Date();

        ts15Service2.findAll();

        Date date2 = new Date();

        long diff = date2.getTime() - date1.getTime();

        System.out.println(diff);
    }

}
