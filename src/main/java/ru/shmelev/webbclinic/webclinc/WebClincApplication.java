package ru.shmelev.webbclinic.webclinc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:database.properties")
public class WebClincApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClincApplication.class, args);
    }

}
