package com.programacion_iv.hello_world;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.programacion_iv.hello_world.configuracion.Config;
import com.programacion_iv.hello_world.configuracion.HelloWorldBean;

public class HelloWorldApplication {

	public static void main(String[] args) {
		var contexto = new AnnotationConfigApplicationContext(Config.class)	;
		HelloWorldBean helloWorldBean = contexto.getBean(HelloWorldBean.class);
		helloWorldBean.helloWorld();

		// cerramos contexto
		contexto.close();
		
	}

}
