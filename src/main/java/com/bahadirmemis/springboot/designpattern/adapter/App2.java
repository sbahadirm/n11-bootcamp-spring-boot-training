package com.bahadirmemis.springboot.designpattern.adapter;

public class App2 {

    public static void main(String[] args) {

        Socket socket = new Socket();
        Iron iron = new Iron();
        socket.provideElectricity(iron);

        Phone phone = new Phone();

        PhoneAdapter phoneAdapter = new PhoneAdapter(phone);
        socket.provideElectricity(phoneAdapter);
    }
}
