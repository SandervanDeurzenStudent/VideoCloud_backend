package com.example.PIM.model;

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
