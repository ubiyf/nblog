package nblog;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class NonBlockLoggerFactory implements ILoggerFactory {

    ConcurrentMap<String, Logger> loggerMap;

    public NonBlockLoggerFactory() {
        loggerMap = new ConcurrentHashMap<>();
    }

    @Override
    public Logger getLogger(String name) {
        Logger slf4jLogger = loggerMap.get(name);
        if (slf4jLogger != null) {
            return slf4jLogger;
        } else {
            NonBlockLogger log4jLogger = new NonBlockLogger(name);

            Logger newInstance = new NonBlockLoggerAdapter(log4jLogger);
            Logger oldInstance = loggerMap.putIfAbsent(name, newInstance);
            return oldInstance == null ? newInstance : oldInstance;
        }
    }

}
