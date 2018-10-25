package org.pignat.java.testing.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger log = LogManager.getLogger(Main.class);

	public static void main(String args[]) {
		log.info("Starting application");
		System.out.println("Hello World");
		log.debug("This is a debug message");
		log.info("This is an info message");
		log.warn("This is a warn message");
		log.error("This is an error message");
		log.fatal("This is a fatal message");
		log.info("Execution completed");
	}

}
