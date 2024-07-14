package com.desafio3Literalura.desafio3literalura;
import
import com.desafio3Literalura.desafio3literalura.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class desafio3lLiteraluraApplication implements CommandLineRunner{
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(desafio3lLiteraluraApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        Principal.muestraElMenu();


    }
}

