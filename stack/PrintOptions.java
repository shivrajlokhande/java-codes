package datastructure;
/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

/*
 * Enum for Options in Menu Driven Program
 */

public enum PrintOptions {

	PUSH(0),
	POP(1),
	PEEK(2),
	TRAVERSE(3),
	EXIT(4);
	
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
