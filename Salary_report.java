import java.util.Scanner;
public class Salary_report {
	public static void main(String[] args) {		
		int basic_time = 100;
		int total_time = 0;
		int extra_time1 = 0;
		int extra_time2 = 0;
		double bonus_rate1 = 12.5;
		double bonus_rate2 = 15.0;
		double basic_salary = 500;
		double bonus_salary = 0;
		double lost_rate = 5.0;
		double total_salary = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Total Time: ");
		total_time = in.nextInt();
				
		if(total_time > 100) {
			extra_time1 = (total_time > 120) ? 20 : (total_time - 100);
			extra_time2 = (total_time > 120) ? (total_time - 120) : 0;
			bonus_salary = (extra_time1 * bonus_rate1) + (extra_time2 * bonus_rate2);
			System.out.println(".....................................");
			System.out.println("- Basic  time: " + basic_time);
			System.out.println("- Extra time1: " + extra_time1);
			System.out.println("- Extra time2: " + extra_time2);
			System.out.println("- Bonus rate1: $" + bonus_rate1);
			System.out.println("- Bonus rate2: $" + bonus_rate2);
			System.out.println("- Bonus Salary: $" + bonus_salary);
			System.out.println("- Basic Salary: $" + basic_salary);
			System.out.println(".....................................");
		}else {			
			System.out.println("Total time " + total_time);
		}

	}

}
