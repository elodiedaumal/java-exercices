public class FanRunner {
 public static void main(String[] args) {
  Fan fan = new Fan("bosch", 0.55, "blue");
  fan.switchOn();
  System.out.println(fan);
  fan.speedIs(5);
  System.out.println(fan);
  fan.switchOff();
  System.out.println(fan);
 }
}