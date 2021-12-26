package com.bahadirmemis.springboot.designpattern.iterator;

import java.util.Iterator;

public class QuestionIterator implements Iterator {

    private Question[] questions;
    private int count;

    public QuestionIterator(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public boolean hasNext() {

        if (count < questions.length){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {

        Question question = questions[count];
        count++;

        return question;
    }
}
