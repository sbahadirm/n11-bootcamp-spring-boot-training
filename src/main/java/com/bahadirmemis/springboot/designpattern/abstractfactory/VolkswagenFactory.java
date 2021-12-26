package com.bahadirmemis.springboot.designpattern.abstractfactory;

public class VolkswagenFactory implements CarModelFactory {

    private static VolkswagenFactory volkswagenFactory;

    private VolkswagenFactory() {
    }

    public static VolkswagenFactory INSTANCE(){
        return volkswagenFactory;
    }

    @Override
    public Car produceCar(String model, String fuelType) {

        Car car;
        if ("polo".equalsIgnoreCase(model)){
            VwPoloFactory vwPoloFactory = VwPoloFactory.INSTANCE();
            car = vwPoloFactory.produceCar(fuelType);
        } else if ("golf".equalsIgnoreCase(model)){
            VwGolfFactory vwGolfFactory = VwGolfFactory.INSTANCE();
            car = vwGolfFactory.produceCar(fuelType);
        } else {
            throw new RuntimeException("Model not found!");
        }

        return car;
    }
}
