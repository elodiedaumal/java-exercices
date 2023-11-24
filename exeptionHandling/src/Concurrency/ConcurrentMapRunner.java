package Concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
 public static void main(String[] args) {

  ConcurrentHashMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
  String string = "ABCD ABCD ABCDE";
  for (char character : string.toCharArray()) {
   occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();

  }
  System.out.println(occurances);
 }
}
