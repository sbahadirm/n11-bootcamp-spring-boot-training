package com.bahadirmemis.springboot.designpattern.abstractfactory;

import java.util.Date;

public class Golf implements Car {

    private String fuelType;

    public Golf(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getBrand() {
        return "Volkswagen";
    }

    @Override
    public String getModel() {
        return "Golf";
    }

    @Override
    public int getModelYear() {
        return new Date().getYear() + 1900;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
