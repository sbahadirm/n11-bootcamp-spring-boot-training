package com.bahadirmemis.springboot.designpattern.command;

import java.math.BigDecimal;

public class Command2App {

    public static void main(String[] args) {

        BigDecimal number1 = BigDecimal.TEN;
        BigDecimal number2 = BigDecimal.ONE;

        BigDecimal add = Calculator2.calculate(new AddCalculateCommand(),
                number1, number2);
        System.out.println(add);

        BigDecimal sub = Calculator2.calculate(new SubCalculateCommand(),
                number1, number2);
        System.out.println(sub);

        BigDecimal rem = Calculator2.calculate(new RemCalculateCommand(),
                number1, BigDecimal.valueOf(3));
        System.out.println(rem);

    }
}
