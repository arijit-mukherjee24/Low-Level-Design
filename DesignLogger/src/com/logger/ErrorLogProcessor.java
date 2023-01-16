package com.logger;

public class ErrorLogProcessor extends LogProcessor {

	ErrorLogProcessor(LogProcessor nexLogProcessor) {
		super(nexLogProcessor);
	}

	public void log(int logLevel, String message) {

		if (logLevel == ERROR) {
			System.out.println("ERROR: " + message);
		} else {
			System.out.println("Unknown Logging Level: " + message);
			super.log(logLevel, message);
		}

	}
}