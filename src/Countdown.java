import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {

    public static void main(String[] args){
//        JAVA COUNTDOWN TIME PROGRAM
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds to count down from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {

                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }

            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
