
public class App {

    public static void main(String[] args) {
        new TestThreadYield("Thread 1");
        new TestThreadYield("Thread 2");
        new TestThreadYield("Thread 3");
        new TestThreadYield("Thread 4");
        new TestThreadYield("Thread 5");
    }
}
