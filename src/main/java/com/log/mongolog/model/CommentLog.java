package com.log.mongolog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "log")
@Data
public class CommentLog {

    @Transient
    public static final String SEQUENCE_NAME="log_sequence";

    @Id
    private long id;

    private String logDate;

    private String ClassName;

    private String jsonBody;
}
