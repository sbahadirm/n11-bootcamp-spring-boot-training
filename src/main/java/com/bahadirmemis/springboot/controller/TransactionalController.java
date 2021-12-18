package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.transactional.ts1.Ts1Service;
import com.bahadirmemis.springboot.transactional.ts2.Ts2Service;
import com.bahadirmemis.springboot.transactional.ts3.Ts3Service1;
import com.bahadirmemis.springboot.transactional.ts4.Ts4Service1;
import com.bahadirmemis.springboot.transactional.ts5.Ts5Service1;
import com.bahadirmemis.springboot.transactional.ts6.Ts6Service1;
import com.bahadirmemis.springboot.transactional.ts7.Ts7Service;
import com.bahadirmemis.springboot.transactional.ts8.Ts8Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactional")
public class TransactionalController {

    @Autowired
    private Ts1Service ts1Service;

    @Autowired
    private Ts2Service ts2Service;

    @Autowired
    private Ts3Service1 ts3Service1;

    @Autowired
    private Ts4Service1 ts4Service1;

    @Autowired
    private Ts5Service1 ts5Service1;

    @Autowired
    private Ts6Service1 ts6Service1;

    @Autowired
    private Ts7Service ts7Service;

    @Autowired
    private Ts8Service ts8Service;

    /**
     * 1: transactional olmayan yerde kayıt işlemi
     */
    @PostMapping("/ts1")
    public void ts1(){
        ts1Service.save();
    }

    /**
     * 2: transactional olan yerde kayıt işlemi
     */
    @PostMapping("/ts2")
    public void ts2(){
        ts2Service.save();
    }

    /**
     * 3: transactional olan yerden olmayan yere geçme
     */
    @PostMapping("/ts3")
    public void ts3(){
        ts3Service1.save();
    }

    /**
     * 4: transactional olmayan yerden olan yere geçme
     */
    @PostMapping("/ts4")
    public void ts4(){
        ts4Service1.save();
    }

    /**
     * 5: ikisi de transactional olan bir yerde kayıt işlemi
     */
    @PostMapping("/ts5")
    public void ts5(){
        ts5Service1.save();
    }

    /**
     * 6: sadece transactional olan bir yerde kayıt işlemi sırasında hata
     */
    @PostMapping("/ts6")
    public void ts6(){
        ts6Service1.save();
    }

    /**
     * 7: non transactional olan bir yerde kayıt işlemi sırasında hata
     */
    @PostMapping("/ts7")
    public void ts7(){
        ts7Service.save();
    }

    /**
     * 8: aynı class içinde requires new kullanımı.
     */
    @PostMapping("/ts8")
    public void ts8(){
        ts8Service.save();
    }

    /**
     *
     * 8: aynı class içinde requires new kullanımı.
     * 9: requires new i farklı classa taşıma.
     * 10: requires new ile hata almayanları commitleme.
     * 11: mandatory transaction yok
     * 12: mandatory transaction var

     * 12: supports transaction var
     * 13: supports transaction yok
     * 14: not_suppoted (hızlı)
     * 15: nested (desteklenmez)
     * 16: toplu işlemlerinizi transactional olmayan yerde yapın.en hızlı senaryo
     * 17: transaction açmasa bile transactional olan bir metotta işlem yapma kapatma maliyeti
     * 18: transaction açıp kapatma maliyeti
     */
}
