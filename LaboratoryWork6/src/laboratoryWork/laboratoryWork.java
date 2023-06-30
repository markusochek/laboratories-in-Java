package laboratoryWork;

import integerNumber.integerNumber;
import listOfInteger.ListOfInteger;

public class laboratoryWork {
	
	public static boolean insertAfterNumber(ListOfInteger list, int numberToSearch, int number) {
		if(list.insertAfterNumber(numberToSearch, number)) {
			return true;
		} else {
			System.out.println("**�� ����� �����, �������� ��� � ������.**");
			System.out.println();
			return false;
		}
	}
	
	public static boolean delete(ListOfInteger list, int numberToDelete) {
		if(list.delete(numberToDelete)) {
			return true;
		} else {
			System.out.println("**�� ����� �����, �������� ��� � ������.**");
			System.out.println();
			return false;
		}
	}
	
	public static boolean accessByNumber(ListOfInteger list, int count) {
		integerNumber it = list.accessByNumber(count);
		if(it != null) {
			it.print(count);
			System.out.println();
			return true;
		} else {
			System.out.println("**�� ����� �����, �������� ��� � ������.**");
			System.out.println();
			return false;
		}
	}
	
	public static boolean search(ListOfInteger list, int number) {
		integerNumber it = list.search(number);
		if(it != null) {
			System.out.println("����� " + it.getNumber() + " �������");
			System.out.println();
			return true;
		} else {
			System.out.println("**�� ����� �����, �������� ��� � ������.**");
			System.out.println();
			return false;
		}
	}
	
	public static void main(String[] args) {
		final int N = 10;
		final int RAND = 100;
		
		//������������ ��������� ������� � ������ �� �����
		ListOfInteger list1 = new ListOfInteger();
		list1.multipleInsertRandom(N, RAND);
		
		System.out.println("����� ������1 ����� �����:");
		list1.print();
		
		ListOfInteger list2 = new ListOfInteger();
		System.out.println("����� ������� ������2 ����� �����:");
		list2.print();
		
		list2.insertAtEnd(5);
		list2.insertAtEnd(5);
		list2.insertAtEnd(7);
		list2.insertAtEnd(26);
		list2.insertAtEnd(-35);
		
		System.out.println("����� ������������ ������2 ����� �����:");
		list2.print();
		
		System.out.println("����� ������������ � ������� ������ ������2 ����� �����:");
		insertAfterNumber(list2, 5, 11);
		insertAfterNumber(list2, 6, 11);
		list2.print();
		
		System.out.println("����� ����������� ������2 ����� �����:");
		delete(list2, 7);
		delete(list2, 3);
		list2.print();
		
		System.out.println("����� �������� �����2 �� �������");
		accessByNumber(list2, 4);
		System.out.println();
		accessByNumber(list2, 7);
		
		System.out.println("����� �������� �����2 c ������� ������");
		search(list2, -35);
		search(list2, 26);
		System.out.println();
		
		System.out.println("��������� ����� equals");
		ListOfInteger list3 = new ListOfInteger();
		ListOfInteger list4 = new ListOfInteger();
		list3.insertAtEnd(7);
		list4.insertAtEnd(7);
		System.out.println(list3.equals(list4));
		System.out.println();
		
		System.out.println("��������� ����� hashCode");
		if (list3.hashCode() == list4.hashCode()) {
			System.out.println("������ �����");
		} else {
			System.out.println("������ �� �����");
		}
		System.out.println();
		
		integerNumber element = new integerNumber();
		element.setNumber(5);
		System.out.println(element.toString());
		System.out.println();
		
		
		System.out.println("������������");
		ListOfInteger list5 = new ListOfInteger();
		list5 = list4.clone();
		list5.print();
		
		System.out.println("���������");
		System.out.println(list3.compareTo(list4));
	}

}
