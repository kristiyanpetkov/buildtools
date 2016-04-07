package com.clouway;

import com.google.common.collect.Lists;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MyClass.class);
        BasicConfigurator.configure();
        logger.info("Hello World! This is my first Ant project!");
        List list = Lists.newArrayList();
    }
}
