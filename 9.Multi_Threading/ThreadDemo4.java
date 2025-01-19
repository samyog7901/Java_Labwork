// Synchronization – Preventing data inconsistency with synchronized methods.

class Counter {
    synchronized void printCount(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count from Thread " + n + ": " + i);
        }
    }
}

class MySyncThread extends Thread {
    Counter counter;
    int threadId;

    public MySyncThread(Counter c, int id) {
        counter = c;
        threadId = id;
    }

    public void run() {
        counter.printCount(threadId);
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new MySyncThread(counter, 1);
        Thread t2 = new MySyncThread(counter, 2);

        t1.start();
        t2.start();
    }
}
