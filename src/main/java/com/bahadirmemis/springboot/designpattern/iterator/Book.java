package com.bahadirmemis.springboot.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {

    private String name;
    private List<Question> questionList;

    public Book(String name) {
        this.name = name;

        questionList = new ArrayList<>();

        questionList.add(new Question(1));
        questionList.add(new Question(2));
        questionList.add(new Question(3));
        questionList.add(new Question(4));
        questionList.add(new Question(5));
    }

    public String getName() {
        return name;
    }

    public Iterator<Question> getQuestionList() {
        return questionList.iterator();
    }
}
