import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkInProgress {
    public static void main(String[] args) {
        ExecutorService workInProgess = Executors.newFixedThreadPool(25);
        System.out.println("Start");
        for (int count = 0; count < 25; count++) {
            Runnable task = new MyTask(count);
            workInProgess.submit(task);

        }
    }
}
    class MyTask implements Runnable {

        private int count = 0;

        MyTask(int cnt) {
            count = cnt;
        }

        @Override
        public void run() {
            String [] alfabet = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III", "JJJ", "KKK", "LLL", "MMM", "NNN", "OOO", "PPP", "QQQ", "RRR", "SSS", "TTT", "UUU", "VVV", "WWWW", "XXX", "YYY", "ZZZ" };
            for (String s : alfabet) {
                System.out.println(s);
            }

        }
    }

