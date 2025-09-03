import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FWriter {

    public static void main(String[] args) {

        String filePath = "/Users/matt/Desktop/textOutputFiles/test.txt";
        String textContent = """
        I like Turtles",
        I like Tuna,
        I like multiline
        La la la la line
        """;

        try(FileWriter writer = new FileWriter(filePath);){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
//        Dont always rely on this exception
        catch (IOException e) {
            System.out.println("Could not write file");
            throw new RuntimeException(e);
        }

    }
}
