package com.log.mongolog.repository;

import com.log.mongolog.model.CommentLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<CommentLog, Long> {
}
