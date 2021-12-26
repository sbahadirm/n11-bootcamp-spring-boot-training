package com.bahadirmemis.springboot.designpattern.adapter.adapter3.lib1;

public class Book {

    private Long bookId;
    private int pageCount;
    private String name;
    private String author;

    public Book(Long bookId, int pageCount, String name, String author) {
        this.bookId = bookId;
        this.pageCount = pageCount;
        this.name = name;
        this.author = author;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
