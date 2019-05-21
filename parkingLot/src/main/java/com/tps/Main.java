package com.tps;

import com.tps.executor.AbstractProcessor;
import com.tps.executor.FileProcessor;
import com.tps.executor.InteractiveParkingLotProcessor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		AbstractProcessor processor = null;
		
		if(args.length >= 1) {
			processor = new FileProcessor(args[0]);
		} else {
			processor = new InteractiveParkingLotProcessor();
		}
		processor.process();
	}

}
