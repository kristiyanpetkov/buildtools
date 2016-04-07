package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Created by clouway on 16-4-1.
 */
public class MyBuisnessObject {
    private static final Logger logger = Logger.getLogger(MyBuisnessObject.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Hello! This is my myproject-bo class!");
    }
}
