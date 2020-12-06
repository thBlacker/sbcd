package com.cb.sbcd.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggManager {

    public static Logger getServiceLogger(){
        return LoggerFactory.getLogger("service");
    }

    public static Logger getLogger(Class<?> clazz){
        return LoggerFactory.getLogger("other");
    }

    public static Logger getOtherLogger(){
        return LoggerFactory.getLogger("other");
    }



//
    private final static Logger logger1 = LoggerFactory.getLogger(LoggManager.class);
    private final static Logger logger2 = LoggerFactory.getLogger("service");
    private final static Logger logger3 = LoggerFactory.getLogger("other");
    public static void main(String[] args) {
            logger1.info("logback 成功了");
            logger2.info("logback 成功了2");
            logger3.info("logback 成功了3");
    }

}
