package com.bahadirmemis.springboot.designpattern.command.badway;

import java.math.BigDecimal;

public class Calculator {

    public static BigDecimal calculate(Type type, BigDecimal number1, BigDecimal number2){

        BigDecimal result;
        if (Type.ADD.equals(type)){
            result = number1.add(number2);
        } else if (Type.SUB.equals(type)){
            result = number1.subtract(number2);
        } else if (Type.MUL.equals(type)){
            result = number1.multiply(number2);
        } else if (Type.DIV.equals(type)){
            result = number1.divide(number2);
        }  else if (Type.REM.equals(type)){
            result = number1.remainder(number2);
        } else {
            throw new RuntimeException("Error");
        }

        return result;
    }
}
