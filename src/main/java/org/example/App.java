package org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOG= LogManager.getLogger();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String message="hi";
        LOG.info("info");
        LOG.error("Error");
        LOG.debug(message+"Debug");
        LOG.fatal("fatal");
    }
}
