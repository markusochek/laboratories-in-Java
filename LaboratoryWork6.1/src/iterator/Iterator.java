package iterator;

import listOfInteger.ListOfInteger;

public class Iterator {
	private ListOfInteger list;
	
	public ListOfInteger getList() {
		return this.list;
	}

	public void setList(ListOfInteger list) {
		this.list = list;
	}
	
	public Iterator() {
		this.list = new ListOfInteger();
	}
	
	public Iterator(ListOfInteger list) {
		this.list = list;
	}
	
	public void increment() {
		list = list.getNext();
	}
	
	public ListOfInteger getNext() {
		return list.getNext();
	}
	
	public void setNext(ListOfInteger list) {
		this.list.setNext(list);
	}
	
	public int getNumber() {
		return this.list.getNumber();
	}
	
	public void setNumber(int number) {
		this.list.setNumber(number);
	}
}
