package com.example.springexample;

import java.util.List;

public class Question {
    private int id;
    private String name;
    private List<String> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Question() {
    }

    public Question(int id, String name, List<String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("answers are:");
        for (String answer : answers) {
            System.out.println(answer);
        }
    }

}
