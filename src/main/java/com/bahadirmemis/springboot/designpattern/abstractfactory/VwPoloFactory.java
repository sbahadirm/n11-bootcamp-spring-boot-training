package com.bahadirmemis.springboot.designpattern.abstractfactory;

public class VwPoloFactory implements CarFactory {

    @Override
    public Car produceCar(String fuelType) {
        return new Polo(fuelType);
    }
}
