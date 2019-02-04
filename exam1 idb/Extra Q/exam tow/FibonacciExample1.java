

import java.util.Scanner;

class FibonacciExample1{  
public static void main(String args[])  
{    
Scanner input = new Scanner(System.in);
int n1=0,n2=1,n3=0,i,count; 
System.out.println("entered your number :");
 count = input.nextInt();
    
 System.out.print(n1+" "+n2);//printing 0 and 1   	
	i=0;
 while(i<count)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3; 
  i++;
 }   
System.out.println(); 
}}  
