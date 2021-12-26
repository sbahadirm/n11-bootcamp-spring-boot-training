package com.bahadirmemis.springboot.designpattern.abstractfactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {

        VwPoloFactory vwPoloFactory = VwPoloFactory.INSTANCE();
        Car polo = vwPoloFactory.produceCar("Diesel");
        polo.print();

        VwGolfFactory vwGolfFactory = VwGolfFactory.INSTANCE();
        Car golf = vwGolfFactory.produceCar("Gasoline");
        golf.print();

        VolkswagenFactory volkswagenFactory = VolkswagenFactory.INSTANCE();
        Car car = volkswagenFactory.produceCar("polo", "LPG");
        car.print();
    }
}
