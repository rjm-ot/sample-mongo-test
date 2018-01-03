package com.ot.sample.mongo;

import org.springframework.data.annotation.Id;


public class Book {

    @Id
    public String id;

    public String title;
    public String description;

    public Book() {}

    public Book(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%s, title='%s', description='%s']",
                id, title, description);
    }

}

