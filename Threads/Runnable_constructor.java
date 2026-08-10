class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Classic Bullet");
    }
}

class Main {
    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread v = new Thread(r, "Hello");

        v.start();

        System.out.println("Thread name is " + v.getName());
    }
}
