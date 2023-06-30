package laboratoryWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class сontrolWordMatch {

	public static void main(String[] args) {
		String controlWord = "";
		String text = "";
		try {
			FileReader fileReader = new FileReader("mark.txt");
			Scanner scan = new Scanner(fileReader);
			//System.out.print("¬ведите контрольное слово:");
			controlWord = scan.nextLine();
			//System.out.print("¬водите через пробел слова:");
			text = scan.nextLine();
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(controlWord);
		System.out.println(text);
		System.out.println();
		// String string1 = "marl";
		// String string2 = "makq";
		
		//Integer comparator = string1.compareTo(string2);
		//System.out.println(comparator);
		
		String[] words = text.split("\\s");
		
	    int counter = 0;
		char[] controlWordArray = controlWord.toCharArray();
		int previousCounter = 10000;
		int ArrayOfCounters[] = new int[words.length];
		
		for (int u = 0; u < words.length; u++) {
			int length = 0;
			if (controlWord.length() < words[u].length()) {
				length = controlWord.length();
			}
			else {
				length = words[u].length();
			}
			counter = Math.abs(controlWord.length() - words[u].length());
			
			char[] wordArray = words[u].toCharArray();
			
			for (int i = 0; i < length; i++) {
				if (controlWordArray[i] != wordArray[i]) {
					counter++;
				}
			}
			ArrayOfCounters[u] = counter;
			if (counter < previousCounter) {
				previousCounter = counter;
			}
		}
		
		for (int u = 0; u < ArrayOfCounters.length; u++) {
			System.out.print(ArrayOfCounters[u] + " ");
		}
		
		System.out.println("");

		System.out.println("рассто€ние минимальной длины контрольного слова и любого другого из текста равно: " + previousCounter);
		System.out.println("такое рассто€ние установилось со следующим(и) словом(ами):");
		for (int u = 0; u < words.length; u++) {
			if (ArrayOfCounters[u] == previousCounter) {
				System.out.println(words[u]);
			}
		}
	}
}
