package com.codeup.blog;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private long id;
    private String body;
    private String title;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public Post(String title, String body) {
        this.body = body;
        this.title = title;
    }
    public Post(String title, String body, long id) {
        this.body = body;
        this.title = title;
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
