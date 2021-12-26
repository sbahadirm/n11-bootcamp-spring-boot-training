package com.bahadirmemis.springboot.designpattern.command;

import java.math.BigDecimal;

public class AddCalculateCommand implements CalculateCommand {

    @Override
    public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
        return number1.add(number2);
    }
}
