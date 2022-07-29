import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileTests {

    private final static String searchWord = "аллоха";

    @Test
    public void secondLineShouldHabAlloha(){
        try {
            File file = new File("C:\\Users\\e.danilenko.CMDB-132042\\traineeTestTask\\src\\test\\resources\\ReadFileTests.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            int iterator = 1;
            boolean flag = false;


            while (line != null) {
                if (iterator==2 && line.equalsIgnoreCase(searchWord)) {
                    System.out.println("Найдено во второй строке нужное слово: ".concat(searchWord));
                    flag = true;
                    break;
                }
                // считываем остальные строки в цикле
                line = reader.readLine();
                iterator++;
            }

            if (!flag) System.out.println("Не найдено во второй строке нужное слово: ".concat(searchWord));;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
