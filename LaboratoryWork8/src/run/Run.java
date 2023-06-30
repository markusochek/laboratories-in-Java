package run;

import java.util.Scanner;

import setCombination.SetCombination;
import setOfSetsCombination.SetOfSetsCombination;

public class Run {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter n: ");
//		n = scan.nextInt();
		
		int n = 1;
		
		SetOfSetsCombination setOfSets1 = new SetOfSetsCombination();
		for (int i = 0; i <= n; i++) {
			SetCombination set = new SetCombination();
			set.add(i);
			setOfSets1.add(set);
		}
		
		for (int i = 0; i < n; i++) {
			setOfSets1.cartesianProduct();
		}
		
		setOfSets1.destroyZeros();
		
		System.out.println(setOfSets1);
	}

}
