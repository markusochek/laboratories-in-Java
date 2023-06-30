package laboratoryWork;

//import java.util.Scanner;

public class UniversitySchedule {

	public static void main(String[] args) {
//		 Scanner scan = new Scanner(System.in);
//         System.out.print("¬ведите количество пар:");
//         Integer n = scan.nextInt();
//         System.out.print("¬ведите длительность пары:");
//         Integer a = scan.nextInt();
//         System.out.print("¬ведите длительность перемены:");
//         Integer b = scan.nextInt();
//         scan.close();
		
		Integer n = 5;
		Integer a = 90;
		Integer b = 10;
		
		Integer hours = 8;
		Integer minutes = 0;
		Integer hours1 = 8;
		Integer minutes1 = 0;
		
		System.out.format("%1s%7s%10s", "є", "ѕара", "ѕерерыв");
		System.out.println();
		for (int i = 0; i < n; i++) {
			String renderNullHours = "";
			String renderNullMinutes = "";
			String renderNullHours1 = "";
			String renderNullMinutes1 = "";
			
			hours1 = hours + a / 60;
			minutes1 = minutes + a % 60;
			if (minutes1 >= 60) {
				hours1 += minutes1 / 60;
				minutes1 -= 60*(minutes1 / 60);
			}
			
			if (hours < 10) {
				renderNullHours = "0";
			}
			if (minutes == 0) {
				renderNullMinutes = "0";
			}
			
			if (hours1 < 10) {
				renderNullHours1 = "0";
			}
			if (minutes1 == 0) {
				renderNullMinutes1 = "0";
			}
			
			System.out.format("%1s%7s%10s",
				(i+1),
				renderNullHours + hours + ":" + minutes + renderNullMinutes,
				renderNullHours1 + hours1 + ":" + minutes1 + renderNullMinutes1);
			System.out.println();
			
			minutes1 += b;
			if (minutes1 >= 60) {
				hours = hours1 + minutes1 / 60;
				minutes = minutes1 - 60*(minutes1 / 60);
			} else {
				hours = hours1;
				minutes = minutes1;
			}
		}
	}

}
