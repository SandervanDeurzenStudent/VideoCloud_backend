package com.example.PIM.repositories;

import com.example.PIM.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music, Integer> {

}
