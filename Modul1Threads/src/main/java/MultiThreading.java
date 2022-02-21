/*
Med multithreading kan man execute thread simultant.
Det hjælper med at maksimere CPU'en udnyttelse.
Threads er uafhængige, dvs. de har ingen effekt på udførelsen af andre threads.
Hvis der er en exception i én thread vil det ikke forstyrre andre threads.
Brugbart hvis man har flere klienter, gaming med flere spillere  eller
andre opgaver hvor der er flere  uafhængige opgaver.
 */
public class MultiThreading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1); //sådan kan man også lave en thread. Mest brugt
        thread2.start();
        System.out.println(1/0); //det kan ikke lade sig gøre, men de to threads kører stadigvæk
    }
}
class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 10; i >0; i--) {
            System.out.println("Thread #1 : " +i);
            try {
                Thread.sleep(1000);//sætter en lille pause mellem hver iteration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is done");
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Thread #2 : " +i);
            try {
                Thread.sleep(1000);//sætter en lille pause mellem hver iteration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is done");
    }
}
