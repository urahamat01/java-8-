public class MyClass {
	
	//Multiple Objects
	
	//Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:
	
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();
    MyClass myObj2 = new MyClass();
    myObj2.x = 25;
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
