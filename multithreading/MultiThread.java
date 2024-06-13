package multithreading;

public class MultiThread extends Thread{
    public void run()
    {
        try {
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}


 class Multithreading {
    public static void main(String[] args)
    {
        int n = 8; //  threads
        for (int i = 0; i < n; i++) {
            MultiThread object
                    = new MultiThread();
            object.start();
        }
    }
}
