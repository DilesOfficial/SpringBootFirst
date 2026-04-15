package com.dilusha.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling Desktop...");
    }
}
