package laboratoryWork;

public class PalindromeOfNumberSystems {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//      System.out.print("Введите число:");
//      int n = scan.nextInt();
//      System.out.print("Введите систему счисления:");
//      int m = scan.nextInt();
//      scan.close();
		
		int n = 9;
		int m = 2;
		
		int cloneN = n;
		int guard = 9;
		int k = 0;
		int size = 0;
		if (m > 10) {
			size = 100;
		} else {
			size = 10;
		}
		
		int remainReverse = guard;
		int remain = guard;
		while (n > 0) {
			remainReverse = size * remainReverse + (n % m);
			n = n / m;
			k++;
		}
		int remainReverseClone = remainReverse;
		for (int i = 0; i < k; i++) {
			remain = size * remain + (remainReverseClone % size);
			remainReverseClone = remainReverseClone / size;
		}
		//System.out.println(remainReverse);
		//System.out.println(remain);
		remainReverse = (int)(remainReverse % Math.pow(size, k));
		remain = (int)(remain % Math.pow(size, k));
		//System.out.println(remainReverse);
		//System.out.println(remain);
		
		if (remainReverse == remain) {
			System.out.println("это число " + cloneN + " в системе счисления " + m + " является палиндромом");
		} 
		else {
			System.out.println("это число " + cloneN + " в системе счисления " + m + " НЕ является палиндромом");
		}
		
		for (int i = 0; i < k; i++) {
			System.out.print(remainReverse % size + " ");
			remainReverse /= size;
		}
		System.out.println();
		
		for (int i = 0; i < k; i++) {
			System.out.print(remain % size + " ");
			remain /= size;
		}
		System.out.println();
		
		//System.out.println(remainReverse);
		//System.out.println(remain);
	}

}
	