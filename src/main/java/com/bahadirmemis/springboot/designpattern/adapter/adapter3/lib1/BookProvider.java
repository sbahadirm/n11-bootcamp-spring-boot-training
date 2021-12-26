package com.bahadirmemis.springboot.designpattern.adapter.adapter3.lib1;

import java.util.Arrays;
import java.util.List;

public class BookProvider {

    public List<Book> getBooks(){

        List<Book> bookList = Arrays.asList(
                new Book(1L, 300, "Java", "Bahadır"),
                new Book(2L, 400, "Design Pattern", "Ahmet")
        );

        return bookList;
    }
}
