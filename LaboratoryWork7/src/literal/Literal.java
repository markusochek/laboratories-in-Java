package literal;

import primitive.Primitive;

public class Literal extends Primitive {
	private String literal;

	public Literal() {
		super();
	}
	
	public Literal(String literal) {
		super(Integer.parseInt(literal));
		this.setLiteral(literal);
	}

	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}
	
	@Override
	public String toString() {
		return "{'" + literal + "', " + super.toString();
	}

}
