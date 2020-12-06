package com.example.demo.model;

import java.util.UUID;

public class Book {

    private int id;
    private String name;
    private String authorName;
    private Boolean available;

    public Book(){

    }

    public Book(int id, String name, String authorName, Boolean available) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.available = available;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
