
import java.io.File;


public class FileDemo151{
public static  void main(String... args) {
	
	File dir = new File("person");
	dir.mkdir(); //directory will de created
	
	String path = dir.getAbsolutePath();
	
	
	File file1 = new File("C:/Users/RONY 1/Desktop/java home/java-8-/101-155/person/index.html");
	File file3 = new File(path+"/home.html");
	
	//file create new file create
	File file2 = new File("C:/Users/RONY 1/Desktop/java home/java-8-/101-155/person/about.html");
	
	try{
	
		System.out.println(file1.createNewFile());
		System.out.println(file2.createNewFile());
		System.out.println(file3.createNewFile());
	}catch(Exception e){
		
		System.out.println(e);
		
	}
	//file2.delete(); file delete are one

}
}