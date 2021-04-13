package com.example.springexample;

import java.util.List;

public class QuestionCollectionList {
    private int id;
    private String name;
    private List<Answer> answers;

    public QuestionCollectionList() {
    }

    public QuestionCollectionList(int id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("answers are:");
        for (Answer answer : answers) {
            System.out.println(answer);
        }
    }

}
