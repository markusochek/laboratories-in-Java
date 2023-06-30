package primitive;

public abstract class Primitive {
	private int value;
	
	
	public Primitive(int value) {	
		this.value = value;
	}
	
	public Primitive() {	
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value + "}";
	}
}
