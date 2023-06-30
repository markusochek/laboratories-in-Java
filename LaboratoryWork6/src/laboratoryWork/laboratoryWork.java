package laboratoryWork;

import integerNumber.integerNumber;
import listOfInteger.ListOfInteger;

public class laboratoryWork {
	
	public static boolean insertAfterNumber(ListOfInteger list, int numberToSearch, int number) {
		if(list.insertAfterNumber(numberToSearch, number)) {
			return true;
		} else {
			System.out.println("**вы ввели число, которого нет в списке.**");
			System.out.println();
			return false;
		}
	}
	
	public static boolean delete(ListOfInteger list, int numberToDelete) {
		if(list.delete(numberToDelete)) {
			return true;
		} else {
			System.out.println("**вы ввели число, которого нет в списке.**");
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
			System.out.println("**вы ввели число, которого нет в списке.**");
			System.out.println();
			return false;
		}
	}
	
	public static boolean search(ListOfInteger list, int number) {
		integerNumber it = list.search(number);
		if(it != null) {
			System.out.println("число " + it.getNumber() + " найдено");
			System.out.println();
			return true;
		} else {
			System.out.println("**вы ввели число, которого нет в списке.**");
			System.out.println();
			return false;
		}
	}
	
	public static void main(String[] args) {
		final int N = 10;
		final int RAND = 100;
		
		//демонстрация рандомной вставки и вывода на экран
		ListOfInteger list1 = new ListOfInteger();
		list1.multipleInsertRandom(N, RAND);
		
		System.out.println("вывод списка1 целых чисел:");
		list1.print();
		
		ListOfInteger list2 = new ListOfInteger();
		System.out.println("вывод пустого списка2 целых чисел:");
		list2.print();
		
		list2.insertAtEnd(5);
		list2.insertAtEnd(5);
		list2.insertAtEnd(7);
		list2.insertAtEnd(26);
		list2.insertAtEnd(-35);
		
		System.out.println("вывод заполненного списка2 целых чисел:");
		list2.print();
		
		System.out.println("вывод заполненного с помощью поиска списка2 целых чисел:");
		insertAfterNumber(list2, 5, 11);
		insertAfterNumber(list2, 6, 11);
		list2.print();
		
		System.out.println("вывод почищенного списка2 целых чисел:");
		delete(list2, 7);
		delete(list2, 3);
		list2.print();
		
		System.out.println("вывод элемента листа2 по индексу");
		accessByNumber(list2, 4);
		System.out.println();
		accessByNumber(list2, 7);
		
		System.out.println("вывод элемента листа2 c помощью поиска");
		search(list2, -35);
		search(list2, 26);
		System.out.println();
		
		System.out.println("сравнение через equals");
		ListOfInteger list3 = new ListOfInteger();
		ListOfInteger list4 = new ListOfInteger();
		list3.insertAtEnd(7);
		list4.insertAtEnd(7);
		System.out.println(list3.equals(list4));
		System.out.println();
		
		System.out.println("сравнение через hashCode");
		if (list3.hashCode() == list4.hashCode()) {
			System.out.println("списки равны");
		} else {
			System.out.println("списки не равны");
		}
		System.out.println();
		
		integerNumber element = new integerNumber();
		element.setNumber(5);
		System.out.println(element.toString());
		System.out.println();
		
		
		System.out.println("клонирование");
		ListOfInteger list5 = new ListOfInteger();
		list5 = list4.clone();
		list5.print();
		
		System.out.println("сравнение");
		System.out.println(list3.compareTo(list4));
	}

}
