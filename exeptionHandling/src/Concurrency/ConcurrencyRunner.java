package Concurrency;

public class ConcurrencyRunner {
 public static void main(String[] args) {

  BiCounter counter = new BiCounter();
  counter.incrementI();
  counter.incrementI();
  System.out.println(counter.getI());
  counter.incrementJ();
  counter.incrementJ();
  System.out.println(counter.getJ());

 }
}
