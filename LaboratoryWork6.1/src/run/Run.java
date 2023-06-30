package run;

import listOfInteger.ListOfInteger;

public class Run {
	public static void main(String[] args) {
		ListOfInteger list1 = new ListOfInteger();
		list1.insertAtEnd(5);
		list1.insertAtEnd(7);
		list1.insertAtEnd(19);
		
		System.out.println("вставка после числа 5, числа 3");
		System.out.println(list1);
		list1.insertAfterNumber(5, 3);
		System.out.println(list1);
		System.out.println();
		
		System.out.println("поиск по индексу 1");
		System.out.println(list1.accessByIndex(1));
		System.out.println();
		
		System.out.println("удаление числа под номером 7");
		System.out.println(list1);
		list1.delete(7);
		System.out.println(list1);
		System.out.println();
		System.out.println();
		
		System.out.println("проверка equals и clone");
		ListOfInteger list2 = new ListOfInteger();
		list2.insertAtEnd(43);
		list2.insertAtEnd(4);
		list2.insertAtEnd(13);
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.equals(list1));
		System.out.println(list1.equals(list2));
		System.out.println(list2.equals(list1));
		
		ListOfInteger list3 = list1.clone();
		System.out.println(list3.equals(list1));
		System.out.println(list1.equals(list3));
		System.out.println();
		
		System.out.println("проверка hashCode");
		System.out.println(list1.hashCode());
		System.out.println(list2.hashCode());
		System.out.println(list3.hashCode());
		
		System.out.println();
		System.out.println("проверка compareTo");
		System.out.println(list1.compareTo(list1));
		System.out.println(list1.compareTo(list2));
		System.out.println(list2.compareTo(list1));
		System.out.println(list3.compareTo(list1));
		System.out.println(list1.compareTo(list3));
		
		
	}

}
