package run;

import identifier.Identifier;
import literal.Literal;
import primitive.Primitive;

public class Run {

	public static void main(String[] args) {
		Primitive[] primitives = new Primitive[] {
			new Literal("13"),
			new Literal("7"),
			new Identifier("x", 10),
			new Identifier("y", 3),
		};
		
		for (Primitive primitive : primitives) {
			System.out.println(primitive);
		}
		System.out.println();
		
		int sum = 0;
		for (Primitive primitive : primitives) {
			sum += primitive.getValue();
		}
		System.out.println("сумма = " + sum);
		System.out.println();
		
		((Literal)primitives[0]).setLiteral("19");
		System.out.println(primitives[0]);
		
		((Identifier)primitives[2]).setName("z");
		System.out.println(primitives[2]);
		
	}

}
