package com.example.s3_videoCloud_backend.model;


import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(unique=true)
    public String comment;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    public Comments() {
    }

    public Comments(Integer id, User user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", Comment='" + comment + '\'' +
                '}';
    }
}

