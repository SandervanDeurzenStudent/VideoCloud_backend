package com.example.s3_videoCloud_backend.controller;

import com.example.s3_videoCloud_backend.model.Comments;
import com.example.s3_videoCloud_backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comments> getComments(){
        return commentService.getComments();
    }
}
