 
 import java.util.Scanner;
 
 class EvenNumber3{  
 
 public static void main(String args[]){  
 Scanner number1 = new Scanner(System.in);
 
 int sum = 0;
 
 
 System.out.println("Enter your number");
  int n = number1.nextInt();
 
 for(int i=1;i<=n;i++){
 	 
	 
	 System.out.print(i+"X"+i+" ");
	 sum = sum+i*i;
	 
 }
  System.out.println();
  System.out.println("Sum of "+sum);    
 }  
}  