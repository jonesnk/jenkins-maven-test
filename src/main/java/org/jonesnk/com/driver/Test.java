package org.jonesnk.com.driver;

import org.apache.log4j.Logger;

public class Test {

    private static final Logger logger = Logger.getLogger(Test.class);

    private Test(){}

    public static void main (String[] args){

        logger.info("Hello Jenkins Maven, it's Nicole!");

    }
}
