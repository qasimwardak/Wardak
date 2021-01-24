package day1Practice;

import java.util.Scanner;

public class AndOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
		String word1;
		String word2;
		int num1;
		int num2;
		String Result=null;
		input=new Scanner (System.in);
		System.out.println("Please enter two words");
		word1=input.nextLine();
		word2=input.nextLine();
		System.out.println("Please enter two number");
		num1=input.nextInt();
		num2=input.nextInt();
		
		if (word1.equalsIgnoreCase(word2) && num1==num2) {
			Result=("AND");
		}else if (word1.equalsIgnoreCase(word2) || num1==num2) {
				Result=("OR");
			}else if (!(word1.equalsIgnoreCase(word2) && num1!=num2)) {
				Result=("NONE");
			}
			System.out.println(Result);
		}
	}
	


