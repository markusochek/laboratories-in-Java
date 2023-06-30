package listOfInteger;

import iterator.Iterator;

public class ListOfInteger implements Cloneable, Comparable<ListOfInteger> {
	private int number;
	private ListOfInteger next;
	
	public ListOfInteger() {
		this.number = 0;
		this.next = null; 
	}
	
	public ListOfInteger(int number) {
		this.number = number;
		this.next = null; 
	}

	public ListOfInteger getNext() {
		return this.next;
	}

	public void setNext(ListOfInteger next) {
		this.next = next;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void insertAtEnd(int numeral) {
		Iterator it = new Iterator(this);
		while(it.getNext() != null) {
			it.increment();
		}
		it.setNext(new ListOfInteger(numeral));
	}
	
	public void insertAfterNumber(int numeralToSearch, int numeral) {
		Iterator it = new Iterator(this.getNext());
		while(it.getList() != null && it.getNumber() != numeralToSearch) {
			it.increment();
		}
		
		if (it.getList() != null) {
			Iterator itNew = new Iterator(new ListOfInteger(numeral));
			ListOfInteger nextElement = it.getNext();
			it.setNext(itNew.getList());
			itNew.setNext(nextElement);
		}
	}
	
	public Integer accessByIndex(int index) {
		int i = -1;
		Iterator it = new Iterator(this);
		while(it.getList() != null && i != index) {
			it.increment();
			i++;
		}
		if (it.getList() != null) {
			return it.getNumber();
		} else {
			return null;
		}
	}
	
	public boolean search(int number) {
		Iterator it = new Iterator(this);
		while(it.getList() != null && it.getNumber() != number) {
			it.increment();
		}
		if (it.getList() != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean delete(int numberToDelete) {
		Iterator it = new Iterator(this);
		while(it.getNext() != null && it.getNext().getNumber() != numberToDelete) {
			it.increment();
		}
		if (it.getNext() != null) {	
			it.setNext(it.getNext().getNext());
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		Iterator it = new Iterator(this.getNext());
		String message = "{";
		while (it.getList() != null) {
			if (it.getNext() != null) {
				message += it.getNumber() + ", ";
			} else {
				message += it.getNumber();
			}
			it.increment();
		}
		return message + "}";
	}
	
	@Override
	public int hashCode() {
		if (next != null) {
			return (int) 7723 * number + 2 * next.hashCode();
		}
		return (int) 7723 * number + 2;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() == object.getClass()) {
			ListOfInteger temp = (ListOfInteger) object;
			if(next != null) {
				return number == temp.getNumber() && next.equals(temp.getNext());
			}
			return number == temp.getNumber();
		}
		else {
			return false;
		}
	}
	
	@Override
	public ListOfInteger clone(){
		try{
			ListOfInteger copy = (ListOfInteger)super.clone();
			if(next != null) {
				copy.next = next.clone();
			}
			return copy;
		} catch(CloneNotSupportedException e){
			throw new InternalError();
		}
	}

	@Override
	public int compareTo(ListOfInteger element) {
		if (number - element.getNumber() != 0)
			return number - element.getNumber();
		else {
			if(next != null) {
				return next.compareTo(element.getNext());
			}
		}
		return 0;
	}
	


	
	
}
