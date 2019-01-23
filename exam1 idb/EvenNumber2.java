 
 import java.util.Scanner;
 
 class EvenNumber2{  
 
 public static void main(String args[]){  
 Scanner number1 = new Scanner(System.in);
 
 double sum = 0;
 
 

 
 System.out.println("Enter your number");
  int n = number1.nextInt();
 
 for(double i=1;i<=n;i++){
 	 
	 
	 System.out.print(i+" ");
	 sum = sum+i;
	 
 }
  
  System.out.println("Sum of "+sum);    
 }  
}  