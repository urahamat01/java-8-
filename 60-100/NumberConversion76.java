

import java.util.Scanner;




public class NumberConversion76{

		public static void main(String[] args) {
			
			//decimal to integer use 
			
			//scanner use input number
			
	Scanner input = new Scanner(System.in);
	
	int decimal;
	System.out.println("Enter any number :");
	
	decimal = input.nextInt();
	
	 String hexa = Integer.toHexString(decimal);
	
	System.out.println("s = " + hexa );
	
	
	
	
	
	
		}


}