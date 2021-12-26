package com.bahadirmemis.springboot.designpattern.factory;

import java.util.Date;

public class Civic implements Car{

    @Override
    public String getBrand() {
        return "Honda";
    }

    @Override
    public String getModel() {
        return "Civic";
    }

    @Override
    public int getModelYear() {
        return new Date().getYear() + 1900;
    }

    @Override
    public String getFuelType() {
        return "LPG";
    }
}
