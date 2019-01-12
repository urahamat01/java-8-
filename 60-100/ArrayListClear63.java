

import java.util.ArrayList;


public class ArrayListClear63{
	public static void main (String[] args) {
		
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		System.out.println("size ="+ number.size());
		
		//adding elements  
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(5,40);
		
		
		
		System.out.println("before ArrayList contains :"+number);
		
		
		
		
		System.out.println();
		System.out.println("size ="+number.size());
		
		//before clear empty
		
		boolean check = number.isEmpty();
		System.out.println("arraylist empty :"+check);
		//after empty clear 
		number.clear();
		System.out.println("After clear ArrayList contains :"+ number);
		
		//after clear empty
		boolean check = number.isEmpty();
		System.out.println("arraylist empty :"+check);
	
			
	}







}