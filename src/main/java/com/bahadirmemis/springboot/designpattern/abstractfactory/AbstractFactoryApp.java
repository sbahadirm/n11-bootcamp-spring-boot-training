package com.bahadirmemis.springboot.designpattern.abstractfactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {

        VwPoloFactory vwPoloFactory = new VwPoloFactory();
        Car polo = vwPoloFactory.produceCar("Diesel");
        polo.print();

        VwGolfFactory vwGolfFactory = new VwGolfFactory();
        Car golf = vwGolfFactory.produceCar("Gasoline");
        golf.print();

        VolkswagenFactory volkswagenFactory = new VolkswagenFactory();
        Car car = volkswagenFactory.produceCar("polo", "LPG");
        car.print();
    }
}
