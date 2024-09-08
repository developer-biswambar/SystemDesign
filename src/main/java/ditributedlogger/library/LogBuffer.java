package ditributedlogger.library;

import java.util.ArrayList;
import java.util.List;

public class LogBuffer {
    private static final int MAX_BUFFER_SIZE = 10;

    private List<LogMessage> buffer;

    public LogBuffer() {
        this.buffer = new ArrayList<>();
    }

    public void addToBuffer(LogMessage message) {
        buffer.add(message);
    }

    public boolean isFull() {
        return buffer.size() == MAX_BUFFER_SIZE;
    }

    public List<LogMessage> getBufferedLogs() {
        return new ArrayList<>(buffer);
    }

    public void clear() {
        buffer.clear();
    }
}
