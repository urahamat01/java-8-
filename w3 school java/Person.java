public class Person {
  String fname = "John";
  String lname = "Doe";
  int age = 24;
  
  
  /*Multiple Attributes
You can specify as many attributes as you want:*/

  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}