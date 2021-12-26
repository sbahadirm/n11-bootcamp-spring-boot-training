package com.bahadirmemis.springboot.designpattern.adapter;

public class AdapterApp {

    public static void main(String[] args) {

        Socket socket = new Socket();
        Fridge fridge = new Fridge();
        Iron iron = new Iron();
        Phone phone = new Phone();

        socket.provideElectricity(fridge);
        socket.provideElectricity(iron);

        PhoneAdapter phoneAdapter = new PhoneAdapter(phone);
        socket.provideElectricity(phoneAdapter);
    }
}
