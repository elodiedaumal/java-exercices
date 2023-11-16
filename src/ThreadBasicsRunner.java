class Task1 extends Thread {

 public void run() {
  System.out.print("\nTask 1 is starting\n");
  for (int i = 101; i < 200; i++) {
   System.out.print(i + " ");
  }
  System.out.print("\nTask 1 is done\n");

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

public class ThreadBasicsRunner {

 public static void main(String[] args) throws InterruptedException {

  // Task 1

  Task1 task1 = new Task1();
  task1.setPriority(1);
  task1.start();

  // Task 2

  Task2 task2 = new Task2();
  Thread task2Thread = new Thread(task2);
  task2Thread.setPriority(10);
  task2Thread.start();

  // Wait for task 1 and 2 to be done
  task1.join();
  task2Thread.join();

  // Task 3
  System.out.print("\nTask 3 is starting");
  for (int i = 301; i < 400; i++) {
   System.out.print(i + " ");
  }
  System.out.print("\nTask 3 is done");

  System.out.print("\nMain method is done");
 }
}