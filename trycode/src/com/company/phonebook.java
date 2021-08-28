package com.company;

public class phonebook {
    String name;
    String phone;

    public phonebook() {
    }

    public phonebook(String n, String p) {
        name=n;
        phone=p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

