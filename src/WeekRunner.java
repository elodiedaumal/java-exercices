public class WeekRunner {
 public static void main(String[] args) {
  Week week = new Week("Monday", "Tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");

  System.out.println("Longest day of the week: " + week.getLongestDay());

  week.printDaysBackward();
 }
}