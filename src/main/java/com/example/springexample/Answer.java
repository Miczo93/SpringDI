package com.example.springexample;

import java.util.Date;

public class Answer {
    private int id;
    private String name;
    private String by;
    private Date postedDate;
    private String answer;

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

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

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public Answer() {
    }

    public Answer(int id, String name, String by) {
        this.id = id;
        this.name = name;
        this.by = by;
    }

    public Answer(int id, String answer, Date postedDate) {
        this.id = id;
        this.answer = answer;
        this.postedDate = postedDate;
    }


    public String toString() {
        return id + " " + name + " " + by;
    }

    public String toString2() {
        return "Id:" + id + " Answer:" + answer + " Posted Date:" + postedDate;
    }

}
