package datastructure;

/* 
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

/*
 * Enum for Options in Menu Driven Program
 */

public enum PrintOptions {

	ADD_FIRST(0),
	ADD_LAST(1),
	ADD_AFTER(2),
	DELETE_FIRST(3),
	DELETE_LAST(4),
	DELETE_AFTER(5),
	TRAVERSE(6),
	EXIT(7);
	
	
	private int value;
	
	private PrintOptions(int value) {
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public static PrintOptions getEnum(int value)
	{
		for (PrintOptions option : PrintOptions.values()) {
			if(option.getValue() == value)
				return option;
		}
		throw new IllegalStateException();
	}

}
