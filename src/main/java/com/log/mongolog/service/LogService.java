package com.log.mongolog.service;

import com.log.mongolog.model.CommentLog;

import java.util.Date;
import java.util.List;


public interface LogService {
    CommentLog info(Date logDate, String className, String jsonBody);


    List<CommentLog> getAllLogs();

    CommentLog getLogById(long logId);
}
