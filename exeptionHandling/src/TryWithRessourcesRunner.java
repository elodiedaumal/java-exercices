import java.util.Scanner;

public class TryWithRessourcesRunner {
 public static void main(String[] args) {

  try (Scanner scanner = new Scanner(System.in)) {

   int[] numbers = { 1, 2, 3, 4, 5 };

   int number = numbers[6];
   System.out.println("Before scanner close");

  }

 }
}