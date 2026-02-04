package com.gevernova.entity;

public class Greeting {

    private int id;
    private String message;

    // constructors
    public Greeting() {}

    public Greeting(int id, String message) {
        this.id = id;
        this.message = message;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
