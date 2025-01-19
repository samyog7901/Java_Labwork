// Running Multiple Threads – Running two threads concurrently.

class Task extends Thread {
    private String taskName;

    public Task(String name) {
        taskName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " is running: Step " + i);
        }
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        Task t1 = new Task("Thread A");
        Task t2 = new Task("Thread B");

        t1.start();
        t2.start();
    }
}
