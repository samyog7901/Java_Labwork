// Thread Sleep – Demonstrating thread delays using Thread.sleep.

class MySleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println("Thread is sleeping for 500ms: Step " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadDemo5 {
    public static void main(String[] args) {
        MySleepThread t1 = new MySleepThread();
        t1.start();
    }
}
