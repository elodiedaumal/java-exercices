package Javatips;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
 public static void main(String[] args) {

  List<String> names = new ArrayList<String>();

  names.add("Elodie");
  names.add("Elisa");
  names.add("Mooncake");
  names.add("Luffy");
  List<String> copyOfNames = List.copyOf(names);
  // doNotChange(copyOfNames);

  System.out.println("copy of list " + copyOfNames);
  System.out.println("List " + names);
 }

 private static void doNotChange(List<String> names) {
  names.add("ShouldNotBeAllowed");
 }
}
