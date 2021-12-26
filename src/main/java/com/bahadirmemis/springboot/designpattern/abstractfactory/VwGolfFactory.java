package com.bahadirmemis.springboot.designpattern.abstractfactory;

public class VwGolfFactory implements CarFactory {

    @Override
    public Car produceCar(String fuelType) {
        return new Golf(fuelType);
    }
}
