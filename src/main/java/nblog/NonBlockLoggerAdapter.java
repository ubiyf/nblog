package nblog;

import org.slf4j.Logger;
import org.slf4j.Marker;

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
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(String arg0, Object... arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(String arg0, Throwable arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(Marker arg0, String arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(String arg0, Object arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(Marker arg0, String arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(Marker arg0, String arg1, Object... arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(Marker arg0, String arg1, Throwable arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(String arg0) {
        if (isErrorEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.ERROR);
        }
    }

    @Override
    public void error(String arg0, Object arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(String arg0, Object... arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(String arg0, Throwable arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(Marker arg0, String arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(String arg0, Object arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(Marker arg0, String arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(Marker arg0, String arg1, Object... arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(Marker arg0, String arg1, Throwable arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
        // TODO Auto-generated method stub

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
        // TODO Auto-generated method stub

    }

    @Override
    public void info(String arg0, Object... arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void info(String arg0, Throwable arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void info(Marker arg0, String arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void info(String arg0, Object arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void info(Marker arg0, String arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void info(Marker arg0, String arg1, Object... arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void info(Marker arg0, String arg1, Throwable arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isDebugEnabled() {
        if (NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.DEBUG.getValue()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isDebugEnabled(Marker arg0) {
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        if (NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.ERROR.getValue()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isErrorEnabled(Marker arg0) {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        if (NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.INFO.getValue()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isInfoEnabled(Marker arg0) {
        return false;
    }

    @Override
    public boolean isTraceEnabled() {
        if (NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.TRACE.getValue()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isTraceEnabled(Marker arg0) {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        if (NonBlockLoggerConfig.getLevel().getValue() >= NonBlockLoggerLevel.WARN.getValue()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isWarnEnabled(Marker arg0) {
        return false;
    }

    @Override
    public void trace(String arg0) {
        if (isTraceEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.TRACE);
        }
    }

    @Override
    public void trace(String arg0, Object arg1) {

    }

    @Override
    public void trace(String arg0, Object... arg1) {

    }

    @Override
    public void trace(String arg0, Throwable arg1) {

    }

    @Override
    public void trace(Marker arg0, String arg1) {

    }

    @Override
    public void trace(String arg0, Object arg1, Object arg2) {

    }

    @Override
    public void trace(Marker arg0, String arg1, Object arg2) {

    }

    @Override
    public void trace(Marker arg0, String arg1, Object... arg2) {

    }

    @Override
    public void trace(Marker arg0, String arg1, Throwable arg2) {

    }

    @Override
    public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {

    }

    @Override
    public void warn(String arg0) {
        if (isWarnEnabled()) {
            logger.writeLog(arg0, NonBlockLoggerLevel.WARN);
        }
    }

    @Override
    public void warn(String arg0, Object arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(String arg0, Object... arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(String arg0, Throwable arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(Marker arg0, String arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(String arg0, Object arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(Marker arg0, String arg1, Object arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(Marker arg0, String arg1, Object... arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(Marker arg0, String arg1, Throwable arg2) {
        // TODO Auto-generated method stub

    }

    @Override
    public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
        // TODO Auto-generated method stub

    }

}
