public class Week {

 private String[] days;

 public Week(String... days) {

  this.days = days;

 }

 public String getLongestDay() {
  if (days == null || days.length == 0) {
   return null; // Return null for an empty week or null days array
  }

  String longestDay = days[0];
  for (String day : days) {
   if (day.length() > longestDay.length()) {
    longestDay = day;
   }
  }
  return longestDay;
 }

 public void printDaysBackward() {
  for (int i = days.length - 1; i >= 0; i--) {
   System.out.print(days[i] + ", ");
  }
  ;
 }
}