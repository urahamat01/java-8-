 
 import java.util.Scanner;
 
 class EvenNumber1{  
 
 public static void main(String args[]){  
 Scanner number1 = new Scanner(System.in);
 
 int sum = 0;
 
 
 System.out.println("Enter your number");
  int m = number1.nextInt();
 
 
 System.out.println("Enter your number");
  int n = number1.nextInt();
 
 for(int i=m;i<=n;i++){
 if(i%2==0){	 
	 sum = sum+i;
	 }
 }
  
  System.out.println("Sum of "+sum);    
 }  
}  