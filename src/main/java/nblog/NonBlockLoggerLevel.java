package nblog;

public enum NonBlockLoggerLevel {

    TRACE(5), DEBUG(4), INFO(3), WARN(2), ERROR(1), OFF(0);

    private final int value;

    private NonBlockLoggerLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
