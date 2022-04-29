package com.example.s3_videoCloud_backend.model;


import javax.persistence.*;

@Entity
@Table(name = "User")
public class Comments {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String user;
    @Column(unique=true)
    public String Comment;

    public Comments() {
    }

    public Comments(Integer id, String user, String comment) {
        this.id = id;
        this.user = user;
        Comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", Comment='" + Comment + '\'' +
                '}';
    }
}

