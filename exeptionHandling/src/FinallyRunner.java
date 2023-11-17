import java.util.Scanner;

public class FinallyRunner {
 public static void main(String[] args) {
  Scanner scanner = null;
  try {
   scanner = new Scanner(System.in);

   int[] numbers = { 1, 2, 3, 4, 5 };

   int number = numbers[6];
   System.out.println("Before scanner close");

  } catch (Exception e) {
   e.printStackTrace();
  } finally {
   scanner.close();
   System.out.println("scanner is closed");
  }
  System.out.println("stop method");
 }

}
