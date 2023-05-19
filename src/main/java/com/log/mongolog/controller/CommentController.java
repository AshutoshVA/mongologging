package com.log.mongolog.controller;

import com.log.mongolog.model.Comment;
import com.log.mongolog.repository.CommentRepository;
import com.log.mongolog.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    LogService log;

    @PostMapping("/comments")
    public Comment createComment(@RequestBody Comment comment) {
        Date date = new Date();
        Comment savedComment = commentRepository.save(comment);
        log.info(date, CommentController.class.getName(), savedComment.toString());
        return savedComment;
    }

    @GetMapping("/comments")
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

}
