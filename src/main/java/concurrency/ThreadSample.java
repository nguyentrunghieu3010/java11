package concurrency;

class JobOne {
    void executeTasks() {
        int[] readDocs = {1, 2 ,3, 4, 5};
        for (int readDoc : readDocs) {
            System.out.println("@@ Job 1 Reading page number @@ " + readDoc);
        }
    }
}

class JobTwo {
    void executeTasks() {
        int[] readDocs = {1,2,3,4,5};
        for (int readDoc : readDocs) {
            System.out.println("@@ Job 2 Reading page number @@ " + readDoc);
        }
    }
}

/**
 * Class JobThree is a Thread
 */
class JobThreeThread extends Thread {

    @Override
    public void run() {
        super.run();
        int[] readDocs = {1,2,3,4,5};
        for(int readDoc : readDocs) {
            System.out.println("@@ Job 3 Reading page number @@ " + readDoc);
        }
    }
}

class JobMultipleThread extends JobThreeThread implements Runnable {

    @Override
    public void run() {
        int[] readDocs = {1,2,3,4,5};
        for(int readDoc : readDocs) {
            System.out.println("@@ Job Multiple Thread Reading page number @@ " + readDoc);
        }
    }
}

public class ThreadSample{

    // Main method will represent main thread
    public static void main(String[] args) {

        System.out.println("*****Job 1 === Application Started*****");

        // Job One must be Finished
//        JobOne jobOne = new JobOne();
//        jobOne.executeTasks();

        // Job One must be Finished, will be continue to Execute Job Two
//        JobTwo jobTwo = new JobTwo();
//        jobTwo.executeTasks();

//        JobThreeThread jobThreeThread = new JobThreeThread();
//        jobThreeThread.start(); // Start will internally execute Run method

        Runnable runnable = new JobMultipleThread();
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i=0; i<= 5; i++) {
            System.out.println("@@ Job 2 Reading page number @@ " + i);
        }


        System.out.println("*****Job 3 === Application Close*****");
    }
}
