package com.bahadirmemis.springboot.designpattern.command;

import java.math.BigDecimal;

public class Calculator2 {

    public static BigDecimal calculate(CalculateCommand calculateCommand,
                                       BigDecimal number1, BigDecimal number2){

        return calculateCommand.calculate(number1, number2);
    }
}
