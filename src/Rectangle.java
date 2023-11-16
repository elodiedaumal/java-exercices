public class Rectangle {

 private int width;
 private int length;

 public Rectangle(int length, int width) {
  this.length = length;
  this.width = width;
 }

 public int getWidth() {
  return width;
 }

 public int getLength() {
  return length;
 }

 public void setWidth(int width) {
  this.width = width;
 }

 public void setLength(int length) {
  this.length = length;
 }

 public int area() {
  return length * width;
 }

 public int perimeter() {
  return (width + length) * 2;

 }

 public String toString() {
  return String.format("length: %d, width: %d, perimeter: %d, area: %d", length, width, perimeter(), area());
 };

}
