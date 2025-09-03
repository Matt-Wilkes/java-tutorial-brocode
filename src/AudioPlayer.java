import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {

        public static void main(String[] args) {

            String filePath = "Pulsar.wav";

            File file = new File(filePath);

            try(Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)
            ){
                Clip clip = AudioSystem.getClip();
//           this will open the audio stream
                clip.open(audioStream);

                String response = "";
//          could use threading to check whether the file is still running
                while(!response.equals("Q")){
                    System.out.println("P = play");
                    System.out.println("S = stop");
                    System.out.println("R = reset");
                    System.out.println("Q = quit");
                    System.out.print("Enter your choice: ");
                    response = scanner.next().toUpperCase();

                    switch(response){
                        case "P" -> clip.start();
                        case "S" -> clip.stop();
                        case "R" -> clip.setMicrosecondPosition(0);
                        case "Q" -> clip.close();
                        default -> System.out.println("Invalid choice");
                    }
                }

                System.out.println("No problems detected");
            }
            catch(FileNotFoundException e){
                System.out.println("Could not locate file");
            }
            catch (UnsupportedAudioFileException e) {
                System.out.println("Audio file is not supported");
                throw new RuntimeException(e);
            }
            catch (LineUnavailableException e) {
                System.out.println("Unable to access audio resource");
                throw new RuntimeException(e);
            }
            catch (IOException e){
                System.out.println("Something went wrong");

            }
            finally{
                System.out.println("Bye!");
            }


        }


}
