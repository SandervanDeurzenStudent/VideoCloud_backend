package com.example.s3_videoCloud_backend.controller;

import com.example.s3_videoCloud_backend.model.Comments;
import com.example.s3_videoCloud_backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/details/{commentId}")
    public Optional<Comments> getCommentsById(@PathVariable int commentId) {
        return commentService.getCommentById(commentId);
    }

    @DeleteMapping("delete/{commentId}")
    public void deleteComment(@PathVariable("commentId") int commentId) {
        commentService.deleteComment(commentId);
    }

}
