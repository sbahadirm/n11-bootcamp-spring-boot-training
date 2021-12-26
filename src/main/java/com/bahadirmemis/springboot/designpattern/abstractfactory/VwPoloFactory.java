package com.bahadirmemis.springboot.designpattern.abstractfactory;

public class VwPoloFactory implements CarFactory {

    private static VwPoloFactory vwPoloFactory;

    private VwPoloFactory() {
    }

    public static VwPoloFactory INSTANCE(){
        return vwPoloFactory;
    }

    @Override
    public Car produceCar(String fuelType) {
        return new Polo(fuelType);
    }
}
