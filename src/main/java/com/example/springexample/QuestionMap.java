package com.example.springexample;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class QuestionMap {
    private int id;
    private String name;
    private Map<String, String> answers;

    public QuestionMap() {
    }

    public QuestionMap(int id, String name, Map<String, String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println("question id:" + id);
        System.out.println("question name:" + name);
        System.out.println("Answers....");
        Set<Entry<String, String>> set = answers.entrySet();
        for (Entry<String, String> entry : set) {
            System.out.println("Answer:" + entry.getKey() + " Posted By:" + entry.getValue());
        }
    }
}
