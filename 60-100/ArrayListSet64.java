

import java.util.ArrayList;


public class ArrayListSet64{
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
		
		
		//before empty clear 
		/*
		number.clear();
		System.out.println("After clear ArrayList contains :"+ number);
		*/
		//after clear empty
		
		boolean check = number.isEmpty();
		System.out.println("arraylist empty :"+check);
		
		boolean contain = number.contains(30);
		System.out.println("30 is in the list :"+ contain);
		
		
		int pos = number.indexOf(40);
		
		System.out.println("The indexOf 40 is"+pos);
		
		//set method 
		
		number.set(3, 60); //replace set method
		System.out.println("after setting : " + number);
		
		
		int x = number.get(1);
		
		System.out.println("index 1 =" + x);
	
			
	}







}