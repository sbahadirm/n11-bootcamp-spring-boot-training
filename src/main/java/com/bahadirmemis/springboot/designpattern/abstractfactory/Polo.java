package com.bahadirmemis.springboot.designpattern.abstractfactory;

import java.util.Date;

public class Polo implements Car {

    private String fuelType;

    public Polo(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getBrand() {
        return "Volkswagen";
    }

    @Override
    public String getModel() {
        return "Polo";
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
