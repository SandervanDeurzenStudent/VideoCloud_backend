package com.example.s3_videoCloud_backend.service;

import com.example.s3_videoCloud_backend.model.Comments;
import com.example.s3_videoCloud_backend.repositories.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.List;

@Service
public class CommentService {

    private final ICommentRepository commentRepository;

    @Autowired
    public CommentService(ICommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comments> getComments(){
        return commentRepository.findAll();
    }
}
