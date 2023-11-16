import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorServiceRunner {
 public static void main(String[] args) {
  ExecutorService executorService = Executors.newSingleThreadExecutor();

  executorService.execute(new Task1());
  executorService.execute(new Thread(new Task2()));

  System.out.print("\nTask 3 is starting");
  for (int i = 301; i < 400; i++) {
   System.out.print(i + " ");
  }
  System.out.print("\nTask 3 is done");

  System.out.print("\nMain method is done");

 }
}
