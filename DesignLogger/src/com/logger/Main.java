package com.logger;

public class Main {

	public static void main(String[] args) {
		LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

		logObject.log(LogProcessor.ERROR, "exception happens");
		logObject.log(LogProcessor.DEBUG, "need to debug this ");
		logObject.log(LogProcessor.INFO, "just for info ");

	}

}

/*
Output:

ERROR: exception happens
DEBUG: need to debug this 
INFO: just for info

*/