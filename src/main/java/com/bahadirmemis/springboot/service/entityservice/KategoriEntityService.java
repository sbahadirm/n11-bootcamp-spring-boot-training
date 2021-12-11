package com.bahadirmemis.springboot.service.entityservice;

import com.bahadirmemis.springboot.dao.KategoriDao;
import com.bahadirmemis.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategoriEntityService {

    @Autowired
    private KategoriDao kategoriDao;

    public List<Kategori> findAll(){
        return (List<Kategori>) kategoriDao.findAll();
    }
}