package Lab9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExFileWriter {
    public static void main(String[] args) {
        Path myPash = Paths.get("C:/Users/LabCom_MT-4/Documents/MyFileCP/Test.txt");
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(myPash,StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
            writer.write("Chalida ");
            writer.newLine();//ขึ้นบรรทัดใหม่

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            }catch (IOException e) {
                e.printStackTrace();
            }



        }
    }


}
