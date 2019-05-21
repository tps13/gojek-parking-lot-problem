package com.tps.constants;

public enum Command {
    CREATE("create_parking_lot"),
    PARK("park"),
    LEAVE("leave"),
    STATUS("status"),
    FETCH_CARE_FROM_COLOR("registration_numbers_for_cars_with_colour"),
    FETCH_SLOT_FROM_COLOR("slot_numbers_for_cars_with_colour"),
    FETCH_SLOT_FROM_REG_NO("slot_number_for_registration_number");
    
    private final String command;
	
	private Command(String command) {
        this.command = command;
    }
	
	public static Command findByCommandName(String abbr){
	    for(Command c : values()){
	        if( c.toString().equals(abbr)){
	            return c;
	        }
	    }
	    return null;
	}
	
	public boolean equalsCommand(String otherCommand) {
        return command.equals(otherCommand);
    }

    public String toString() {
       return command;
    }
    
    public static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
        if( c != null && string != null ) {
            try {
                return Enum.valueOf(c, string.trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
            }
        }
        return null;
    }
}
