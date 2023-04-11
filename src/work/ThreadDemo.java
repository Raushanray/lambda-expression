package work;

public class ThreadDemo {
    public static void main(String[] args) {
        // first thread : Thread JOHN

        Runnable thread1 = () -> {
            //this is the body of the thread
            //stuff

            for (int i = 0; i <= 10; i++) {

                System.out.println("value of i is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("Ravi");
        t.start();


        Runnable t2 = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i * 2);
                    Thread.sleep(2000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread t22 = new Thread(t2);
        t22.start();
    }
}
