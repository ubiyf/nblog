package org.slf4j.impl;

import nblog.NonBlockLoggerFactory;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public final class StaticLoggerBinder implements LoggerFactoryBinder {

    public static String REQUESTED_API_VERSION = "1.7";

    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();

    private final ILoggerFactory loggerFactory;

    private static final String LOGGER_FACTORY_CLASS_STR = "NonBlockLogger";

    private StaticLoggerBinder() {
        loggerFactory = new NonBlockLoggerFactory();
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    @Override
    public ILoggerFactory getLoggerFactory() {
        return loggerFactory;
    }

    @Override
    public String getLoggerFactoryClassStr() {
        return LOGGER_FACTORY_CLASS_STR;
    }

}
