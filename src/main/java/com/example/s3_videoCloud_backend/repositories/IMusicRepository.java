package com.example.s3_videoCloud_backend.repositories;

import com.example.s3_videoCloud_backend.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music, Integer> {

}
