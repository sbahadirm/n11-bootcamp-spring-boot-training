package com.bahadirmemis.springboot.designpattern.abstractfactory;

public class VolkswagenFactory implements CarModelFactory {

    @Override
    public Car produceCar(String model, String fuelType) {

        Car car;
        if ("polo".equalsIgnoreCase(model)){
            VwPoloFactory vwPoloFactory = new VwPoloFactory();
            car = vwPoloFactory.produceCar(fuelType);
        } else if ("golf".equalsIgnoreCase(model)){
            VwGolfFactory vwGolfFactory = new VwGolfFactory();
            car = vwGolfFactory.produceCar(fuelType);
        } else {
            throw new RuntimeException("Model not found!");
        }

        return car;
    }
}
