package com.example.BookReview.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_detail")
public class UserDetail {

    private String id;  // This will be manually set by the user in the POST request

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
