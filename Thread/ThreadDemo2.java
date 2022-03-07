// Week 6 : Programming In Java Assignment 2
// In the following program, a thread class Question62 is created using 
// the Runnable interface Complete the main() to create a thread object of the
// class Question62 and run the thread. It should print the output as given below.


public class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + " has ended");
    }

    public static void main(String args[]) {
        ThreadDemo2 t = new ThreadDemo2();
        Thread t1 = new Thread(t);
        t1.setName("Main Thread");
        t1.start();
        System.out.println("Welcome to java Week 6 New Question.");
        t1.setName("Main Thread");
    }

}

// Output : 
// Welcome to java Week 6 New Question.
// Main Thread has ended