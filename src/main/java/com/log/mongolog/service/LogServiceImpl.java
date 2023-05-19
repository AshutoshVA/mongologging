package com.log.mongolog.service;

import com.log.mongolog.model.CommentLog;
import com.log.mongolog.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class LogServiceImpl implements LogService {


    @Autowired
    private LogRepository logRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @Override
    public CommentLog info(Date logDate, String className, String jsonBody) {
        CommentLog log = new CommentLog();
        log.setId(sequenceGeneratorService.gerateSequence(CommentLog.SEQUENCE_NAME));
        log.setLogDate(logDate.toString());
        log.setClassName(className);
        log.setJsonBody(jsonBody);

        return logRepository.save(log);
    }

    @Override
    public List<CommentLog> getAllLogs() {
        return null;
    }

    @Override
    public CommentLog getLogById(long logId) {
        return null;
    }
}
