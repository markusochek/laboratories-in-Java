package laboratoryWork;

public class LatinSquare {

	static void insertRandomElements (int array[][], int N) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int)((Math.random() *N)+1);
			}
		}
	}
	
	static boolean isCheckTheRange (int array[][]) {
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (!(1 <= array[i][j] && array[i][j] <= array.length)) {
					flag = false;
				}
			}
		}
		return flag;
	}
	
	static void print(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static boolean isLatinSquare(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int k = j+1;
				while (k != array.length) {
					if(array[i][j] == array[i][k] ||
					array[j][i] == array[k][i]) {
						return false;
					}
					k++;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//Integer N = 3;
		int N = 3;
		int array[][] = new int[N][N];
		//LatinSquare.insertRandomElements(array, N);
		
	// 	проверка на 3 x 3;
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		
		array[1][0] = 3;
		array[1][1] = 1;
		array[1][2] = 2;
		
		array[2][0] = 2;
		array[2][1] = 2;
		array[2][2] = 1;
					
	// 	проверка на 2 x 2;
//		array[0][0] = 1;
//		array[0][1] = 2;
//		
//		array[1][0] = 2;
//		array[1][1] = 1;
					
		LatinSquare.print(array);
		if (LatinSquare.isCheckTheRange(array)) {
			if (LatinSquare.isLatinSquare(array)) {
				System.out.println("матрица N x N является латинским квадратом");
			}
			else {
				System.out.println("матрица N x N не является латинским квадратом");
			}
		}
		else {
			System.out.println("матрица N x N не является латинским квадратом и не все её числа входят в диапозон");
		}
	}
}
