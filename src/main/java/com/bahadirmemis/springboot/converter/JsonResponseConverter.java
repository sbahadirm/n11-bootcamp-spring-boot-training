package com.bahadirmemis.springboot.converter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("json")
@Primary
public class JsonResponseConverter implements ResponseConverter {

    @Override
    public void convert() {
        System.out.println("json");
    }
}
