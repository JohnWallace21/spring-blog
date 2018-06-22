package com.codeup.blog;

import javax.persistence.*;


@Entity
@Table(name = "posts")
public class Post {

    @Id @GeneratedValue
    private long id;

    @Column(name = "post_title", nullable = false, length = 100)
    private String title;

    @Column(name = "post_body", nullable = false, length = 1000)
    private String body;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Post(){};

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
