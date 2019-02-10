


public class TestThreadYield implements Runnable {

    Thread t;

    TestThreadYield(String str) {
		
        t = new Thread(this, str);
		
        // this will call run() function
		
        t.start();
    }

    @Override
    public void run() {
		
        for (int i = 0; i < 20; i++) {
			
            // yields control to another thread every 5 iterations
			
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread().getName()+ "yielding control...");
				
                /* causes the currently executing thread object to temporarily 
            pause and allow other threads to execute */
			
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }
}
