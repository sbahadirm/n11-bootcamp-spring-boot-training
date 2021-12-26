package com.bahadirmemis.springboot.designpattern.iterator;

import java.util.*;

public class IteratorApp {

    public static void main(String[] args) {

        Book javaBook = new Book("Java");
        Iterator<Question> javaBookQuestionIter = javaBook.getQuestionList();

        PilotTest oss = new PilotTest("ÖSS");
        QuestionIterator ossQuestionIter = oss.getQuestions();

        printIter(javaBookQuestionIter);
        printIter(ossQuestionIter);

    }

    private static void printIter(Iterator<Question> javaBookQuestionIter) {
        while (javaBookQuestionIter.hasNext()){
            Question question = javaBookQuestionIter.next();

            System.out.println(question.getId());
        }
    }

//    private static void print(List<Question> questionList) {
//        for (Question question : questionList) {
//            System.out.println(question.getId());
//        }
//    }

//    private static Set<Question> getQuestionSetFromPilotTest() {
//        Set<Question> questionSet = new HashSet<>();
//        questionSet.add(new Question(4));
//        questionSet.add(new Question(5));
//        return questionSet;
//    }

    private static List<Question> getQuestionListFromBook() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question(1));
        questionList.add(new Question(2));
        questionList.add(new Question(3));
        return questionList;
    }
}
