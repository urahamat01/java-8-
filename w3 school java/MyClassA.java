/* Code from filename: Person.java 
public class Person {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
}
*/

class MyClassA{
  public static void main(String[] args) {
    Person11 myObj = new Person11(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
