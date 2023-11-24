package Javatips;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderWritterRunner {
 public static void main(String[] args) throws IOException {
  Path path = Paths.get(
    "C:\\Users\\elian\\Desktop\\java\\firstjavacode\\studentsmarks\\exeptionHandling\\src\\Javatips\\resources\\sample.txt");
  String fileContent = Files.readString(path);
  System.out.println(fileContent);
 }
}
