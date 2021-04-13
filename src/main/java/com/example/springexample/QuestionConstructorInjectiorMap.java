package com.example.springexample;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class QuestionConstructorInjectiorMap {
    private int id;
    private String name;
    private Map<Answer, User> answers;

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

    public Map<Answer, User> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Answer, User> answers) {
        this.answers = answers;
    }

    public QuestionConstructorInjectiorMap() {
    }

    public QuestionConstructorInjectiorMap(int id, String name, Map<Answer, User> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }


    public void displayInfo() {
        System.out.println("question id:" + id);
        System.out.println("question name:" + name);
        System.out.println("Answers....");
        Set<Entry<Answer, User>> set = answers.entrySet();
        for (Entry<Answer, User> entry : set) {
            Answer ans = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer Information:");
            System.out.println(ans);
            System.out.println("Posted By:");
            System.out.println(user);
        }
    }
}
