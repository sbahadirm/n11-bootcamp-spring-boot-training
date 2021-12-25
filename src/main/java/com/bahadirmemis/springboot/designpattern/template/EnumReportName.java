package com.bahadirmemis.springboot.designpattern.template;

public enum EnumReportName {

    CATEGORY_REPORT("Kategoriler"),
    PRODUCT_REPORT("Ürünler");

    private String reportName;
    EnumReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }

    @Override
    public String toString() {
        return reportName;
    }
}
