package com.example.hello.model;

import com.example.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    private int value;
    @Autowired
    private LivreService livreService;

    // Getter
    public int getValue() {
        return value;
    }
    // Setter
    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "HelloWorld{" +
                "value=" + value +
                '}';
    }
}
