package day1Practice;

 class Main {
	
	
	 public static String censorLetter ( String a, char b)  {
		 
		
		return a.replace(b, '*');
			  
 }
	 
		 public static void main(String[] args) {
			 Main main=new Main ();
			System.out.println(censorLetter("computer science", 'e'));
			 System.out.println(censorLetter("trick or treat", 't'));
			
		 }
		 }
 
	