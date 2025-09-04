import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class JavaAlarmClock {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = null;

        String filePath = "Pulsar.wav";

        while(alarmTime == null){
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
//                throw new RuntimeException(e.getMessage());
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
//        This will run on a different thread, alarmclock implements runnable
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }

}
