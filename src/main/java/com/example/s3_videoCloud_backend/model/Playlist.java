package com.example.s3_videoCloud_backend.model;

import javax.persistence.*;

@Entity
@Table(name = "Playlists")
public class Playlist {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Integer amOfSongs;
    public String name;




}
