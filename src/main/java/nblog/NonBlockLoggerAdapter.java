package nblog;

import org.slf4j.Logger;
import org.slf4j.Marker;

import java.io.PrintWriter;
import java.io.StringWriter;

public class NonBlockLoggerAdapter implements Logger {

    private final NonBlockLogger logger;

    public NonBlockLoggerAdapter(NonBlockLogger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public void debug(String arg0) {
        if (isDebugEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.DEBUG);
        }
    }

    @Override
    public void debug(String arg0, Object arg1) {
        if (isDebugEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.DEBUG);
        }
    }

    @Override
    public void debug(String arg0, Object... arg1) {
        if (isDebugEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.DEBUG);
        }
    }

    @Override
    public void debug(String arg0, Throwable arg1) {
        if (isDebugEnabled()) {
            String stackTrace = getFullStackTraceText(arg0, arg1);
            logger.writeLog(stackTrace, NonBlockLoggerLevel.DEBUG);
        }
    }

    @Override
    public void debug(Marker arg0, String arg1) {
        debug(arg1);
    }

    @Override
    public void debug(String arg0, Object arg1, Object arg2) {
        if (isDebugEnabled()) {
            String text = String.format(arg0, arg1, arg2);
            logger.writeLog(text, NonBlockLoggerLevel.DEBUG);
        }
    }

    @Override
    public void debug(Marker arg0, String arg1, Object arg2) {
        debug(arg1, arg2);
    }

    @Override
    public void debug(Marker arg0, String arg1, Object... arg2) {
        debug(arg1, arg2);
    }

    @Override
    public void debug(Marker arg0, String arg1, Throwable arg2) {
        debug(arg1, arg2);
    }

    @Override
    public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
        debug(arg1, arg2, arg3);
    }

    @Override
    public void error(String arg0) {
        if (isErrorEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.ERROR);
        }
    }

    @Override
    public void error(String arg0, Object arg1) {
        if (isErrorEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.ERROR);
        }
    }

    @Override
    public void error(String arg0, Object... arg1) {
        if (isErrorEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.ERROR);
        }
    }

    @Override
    public void error(String arg0, Throwable arg1) {
        if (isErrorEnabled()) {
            String stackTrace = getFullStackTraceText(arg0, arg1);
            logger.writeLog(stackTrace, NonBlockLoggerLevel.ERROR);
        }
    }

    private String getFullStackTraceText(String arg0, Throwable arg1) {
        StringWriter writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(arg0);
        arg1.printStackTrace(printWriter);
        printWriter.flush();
        return writer.toString();
    }

    @Override
    public void error(Marker arg0, String arg1) {
        error(arg1);
    }

    @Override
    public void error(String arg0, Object arg1, Object arg2) {
        if (isErrorEnabled()) {
            String text = String.format(arg0, arg1, arg2);
            logger.writeLog(text, NonBlockLoggerLevel.ERROR);
        }
    }

    @Override
    public void error(Marker arg0, String arg1, Object arg2) {
        error(arg1, arg2);
    }

    @Override
    public void error(Marker arg0, String arg1, Object... arg2) {
        error(arg1, arg2);
    }

    @Override
    public void error(Marker arg0, String arg1, Throwable arg2) {
        error(arg1, arg2);
    }

    @Override
    public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
        error(arg1, arg2, arg3);
    }

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public void info(String arg0) {
        if (isInfoEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.INFO);
        }
    }

    @Override
    public void info(String arg0, Object arg1) {
        if (isInfoEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.INFO);
        }
    }

    @Override
    public void info(String arg0, Object... arg1) {
        if (isInfoEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.INFO);
        }
    }

    @Override
    public void info(String arg0, Throwable arg1) {
        if (isInfoEnabled()) {
            String stackTrace = getFullStackTraceText(arg0, arg1);
            logger.writeLog(stackTrace, NonBlockLoggerLevel.INFO);
        }
    }

    @Override
    public void info(Marker arg0, String arg1) {
        info(arg1);
    }

    @Override
    public void info(String arg0, Object arg1, Object arg2) {
        if (isInfoEnabled()) {
            String text = String.format(arg0, arg1, arg2);
            logger.writeLog(text, NonBlockLoggerLevel.INFO);
        }
    }

    @Override
    public void info(Marker arg0, String arg1, Object arg2) {
        info(arg1, arg2);
    }

    @Override
    public void info(Marker arg0, String arg1, Object... arg2) {
        info(arg1, arg2);
    }

    @Override
    public void info(Marker arg0, String arg1, Throwable arg2) {
        info(arg1, arg2);
    }

    @Override
    public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
        info(arg1, arg2, arg3);
    }

    @Override
    public boolean isDebugEnabled() {
        return NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.DEBUG.getValue();
    }

    @Override
    public boolean isDebugEnabled(Marker arg0) {
        return isDebugEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.ERROR.getValue();
    }

    @Override
    public boolean isErrorEnabled(Marker arg0) {
        return isErrorEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.INFO.getValue();
    }

    @Override
    public boolean isInfoEnabled(Marker arg0) {
        return isInfoEnabled();
    }

    @Override
    public boolean isTraceEnabled() {
        return NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.TRACE.getValue();
    }

    @Override
    public boolean isTraceEnabled(Marker arg0) {
        return isTraceEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.WARN.getValue();
    }

    @Override
    public boolean isWarnEnabled(Marker arg0) {
        return isWarnEnabled();
    }

    @Override
    public void trace(String arg0) {
        if (isTraceEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.TRACE);
        }
    }

    @Override
    public void trace(String arg0, Object arg1) {
        if (isTraceEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.TRACE);
        }
    }

    @Override
    public void trace(String arg0, Object... arg1) {
        if (isInfoEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.TRACE);
        }
    }

    @Override
    public void trace(String arg0, Throwable arg1) {
        if (isTraceEnabled()) {
            String stackTrace = getFullStackTraceText(arg0, arg1);
            logger.writeLog(stackTrace, NonBlockLoggerLevel.TRACE);
        }
    }

    @Override
    public void trace(Marker arg0, String arg1) {
        trace(arg1);
    }

    @Override
    public void trace(String arg0, Object arg1, Object arg2) {
        if (isInfoEnabled()) {
            String text = String.format(arg0, arg1, arg2);
            logger.writeLog(text, NonBlockLoggerLevel.TRACE);
        }
    }

    @Override
    public void trace(Marker arg0, String arg1, Object arg2) {
        trace(arg1, arg2);
    }

    @Override
    public void trace(Marker arg0, String arg1, Object... arg2) {
        trace(arg1, arg2);
    }

    @Override
    public void trace(Marker arg0, String arg1, Throwable arg2) {
        trace(arg1, arg2);
    }

    @Override
    public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
        trace(arg1, arg2, arg3);
    }

    @Override
    public void warn(String arg0) {
        if (isWarnEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.WARN);
        }
    }

    @Override
    public void warn(String arg0, Object arg1) {
        if (isWarnEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.WARN);
        }
    }

    @Override
    public void warn(String arg0, Object... arg1) {
        if (isWarnEnabled()) {
            String text = String.format(arg0, arg1);
            logger.writeLog(text, NonBlockLoggerLevel.WARN);
        }
    }

    @Override
    public void warn(String arg0, Throwable arg1) {
        if (isWarnEnabled()) {
            String stackTrace = getFullStackTraceText(arg0, arg1);
            logger.writeLog(stackTrace, NonBlockLoggerLevel.WARN);
        }
    }

    @Override
    public void warn(Marker arg0, String arg1) {
        warn(arg1);
    }

    @Override
    public void warn(String arg0, Object arg1, Object arg2) {
        if (isWarnEnabled()) {
            String text = String.format(arg0, arg1, arg2);
            logger.writeLog(text, NonBlockLoggerLevel.WARN);
        }
    }

    @Override
    public void warn(Marker arg0, String arg1, Object arg2) {
        warn(arg1, arg2);
    }

    @Override
    public void warn(Marker arg0, String arg1, Object... arg2) {
        warn(arg1, arg2);
    }

    @Override
    public void warn(Marker arg0, String arg1, Throwable arg2) {
        warn(arg1, arg2);
    }

    @Override
    public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
       warn(arg1, arg2, arg3);
    }

}
