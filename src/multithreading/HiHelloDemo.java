package multithreading;

public class HiHelloDemo {

    public static void main(String[] args) {      //Another way for essy to  code

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =1;i<=5;i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(500);     //Stop the execution for 500 millis using of Thread.sleep();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =1;i<=5;i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500);     //Stop the execution for 500 millis
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();

    }
}
//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