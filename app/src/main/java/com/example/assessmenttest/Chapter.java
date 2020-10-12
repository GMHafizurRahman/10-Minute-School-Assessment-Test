package com.example.assessmenttest;

import java.util.ArrayList;

public class Chapter {
    public String name;
    public String image;
    public ArrayList<String> topics = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
