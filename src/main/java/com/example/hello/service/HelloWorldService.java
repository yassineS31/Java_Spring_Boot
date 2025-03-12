package com.example.hello.service;

import com.example.hello.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class  HelloWorldService {
    public static  HelloWorld getHelloWorld() {

        return new HelloWorld();
    }


}