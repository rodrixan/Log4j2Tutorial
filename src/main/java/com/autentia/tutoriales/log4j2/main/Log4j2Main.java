package com.autentia.tutoriales.log4j2.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Main {

    private static final int NUM_OF_ITERATIONS = 50;

    private static final int MILLISECONDS_TO_SLEEP = 2000;

    private static final Logger LOG = LogManager.getLogger(Log4j2Main.class);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {

            LOG.trace("Mensaje de trace");
            LOG.debug("Mensaje de debug");
            LOG.info("Mensaje de info");
            LOG.warn("Mensaje de warn");
            LOG.error("Mensaje de error");

            // para separar las iteraciones
            System.out.println();

            Thread.sleep(MILLISECONDS_TO_SLEEP);
        }
    }
}
