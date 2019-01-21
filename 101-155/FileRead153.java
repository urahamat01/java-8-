
import java.io.File;
import java.util.Scanner;


public class FileRead153{
public static  void main(String... args) {
	
	
	try{
	File file = new File("C:/Users/RONY 1/Desktop/java home/java-8-/101-155/person/index.html");
	
	Scanner scanner = new Scanner(file);
	
	
	
	while(scanner.hasNext()){
		
		String id = scanner.next();
		String name = scanner.next();
		
	
		
		System.out.println("ID: "+id +"Name: "+name);
		
	}
	scanner.close();
	}catch(Exception e){
		
		System.out.println(e);
		
	}
	//file2.delete(); file delete are one

}
}