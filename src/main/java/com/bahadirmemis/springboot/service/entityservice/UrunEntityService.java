package com.bahadirmemis.springboot.service.entityservice;

import com.bahadirmemis.springboot.dao.UrunDao;
import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunEntityService {

    @Autowired
    private UrunDao urunDao;

    public List<Urun> findAll(){
        return (List<Urun>) urunDao.findAll();
    }
}