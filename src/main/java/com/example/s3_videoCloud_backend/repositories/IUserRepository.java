package com.example.s3_videoCloud_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.s3_videoCloud_backend.model.User;
public interface IUserRepository extends JpaRepository<User, Integer>
{

}
