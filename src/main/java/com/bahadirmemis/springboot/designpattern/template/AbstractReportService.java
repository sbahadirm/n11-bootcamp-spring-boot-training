package com.bahadirmemis.springboot.designpattern.template;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractReportService {

    public abstract String getTitle() ;
    public abstract List getList() ;

    public void report(){

        List list = getList();
        String title = getTitle();

        System.out.println(title);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
