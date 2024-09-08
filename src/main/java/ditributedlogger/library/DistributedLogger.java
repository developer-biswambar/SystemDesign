package ditributedlogger.library;

import ditributedlogger.client.LogClient;

public class DistributedLogger implements Logger {

    private final LogLevel logLevel;
    private final LogBuffer logBuffer;
    private final LogClient logClient;


    public DistributedLogger(LogLevel logLevel, LogClient logClient) {
        this.logLevel = logLevel;
        this.logClient = logClient;
        this.logBuffer = new LogBuffer();
    }

    @Override
    public void log(LogMessage logMessage) {
        if (logMessage.getLogLevel().ordinal() < logLevel.ordinal()) {
            return;
        }
        logBuffer.addToBuffer(logMessage);
        if (logBuffer.isFull()) {
            flushLogs();
        }

    }

    private void flushLogs() {

        logClient.sendLogsToServer(logBuffer.getBufferedLogs());
        logBuffer.clear();
    }
}
