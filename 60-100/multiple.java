import java.util.Scanner;

class multiple{

	public static void main(String...args){
		
		Scanner inport = new Scanner(System.in);
		int n,m;
		System.out.print("Enter any number :");
		
		n = inport.nextInt();
		
		
		System.out.print("Enter your number :");
		m = inport.nextInt();
		
		for(int i=n; i<=m; i++){
			
			
		for(int j = 1; j<=10; j++){
			
			System.out.println(i +" X "+ j + i*j);
		}
		System.out.println("\n\n");
		
		}
		
		
		
		
	}

}