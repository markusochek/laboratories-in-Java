package laboratoryWork;

public class MarathonRunning {

	public static void main(String[] args) {
		int N = 10;
		int numbers[] = new int[N];
		float results[] = new float[N];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)((Math.random() * 100)+1);
		}
		
		for (int i = 0; i < results.length; i++) {
			results[i] = (float)((Math.random() * 20)+600);
		}
		
		System.out.println("результаты марафона:");
		System.out.format("%2s%10s", "numbers", "results");
		System.out.println();
		for (int i = 0; i < results.length; i++) {
			System.out.format("%2s%14.2f", numbers[i], results[i]);
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] > numbers[i]) {
					int swapInt = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = swapInt;
					
					float swapFloat = results[j];
					results[j] = results[i];
					results[i] = swapFloat;
				}
			}
		}
		
		System.out.println("сортировка по ключу numbers:");
		System.out.format("%2s%10s%10s", "id", "numbers", "results");
		System.out.println();
		
		for (int i = 0; i < results.length; i++) {
			System.out.format("%2s%5s%14.2f", i+1, numbers[i], results[i]);
			System.out.println();
		}
		
		for (int i = 0; i < results.length; i++) {
			for (int j = 0; j < results.length; j++) {
				if (results[j] > results[i]) {
					int swapInt = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = swapInt;
					
					float swapFloat = results[j];
					results[j] = results[i];
					results[i] = swapFloat;
				}
			}
		}
		System.out.println();
		
		System.out.println("сортировка по ключу results:");
		System.out.format("%2s%10s%10s", "id", "numbers", "results");
		System.out.println();
		
		for (int i = 0; i < results.length; i++) {
			System.out.format("%2s%5s%14.2f", i+1, numbers[i], results[i]);
			System.out.println();
		}
	}

}
