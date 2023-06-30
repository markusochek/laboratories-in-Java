package lab;

public class FractionRun {

	public static void main(String[] args) {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(3, 6);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		Fraction c = new Fraction(2, 3);
		System.out.println("c = " + c);
		
		Fraction d = a.sum(b);
		System.out.println("d = " + d);
		
		Fraction[] fractionArray = new Fraction[] {
				new Fraction(1, 2),
				new Fraction(6, 4),
				new Fraction(6, 8),
				new Fraction(3, 8)};
		Fraction s = new Fraction(0,1);
		for(Fraction fraction : fractionArray) {
			s = s.sum(fraction);
		}
		System.out.println("sum = " + s);
	}

}
