import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner inputfile = new Scanner(file);
        }catch (Exception e){
            System.out.println("File not found");
        }
    }
}
