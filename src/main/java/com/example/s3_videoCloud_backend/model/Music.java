package com.example.s3_videoCloud_backend.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "music")
public class Music {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String name;
    @Column(unique=true)
    public String descr;
    public Integer am_of_listeners;
    public String file;
    public LocalDateTime created_at;
    //foreign key!
    public String creator;

    public Music(Integer id, String name, String descr, Integer am_of_listeners, String file, LocalDateTime created_at, String creator) {
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.am_of_listeners = am_of_listeners;
        this.file = file;
        this.created_at = created_at;
        this.creator = creator;
    }

    public Music() {}

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescr() {return descr;}

    public void setDescr(String descr) {this.descr = descr;}

    public Integer getAm_of_listeners() {return am_of_listeners;}

    public void setAm_of_listeners(Integer am_of_listeners) {this.am_of_listeners = am_of_listeners;}

    public String getFile() {return file;}

    public void setFile(String file) {this.file = file;}

    public LocalDateTime getCreated_at() {return created_at;}

    public void setCreated_at(LocalDateTime created_at) {this.created_at = created_at;}

    public String getCreator() {return creator;}

    public void setCreator(String creator) {this.creator = creator;}

    @Override
    public String toString() {
        return "Audio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descr='" + descr + '\'' +
                ", am_of_listeners=" + am_of_listeners +
                ", file='" + file + '\'' +
                ", created_at=" + created_at +
                ", creator='" + creator + '\'' +
                '}';
    }
}
