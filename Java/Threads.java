//            Threads do multiple work at a time, alternatively

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println("Thread 1: Cooking...");
            i++;
        }
    }

    public void greet() {
        System.out.println("HIiii");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 1;
        while (i <= 100) {
            System.out.println("Thread 2: Chatting ...");
            i++;
        }
    }

    public void greet() {
        System.out.println("Helloo");
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();       // Start() method only run the overridden methods
        t1.greet();
        t2.start();
        t2.greet();     // First non-overridden methods run then start() method invoke...

    }
}