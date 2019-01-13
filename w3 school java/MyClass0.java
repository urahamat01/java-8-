public class MyClass0 {
  int x = 5;

  public static void main(String[] args) {
    MyClass0 myObj1 = new MyClass0();
    MyClass0 myObj2 = new MyClass0();
    myObj2.x = 25;
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
