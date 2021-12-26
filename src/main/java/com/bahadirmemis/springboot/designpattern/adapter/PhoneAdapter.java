package com.bahadirmemis.springboot.designpattern.adapter;

public class PhoneAdapter implements RunnableWith200 {

    private Phone phone;

    public PhoneAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void run() {
        phone.run();
    }
}
