package com.bahadirmemis.springboot.designpattern.template;

import com.bahadirmemis.springboot.service.entityservice.KategoriEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryReportService2 extends AbstractReportService {

    @Autowired
    private KategoriEntityService kategoriEntityService;

    @Override
    public String getTitle() {
        return "Kategoriler: ";
    }

    @Override
    public List getList() {
        return kategoriEntityService.findAll();
    }
}
