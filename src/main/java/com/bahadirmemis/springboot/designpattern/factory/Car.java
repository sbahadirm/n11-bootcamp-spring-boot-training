package com.bahadirmemis.springboot.designpattern.factory;

public interface Car {

    String getBrand();
    String getModel();
    int getModelYear();
    String getFuelType();

    default void print(){

        System.out.println(getBrand() + " " + getModel() + " / " +
                getModelYear() + " - " + getFuelType());
    }
}
