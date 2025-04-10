package com.programacion_iv.hello_world;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {

    public void helloWorld() {
        System.out.println("Hola Mundo desde Spring!");
    }
    
}
