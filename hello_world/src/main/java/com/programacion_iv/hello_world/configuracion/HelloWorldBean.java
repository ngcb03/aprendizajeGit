package com.programacion_iv.hello_world.configuracion;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {

    public void helloWorld() {
        System.out.println("Hola Mundo desde Spring!");
    }
    
}
