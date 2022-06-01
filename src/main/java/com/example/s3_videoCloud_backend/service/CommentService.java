package com.example.s3_videoCloud_backend.service;

import com.example.s3_videoCloud_backend.model.Comments;
import com.example.s3_videoCloud_backend.repositories.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.List;
import java.util.Optional;

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

    public  Optional<Comments> getCommentById(int id){
        return commentRepository.findById(id);
    }

    public void deleteComment(int commentId){
        boolean exists = commentRepository.existsById(commentId);
        if(!exists){
            throw new IllegalStateException("comment with id: " + commentId + " does not exist");
        }
        commentRepository.deleteById(commentId);
    }
}
