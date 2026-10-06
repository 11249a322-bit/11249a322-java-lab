AIM:
To write a Java program to demonstrate multithreading using Thread, yield(), sleep(), and thread termination.

ALGORITHM:
1.Start the program.
2.Create three thread classes A, B, and C by extending the Thread class.
3.In thread A, use Thread.yield() to give other threads a chance to execute.
4.In thread B, print values from 1 to 3 and terminate the thread using return.
5.In thread C, print values and use Thread.sleep(1500) to pause execution for 1.5 seconds.
6.Create objects a, b, and c.
7.Start all three threads using the start() method.
8.Display the termination message of the main thread.
9.Stop the program.
    
PROGRAM:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }
            System.out.println("from thread A i=" + i);
        }
        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                return;   // safely terminate thread B
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}

OUTPUT:
The exact order may vary each time because thread execution is controlled by the Java thread scheduler.
One possible output is:
Start thread A
from thread A i=1
from thread A i=2
from thread B j=1
thread C = 1
exit from main thread
from thread A i=3
from thread B j=2
from thread A i=4
from thread B j=3
exit from B
from thread A i=5
exit from A
thread C = 2
thread C = 3
thread C = 4
thread C = 5
RESULT:
Thus, the Java program to demonstrate multithreading using yield(), sleep(), and thread termination was successfully executed.
