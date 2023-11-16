import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

 private int number;

 public Task(int number) {
  this.number = number;
 }

 public void run() {

  System.out.print("\nTask " + number + " is starting\n");
  for (int i = number * 100; i < number * 100 + 100; i++) {
   System.out.print(i + " ");
  }
  System.out.print("\nTask " + number + " is done\n");

 }
}

class Task2 implements Runnable {

 public void run() {
  System.out.print("\nTask 2 is starting\n");
  for (int i = 201; i < 300; i++) {
   System.out.print(i + " ");
  }
  System.out.print("\nTask 2 is done\n");

 }
}

public class ExcecutorServiceRunner {
 public static void main(String[] args) {
  ExecutorService executorService = Executors.newFixedThreadPool(5);

  executorService.execute(new Task(1));
  executorService.execute(new Task(2));
  executorService.execute(new Task(4));

  System.out.print("\nMain method is done");
  executorService.shutdown();
 }
}
