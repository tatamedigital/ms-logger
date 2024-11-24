package br.com.tatame.logger.entity;

import java.time.LocalDateTime;

public class LogEntry {
    private String message;
    private final LocalDateTime timestamp = LocalDateTime.now();

    public LogEntry(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }


}
