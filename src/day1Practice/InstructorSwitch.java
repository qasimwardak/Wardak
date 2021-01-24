package day1Practice;

import java.util.Scanner;

public class InstructorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner (System.in);
		    System.out.println("Enter name of the instructor"); 
		    String name = sc.nextLine(); 
		    String subject=null;
		    
		    switch(name){
		      case "Asghar":
		        subject="Java";
		        break;
		      case "Moazam":
		        subject="SDLC";
		        break;
		      case "Weqas":
		        subject="Selenium";
		        break;
		      case "Asel":
		        subject="every";
		        break;
		      
		      default:
		        System.out.println("Invalid instructor selected");
		      
		      } 
		      
		      if(subject!=null){
		         System.out.println("Will take care of "+subject+" Assignment");
		      }
		  }
		}