package laboratoryWork;

import java.util.Scanner;

public class PalindromeOfNumberSystems {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//        System.out.print("Введите число:");
//        int n = scan.nextInt();
//        System.out.print("Введите систему счисления:");
//        int m = scan.nextInt();
//        scan.close();
        
	    int n = 255;
	    int m = 16;
        
        int cloneN = n;
        int k = 1;
        int result = 0;
        int tluser = 0;
        int tluser2 = 0;
        int remains = 0;
        int i = 0;
        
        while (n >= m) {
        	result = 10*(result + n % m);
			remains = n % m;
			n = n / m;
			k++;
			System.out.print(remains);
		}
        
        if (remains == 0) {
        	result = result + n % m;
        	System.out.print(n % m);
        	i = 0;
        } 
        else {
        	result = 10*(result + n % m);
        	System.out.print(n % m);
        	k++;
        	i = 1;
        }
        System.out.println();
        
        boolean flag = true;
        for (; i < k; i++)
        {
        	int element = (int)Math.round(result / (Math.pow(10, i)));
        	tluser = element % 10;
        	int element2 = (int)Math.round(result / (Math.pow(10, k-i)));
        	tluser2 = element2 % 10;
        	System.out.print(tluser);
        	if (tluser != tluser2) {
        		flag = false;
        	}
        }
        System.out.println();
        
		if (flag) {
			System.out.println("это число " + cloneN + " в системе счисления " + m + " является палиндромом");
		} 
		else {
			System.out.println("это число " + cloneN + " в системе счисления " + m + " не является палиндромом");
		}
	}

}
