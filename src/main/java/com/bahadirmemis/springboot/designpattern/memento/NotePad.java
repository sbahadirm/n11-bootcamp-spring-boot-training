package com.bahadirmemis.springboot.designpattern.memento;

import java.util.Scanner;

public class NotePad {

    public void open(){

        Memory memory = new Memory();

        String fullText = "";
        String text = "";

        while (!"exit".equalsIgnoreCase(text)){

            text = getInput();

            if ("exit".equalsIgnoreCase(text)){
                System.out.println("Exit");
            } else if ("undo".equalsIgnoreCase(text)){
                Memento memento = memory.undo();
                String textLast = memento.getText();

                fullText = fullText.substring(0, fullText.length() - textLast.length());

            } else if ("next".equalsIgnoreCase(text)){
                Memento memento = memory.next();
                String textLast = memento.getText();

                fullText = fullText + textLast;

            } else {

                Memento memento = new Memento(text);
                memory.add(memento);

                fullText = fullText + text;
            }

            System.out.println(fullText);
        }
    }

    private String getInput(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        return text;
    }
}
