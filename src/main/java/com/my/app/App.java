package com.my.app;

import com.my.app.helper.Helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println("This is a Maven Project");
        Helper.help();

        SpringApplication.run(App.class, args);
    }
}
