package org.biswa.ditributedlogger.library;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class LogMessage {

    private final LocalDateTime timeStamp;
    private final String message;
    private final LogLevel logLevel;

    public LogMessage(String message, LogLevel logLevel) {
        this.timeStamp = LocalDateTime.now();
        this.message = message;
        this.logLevel = logLevel;
    }

    @Override
    public String toString() {
        return "[" + "timeStamp=" + timeStamp + ", message='" + message + ", logLevel=" + logLevel + ']';
    }
}
