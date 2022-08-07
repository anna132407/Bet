import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    public static void method() {
        String outputFileName = "file.txt";
        System.out.println("Введите ставку \n");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("q")) {
                    System.out.println("Для завершения нажмите q. Для продолжения нажмите любую клавишу");
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}


