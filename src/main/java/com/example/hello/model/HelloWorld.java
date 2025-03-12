package com.example.hello.model;

public class HelloWorld {

    private int value=4;

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
