package com.bahadirmemis.springboot.designpattern.abstractfactory;

public interface CarModelFactory {

    Car produceCar(String model, String fuelType);
}
