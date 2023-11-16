public class Fan {

 private String make;
 private double radius;
 private String color;
 private boolean isOn;
 private int speed;

 public Fan(String make, double radius, String color) {

  this.make = make;
  this.radius = radius;
  this.color = color;
 }

 public String toString() {
  return String.format("make is: %s, radius is: %f, color is: %s, isOn: %b, speed is: %d", make, radius, color, isOn,
    speed);
 };

 public void switchOn() {
  this.isOn = true;
  speedIs(1);
 }

 public void switchOff() {
  this.isOn = false;
  speedIs(0);
 }

 public void speedIs(int speed) {
  this.speed = speed;
 }
}
