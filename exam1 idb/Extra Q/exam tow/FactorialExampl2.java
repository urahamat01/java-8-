import java.util.Scanner;

class FactorialExampl2{  
    public static void main(String args[]){
 

/*
 Scanner scn =new Scanner(System.in);
 int sum =0;
 
 for(i=0; ;i++){
	System.out.println("entered your number :");
	int x = scn.nextint();
	if(x!=-1){
	sum+=x;
	}else{
	break;
	}
 }
 */
 /*
 Scanner input =new Scanner(System.in);
 System.out.println("entered your number :");
 int num, fact=1;
 num = input.nextInt();
for(int i =num;i>=1;i--){

	fact=fact*i;

} 
   */
   
   /*
   Scanner sec = new Scanner(System.in);
   String original, reverse="";
   //String original, reverse = ""; 
   System.out.println("Entered your nuber :");
  original = sec.nextLine();   
      int length = original.length();
    for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome."); 
	   
	   */
	   
	   /*
	   //prime number --------------------
	   Scanner num = new Scanner(System.in);
	   System.out.println("Entered your number :");
	   int num1 = num.nextInt();
	   int i;
	   
	   for( i=2; i<num1;i++){
		   
		   if(num1%i==0){
			   
			   break;
		   }  
	   }
	   if(i==num1){
		   
		   System.out.println("	yes your nuber :");
	   }else{
		   
		   System.out.println("prime not");
	   }
	   */
	   /*
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Entered your number :");
	   String email = input.nextLine();
	   int atpos = email.indexOf("@");
	   int dotpos = email.indexOf(".");
	   
	   if(atpos>0 && dotpos<email.length()-2   && atpos<dotpos-1){
		   
		   
		   System.out.println("valid email number :");
	   }
	   else{
		   
		   
		   System.out.println("not valid");
	   }
   */
   
   /*
   
   Scanner input = new Scanner(System.in);
   
   int sum =0;
   
   for(int i=0; ;i++){
	   System.out.println("Enter your nuber ");
		int x= input.nextInt();
		
		if(x!=-1){
			
			sum+=x;
		}else{
			break;
		}
			
		
   }
   System.out.println("sum :"+sum);
   */
   /*
   Scanner input = new Scanner(System.in);
   int a=0, b=1, c=0, i, count;
   
   System.out.println("Enter your number :");
   
   count = input.nextInt();
   System.out.println(a+" "+b);
   i=0;
   
   while(i<count){
	   c=a+b;
	   System.out.println("  "+c);
	   a=b;
	   b=c;
	   i++;
	   
   }
   */
   
   Scanner input = new Scanner(System.in);
   int sum=0;
   
   for(int i=0; ; i++){
	   System.out.println("Enter your name :");
	   int x = input.nextInt();
	   if(x!=-1){
		   
		   sum+=i;
	   }
	   else{
		   break;
	   }
	   System.out.println("Sum :"+sum);
   }
   
   
   
  //System.out.println("Factorial of 1 to "+num+" is: "+fact);    
 }   
}  

