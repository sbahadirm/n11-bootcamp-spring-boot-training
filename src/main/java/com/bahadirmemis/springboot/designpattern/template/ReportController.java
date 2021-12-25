package com.bahadirmemis.springboot.designpattern.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/report")
@RestController
public class ReportController {

    @Autowired
    private CategoryReportService2 categoryReportService;

    @Autowired
    private ProductReportService2 productReportService;

    @GetMapping("/categories")
    public void reportCategories(){
        categoryReportService.report();
    }

    @GetMapping("/products")
    public void reportProducts(){
        productReportService.report();
    }
}
