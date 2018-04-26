package com.example.alexs.destinations2;

import java.io.Serializable;

public class Destination implements Serializable {

    private String name;

    public Destination(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
