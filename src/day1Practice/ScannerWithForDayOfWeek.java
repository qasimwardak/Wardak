package day1Practice;

import java.util.Scanner;

public class ScannerWithForDayOfWeek {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		String[] days = new String[8];
		// storing values
		for (int i = 1; i < 8; i++) {
			System.out.println("Please enter day " + i + " of the week");
			days[i] = scan.next();
		}
		// printing values
		for (int i = 1; i < days.length; i++) {
			System.out.println(days[i] );
		}
		
		/*
		 * System.out.println("---------------Second way------------------------");
		
		Scanner userInput = new Scanner(System.in);

		String[] arr = new String[7];

		for (int i = 0; i <arr.length; i++) {

			System.out.println("Please enter day " + (i+1) + " of the week");
			arr[i] = userInput.next();
		}
		
		
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		 */
		}
		
  }

		
		
	
		




					
					


		
		


		
	


