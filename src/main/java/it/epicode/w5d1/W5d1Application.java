package it.epicode.w5d1;

import it.epicode.w5d1.bean.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(W5d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Persona persona = ctx.getBean("p1", Persona.class);

		persona.setNome("Katia");

		System.out.println(persona);

		Persona persona2 = (Persona)ctx.getBean("p2");
		persona2.setNome("Roberto");

		System.out.println(persona2);

		Persona persona3 = ctx.getBean("p1", Persona.class);

		System.out.println(persona3);

		Persona persona4 = (Persona)ctx.getBean("p2");

		System.out.println(persona4);

		Persona persona5 = (Persona)ctx.getBean("personaConVeicoli");

		persona5.stampaPersona();


	}

}
