package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.transactional.ts15.Ts15Service1;
import com.bahadirmemis.springboot.transactional.ts1.Ts1Service;
import com.bahadirmemis.springboot.transactional.ts10.Ts10Service1;
import com.bahadirmemis.springboot.transactional.ts11.Ts11Service1;
import com.bahadirmemis.springboot.transactional.ts12.Ts12Service1;
import com.bahadirmemis.springboot.transactional.ts13.Ts13Service1;
import com.bahadirmemis.springboot.transactional.ts14.Ts14Service1;
import com.bahadirmemis.springboot.transactional.ts16.Ts16Service1;
import com.bahadirmemis.springboot.transactional.ts2.Ts2Service;
import com.bahadirmemis.springboot.transactional.ts3.Ts3Service1;
import com.bahadirmemis.springboot.transactional.ts4.Ts4Service1;
import com.bahadirmemis.springboot.transactional.ts5.Ts5Service1;
import com.bahadirmemis.springboot.transactional.ts6.Ts6Service1;
import com.bahadirmemis.springboot.transactional.ts7.Ts7Service;
import com.bahadirmemis.springboot.transactional.ts8.Ts8Service;
import com.bahadirmemis.springboot.transactional.ts9.Ts9Service1;
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

    @Autowired
    private Ts9Service1 ts9Service1;

    @Autowired
    private Ts10Service1 ts10Service1;

    @Autowired
    private Ts11Service1 ts11Service1;

    @Autowired
    private Ts12Service1 ts12Service1;

    @Autowired
    private Ts13Service1 ts13Service1;

    @Autowired
    private Ts14Service1 ts14Service1;

    @Autowired
    private Ts15Service1 ts15Service1;

    @Autowired
    private Ts16Service1 ts16Service1;

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
     * 9: requires new i farklı classa taşıma.
     */
    @PostMapping("/ts9")
    public void ts9(){
        ts9Service1.save();
    }

    /**
     * 10: requires new ile hata almayanları commitleme.
     */
    @PostMapping("/ts10")
    public void ts10(){
        ts10Service1.save();
    }

    /**
     * 11: mandatory transaction yok
     */
    @PostMapping("/ts11")
    public void ts11(){
        ts11Service1.save();
    }

    /**
     * 12: mandatory transaction var
     */
    @PostMapping("/ts12")
    public void ts12(){
        ts12Service1.save();
    }

    /**
     * 13: supports transaction var
     */
    @PostMapping("/ts13")
    public void ts13(){
        ts13Service1.save();
    }

    /**
     * 14: supports transaction yok
     */
    @PostMapping("/ts14")
    public void ts14(){
        ts14Service1.save();
    }

    /**
     * 15: not_suppoted (hızlı)
     */
    @PostMapping("/ts15")
    public void ts15(){
        ts15Service1.save();
    }

    /**
     * 16: nested (desteklenmez)
     */
    @PostMapping("/ts16")
    public void ts16(){
        ts16Service1.save();
    }

    /**
     *
     * 17: toplu işlemlerinizi transactional olmayan yerde yapın.en hızlı senaryo
     * 18: transaction açmasa bile transactional olan bir metotta işlem yapma kapatma maliyeti
     * 19: transaction açıp kapatma maliyeti
     */
}
