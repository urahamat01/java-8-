import java.util.Scanner;

class PrimeNumberEx{

	public static void main(String...args){
		
		Scanner inport = new Scanner(System.in);
		int n, m, totalPrime=0;
		System.out.print("Enter any number :");
		
		n = inport.nextInt();
		
		System.out.print("Enter any number :");
		
		m = inport.nextInt();
		int count =0;
		
		
		
		for(int i=n; i<m; i++){
			for(int j=2; j<i-1; j++){
			
			
		if(i%j==0){
			
			count++;
			break;
		}
			}
			
			//System.out.print (count);
		
		if(count==0){
			
			System.out.println("prime number " + i );
			
			//total prime number 
			
			totalPrime++;
			
		}
		
		count=0;
		
		}
		System.out.println("Total prime number =" + totalPrime);
		
		
	}

}