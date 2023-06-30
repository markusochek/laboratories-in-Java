package identifier;

import primitive.Primitive;

public class Identifier extends Primitive {
	private String name; 
	
	public Identifier() {
		super();
	}
	
	public Identifier(String name, int value) {
		super(value);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "{'" + name + "', " + super.toString();
	}
}
