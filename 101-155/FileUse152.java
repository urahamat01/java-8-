
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class FileUse152{
public static  void main(String... args) {
	
	
	String id, name;
	
	
	try{
	
		Formatter formatter = new Formatter("C:/Users/RONY 1/Desktop/java home/java-8-/101-155/person/index.html");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int num = input.nextInt();
		
		for(int i=1; i<=num;i++){
			System.out.print("Enter your id and name : ");
			
			id= input.next();
			name = input.next();
			
		formatter.format("%s%s\r\n", id, name);
		
		}
		
		formatter.close();
		
	}catch(FileNotFoundException e){
		
		System.out.println(e);
		
	}
	//file2.delete(); file delete are one

}
}