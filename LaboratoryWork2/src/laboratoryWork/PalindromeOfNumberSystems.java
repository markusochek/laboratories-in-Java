package laboratoryWork;

import java.util.Scanner;

public class PalindromeOfNumberSystems {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Введите число:");
        int n = scan.nextInt();
        System.out.print("Введите систему счисления:");
        int m = scan.nextInt();
        scan.close();
        
		int n0 = n;
		int N = 10;
		int mas[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			mas[i] = n % m;
			n = n / m;
		}
		
		int k = N-1;
		while (mas[k] == 0) { 
			k--;
		}
		
		for (int i = k; i >= 0; i--) {
			System.out.print(mas[i]);
		}
		
		boolean flag = true;
		for (int i = k, j = 0; i >= 0; i--) {
			if (mas[i] != mas[j]) {
				flag = false;
				break;
			}
			j++;
		}
		System.out.println();
		if (flag) {
			System.out.println("это число " + n0 + " в системе счисления " + m + " является палиндромом");
		} 
		else {
			System.out.println("это число " + n0 + " в системе счисления " + m + " не является палиндромом");
		}
	}
}
