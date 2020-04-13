package datastructure;
/*
 * @author Shivraj Lokhande (https://github.com/shivrajlokhande)
 */

/*
 * Enum for Options in Menu Driven Program
 */

public enum PrintOptions {

	ENQUEUE(0),
	DEQUEUE(1),
	TRAVERSE(2),
	EXIT(3);
	
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
