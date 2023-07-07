package br.com.erudito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Startup {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        SpringApplication.run(Startup.class, args);
    }

}
