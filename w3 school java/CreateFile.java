import java.io.File; //Import the file class
import java.io.IOException; //import the iqexception class to handle error


public class CreateFile{
	public static void main(String... args){
	try{
	
	File myobj= new File("filename.txt");
	if(myobj.createNewFile()){
	
	System.out.println("File created:" + myobj.getName());
	
	}else{
	System.out.println("File already exists.");
	
	}
	}
	catch(IOException e){
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	}
}