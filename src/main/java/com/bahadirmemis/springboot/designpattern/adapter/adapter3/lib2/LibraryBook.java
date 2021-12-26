package com.bahadirmemis.springboot.designpattern.adapter.adapter3.lib2;

public class LibraryBook implements LibBook{

    private Integer id;
    private String author;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
