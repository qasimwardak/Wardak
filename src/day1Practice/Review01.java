package day1Practice;

public class Review01 {

	public static void main(String[] args) {
		
		
		String day="Sunday"
;
		if (!day.equals("Sunday")) {
			System.out.println("Relax it's Weekend");
		}else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Its Weekend again");
	}else {
		System.out.println("Go to work");
	}if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
		System.out.println("Relax it's Weekend");
	}else {
		System.out.println("Go to work");
		}
	}

}
