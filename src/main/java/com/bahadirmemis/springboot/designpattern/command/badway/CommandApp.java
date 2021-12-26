package com.bahadirmemis.springboot.designpattern.command.badway;

import java.math.BigDecimal;

public class CommandApp {

    public static void main(String[] args) {
        BigDecimal calculate = Calculator.calculate(Type.ADD, BigDecimal.ONE, BigDecimal.TEN);
        System.out.println(calculate);

        BigDecimal rem = Calculator.calculate
                (Type.REM, BigDecimal.TEN, BigDecimal.valueOf(3));
        System.out.println(rem);

    }
}
