package com.bahadirmemis.springboot.designpattern.adapter.adapter3.lib2;

public class Library {

    public void print(LibBook libBook){

        String info = "id=" + libBook.getId() +
                ", author='" + libBook.getAuthor() + '\'' +
                ", name='" + libBook.getName();

        System.out.println(info);
    }
}
