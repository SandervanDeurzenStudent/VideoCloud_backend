package com.example.s3_videoCloud_backend.repositories;

import com.example.s3_videoCloud_backend.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ICommentRepository extends JpaRepository<Comments, Integer>
{

}
