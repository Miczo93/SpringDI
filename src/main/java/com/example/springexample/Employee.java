package com.example.springexample;

public class Employee {
    private int id;
    private String name;
    private Address address;//Aggregation
    private String city;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
        System.out.println("def cons");
    }


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    void show() {
        System.out.println(id + " " + name);
        System.out.println(address.toString());
    }

    void showsimple() {
        System.out.println(id + " " + name);
    }

    void display() {
        System.out.println(id + " " + name + " " + city);
    }

}
