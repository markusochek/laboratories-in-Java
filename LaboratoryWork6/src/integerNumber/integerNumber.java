package integerNumber;

public class integerNumber {
	private int number;
	private integerNumber next;
	
	public integerNumber() {
		this.setNumber(0);
		this.setNext(null); 
	}
	
	public integerNumber(int element) {
		this.setNumber(element);
		this.setNext(null); 
	}

	public integerNumber getNext() {
		return this.next;
	}

	public void setNext(integerNumber next) {
		this.next = next;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void print(int i) {
		System.out.format("%2d%2s%3d", i, "|", this.number);
		System.out.println();
	}
	
	public String toString() {
		Integer number = this.number;
		return number.toString();
	}
	
	public int compareTo(integerNumber element) {
		Integer number = this.number;
		number.compareTo(element.getNumber());
		return number.compareTo(element.getNumber());
	}
}