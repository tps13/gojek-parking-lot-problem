package com.gojek;

import static org.junit.Assert.assertTrue;

import com.tps.constants.Command;

public class CommandsTest {
	
    public void testCommandNegative() throws Exception {
    	Command command = Command.findByCommandName("create_parking_lot----null");
    	assertTrue(command == null);
    }
    
    
    public void testCommandPositive() throws Exception {
    	Command command = Command.findByCommandName("create_parking_lot");
    	assertTrue(command != null);
    }
}