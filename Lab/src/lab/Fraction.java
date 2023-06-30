package lab;

public class Fraction {
	public int num;
	public int den;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setDun(int den) {
		this.den = den;
	}
	
	public int getDun() {
		return den;
		
	}
	public Fraction(int num, int den) {
		super();
		if(den != 0) {
			this.num = num;
			this.den = den;
		}
		if (num != 0) {
			reduction();
		}
	}
	
//	HandMadeList l = ...;
//	Iterator i = new Iterator(l);
	
	public String toString() {
		return (String) (num + "/" + den);
	}
	
	private void reduction() {
		int d = nod(num, den);
		num /= d;
		den /= d;
	}

	private int nod(int x, int y) {
		while(x != y) {
			if (x > y) {
				x -= y;
			}
			else {
				y -= x;
			}
		}
		return x;
	}
	
	public Fraction sum(Fraction second) {
		int d = nok(den, second.getDun());
		int n = num * d / den + second.getNum() * d / second.getDun();
		return new Fraction(n, d);
	}

	private int nok(int x, int y) {
		return x * y / nod(x, y);
	}

}
