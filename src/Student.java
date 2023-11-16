import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import java.util.Collections;

public class Student {

 private String name;
 private ArrayList<Integer> marks = new ArrayList<Integer>();

 public Student(String name, int... marks) {

  this.name = name;
  for (int mark : marks) {
   this.marks.add(mark);
  }
 }

 public String getName() {
  return name;
 }

 public String getMarks() {
  return " " + marks;
 }

 public int getNumberOfMarks() {
  return marks.size();
 }

 public int getSumOfMarks() {
  int sum = 0;
  for (int mark : marks) {
   sum += mark;
  }

  return sum;
 }

 public int getMaximumMark() {
  return Collections.max(marks);
 }

 public int getMinimumMark() {
  return Collections.min(marks);
 }

 public BigDecimal getAverageMark() {
  BigDecimal sum = new BigDecimal(getSumOfMarks()); // Reuse the sum calculation
  BigDecimal number = new BigDecimal(getNumberOfMarks());

  if (number.equals(BigDecimal.ZERO)) {
   return BigDecimal.ZERO;
  }

  return sum.divide(number, 3, RoundingMode.UP);
 }

 public void addMarks(int mark) {
  marks.add(mark);
 }

 public void deleteMark(int index) {
  marks.remove(index);
 }

}
