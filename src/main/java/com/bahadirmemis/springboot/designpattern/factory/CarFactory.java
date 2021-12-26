package com.bahadirmemis.springboot.designpattern.factory;

public class CarFactory {

    public static Car produceCar(String model, String fuelType){

        Car car;
        if ("polo".equalsIgnoreCase(model)){
            car = new Polo(fuelType);
        } else if ("civic".equalsIgnoreCase(model)){
            car = new Civic();
        } else {
            throw new RuntimeException("Model not found!");
        }

        return car;
    }
}
