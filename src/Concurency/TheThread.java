package Concurency;

class TheThread extends Thread {
    TheThread() {
    }
    TheThread(Runnable r) {
        super(r);
    }
    public void run() {
        System.out.print("Inside Thread ");
    }
}
class RunnableDemo implements Runnable {
    public void run() {
        System.out.print(" Inside Runnable");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        new TheThread().start();
        new TheThread(new RunnableDemo()).start();
    }
}



