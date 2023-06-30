package listOfInteger;

import integerNumber.integerNumber;

public class ListOfInteger {
	private integerNumber guard;

	public ListOfInteger() {
		this.guard = new integerNumber();
	}
	
	public integerNumber getGuard() {
		return guard;
	}

	public void setGuard(integerNumber guard) {
		this.guard = guard;
	}
	
	public void multipleInsertRandom(int N, int RAND) {
		integerNumber it1 = this.guard;
		for (int i = 0; i < N; i++) {
			integerNumber it2 = new integerNumber((int)(Math.random() * RAND + 1));
			it1.setNext(it2);
			it1 = it2;
		}
	}
	
	public void insertAtEnd(int number) {
		integerNumber it1 = this.guard;
		while(it1.getNext() != null) {
			it1 = it1.getNext();
		}
		integerNumber it2 = new integerNumber(number);
		it1.setNext(it2);
	}
	
	public boolean insertAfterNumber(int numberToSearch, int number) {
		integerNumber it1 = this.guard.getNext();
		while(it1 != null && it1.getNumber() != numberToSearch) {
			it1 = it1.getNext();
		}
		if (it1 != null) {
			integerNumber it2 = new integerNumber(number);
			integerNumber itN = it1.getNext();
			it1.setNext(it2);
			it2.setNext(itN);
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		integerNumber it = this.guard.getNext();
		System.out.format("%2s%2s%17s", "¹","|", "number of list \n");
		System.out.println("---------------------");
		int count = 1;
		while (it != null) {
			it.print(count);
			it = it.getNext();
			count++;
		}
		System.out.println();
	}
	
	public boolean delete(int numberToDelete) {
		integerNumber it1 = this.guard;
		while(it1.getNext() != null && it1.getNext().getNumber() != numberToDelete) {
			it1 = it1.getNext();
		}
		if (it1.getNext() != null) {
			integerNumber it2 = it1.getNext().getNext();
			integerNumber itD = it1.getNext();
			itD = null;
			it1.setNext(it2);
			
			return true;
		} else {
			return false;
		}
	}
	
	public integerNumber accessByNumber(int count) {
		int i = 1;
		integerNumber it1 = this.guard.getNext();
		while(it1 != null && i != count) {
			it1 = it1.getNext();
			i++;
		}
		if (it1 != null) {
			return it1;
		} else {
			return null;
		}
	}
	
	public integerNumber search(int number) {
		integerNumber it1 = this.guard.getNext();
		while(it1 != null && it1.getNumber() != number) {
			it1 = it1.getNext();
		}
		if (it1 != null) {
			return it1;
		} else {
			return null;
		}
	}
	
	public boolean equals(ListOfInteger list) {
		integerNumber it0 = this.guard.getNext();
		integerNumber it = list.guard.getNext();
		while (it != null && it0.getNumber() == it.getNumber()) {
			it0 = it0.getNext();
			it = it.getNext();
		}
		if (it == null) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		integerNumber it = this.guard.getNext();
		Integer hash = 0;
		
		while (it != null) {
			hash =+ it.getNumber();
			hash = hash.hashCode();
			it = it.getNext();
		}
		return hash.hashCode();
	}
	
	public ListOfInteger clone() {
		integerNumber it = this.guard.getNext();
		ListOfInteger listClone = new ListOfInteger();
		integerNumber itClone = listClone.guard;
		while (it != null) {
			integerNumber itNEW = new integerNumber();
			itClone.setNext(itNEW);
			itClone = itClone.getNext();
			itClone.setNumber(it.getNumber());
			it = it.getNext();
		}
		return listClone;
	}
	
	public int compareTo(ListOfInteger list) {
		integerNumber it0 = this.guard.getNext();
		integerNumber it = list.guard.getNext();
		int sum = 0;
		while (it != null && it0 != null) {
			sum =+ it.compareTo(it0);
			it0 = it0.getNext();
			it = it.getNext();
		}
		return sum;
	}
}
