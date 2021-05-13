package concurrency;

class Printer {
//    synchronized void printDocuments(int numOfCopies, String docName) {
        void printDocuments(int numOfCopies, String docName) {
        for(int i=1; i<=numOfCopies; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">> Printing " + docName + " " + i);
        }
    }
}

class MyThread extends Thread {
    Printer fPrinter;

    MyThread(Printer fPrinter) {
        this.fPrinter = fPrinter;
    }

    @Override
    public void run() {
        synchronized (fPrinter) {
            super.run();
            this.fPrinter.printDocuments(5, "My Profile on Linkedin.pdf");
        }
    }
}

class YourThread extends Thread {
    Printer fPrinter;

    YourThread (Printer fPrinter) {
        this.fPrinter = fPrinter;
    }

    @Override
    public void run() {
        synchronized (fPrinter) {
            super.run();
            this.fPrinter.printDocuments(5, "Your Profile on Facebook.pdf");
        }
    }
}

public class SynchronizeSample {

    public static void main(String[] args) {

        System.out.println("#### Application Started #####");
        Printer fPrinter = new Printer();
//        fPrinter.printDocuments(5, "MyProfile.pdf");

        // Multiple threads are working/accessing on single Object at the same time
        MyThread myThread = new MyThread(fPrinter);
        YourThread yourThread = new YourThread(fPrinter);

        myThread.start();
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        yourThread.start();

        System.out.println("#### Application Close #####");
    }
}
