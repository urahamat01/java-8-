class Person3 {
  String fname = "John";
  String lname = "Doe";
  String email = "john@doe.com";
  int age = 24;
  
  /*The code is only accessible in the same package. This is used when you don't specify a modifier*/
  
  public static void main(String[] args) {
    Person3 myObj = new Person3();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}