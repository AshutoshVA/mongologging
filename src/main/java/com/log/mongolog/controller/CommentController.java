package com.log.mongolog.controller;

import com.log.mongolog.model.Comment;
import com.log.mongolog.repository.CommentRepository;
import com.log.mongolog.service.LogService;
import lombok.extern.slf4j.Slf4j;
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
        log.info(date, CommentController.class.getName(), comment.toString());
        return commentRepository.save(comment);
    }

    @GetMapping("/comments")
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

}
