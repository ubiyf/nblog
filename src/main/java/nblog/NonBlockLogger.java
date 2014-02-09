package nblog;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import java.util.Date;
import java.util.concurrent.Executors;

public class NonBlockLogger {

    private String loggerName;

    private static final Disruptor<NonBlockLogEvent> logDisruptor = new Disruptor<>(
            NonBlockLogEventFactory.getInstance(),
            NonBlockLoggerConfig.getLogMsgBufferSize(),
            Executors.newFixedThreadPool(1),
            ProducerType.MULTI,
            new BlockingWaitStrategy());

    static {
        logDisruptor.handleEventsWith(NonBlockLogEventHandler.getInstance());
        logDisruptor.start();
    }

    public NonBlockLogger(String loggerName) {
        super();
        this.loggerName = loggerName;
    }

    public void writeLog(String logMsg, NonBlockLoggerLevel level) {
        String detailMsg = addLogPrefix(logMsg, level);
        logDisruptor.publishEvent(NonBlockLogEventTransaltor.getInstance(), detailMsg);
    }

    public String getName() {
        return loggerName;
    }

    private String addLogPrefix(String logMsg, NonBlockLoggerLevel level) {
        Date d = new Date();
        return String.format("%1$tF %1$tT:%1$tL [%2$s] %3$s %4$s %5$s\r\n", d, level, Thread.currentThread().getName(), loggerName, logMsg);
    }

}
