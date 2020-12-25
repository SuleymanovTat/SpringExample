package ru.suleymanovtat.model;

public class UserBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserBean(String name) {

        this.name = name;
    }
}
