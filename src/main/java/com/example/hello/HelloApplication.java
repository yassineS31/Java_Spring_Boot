package com.example.hello;

import com.example.hello.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.hello.service.HelloWorldService.getHelloWorld;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {

    @Autowired
    public HelloWorldService helloworldService;

    public static void main(String[] args) {

        SpringApplication.run(HelloApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(getHelloWorld().toString());

    }


}