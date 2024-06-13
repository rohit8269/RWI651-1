package multithreading;

public class ThreadRunnable implements Runnable {
    public void run()
    {
        try {
            // thread that is running
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


class Multi {
    public static void main(String[] args)
    {
        int n = 8; //  threads
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new ThreadRunnable());
            object.start();
        }
    }
}
