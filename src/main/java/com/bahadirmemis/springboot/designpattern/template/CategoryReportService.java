package com.bahadirmemis.springboot.designpattern.template;

import com.bahadirmemis.springboot.entity.Kategori;
import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryReportService {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    public void report(){

        List<Kategori> kategoriList = kategoriEntityService.findAll();

        System.out.println("Kategoriler: ");
        for (Kategori kategori : kategoriList) {
            System.out.println(kategori);
        }
    }
}
