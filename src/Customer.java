
public class Customer {

 private String name;
 private Adress homeAdress;
 private Adress workAdress;

 public Customer(String name, Adress homeAdress) {
  this.name = name;
  this.homeAdress = homeAdress;

 }

 public Adress getHomeAdress() {
  return homeAdress;
 }

 public Adress getWorkAdress() {
  return workAdress;
 }

 public void setWorkAdress(Adress workAdress) {
  this.workAdress = workAdress;
 }

 public String toString() {
  return String.format("Customer name: %s, Customer adress: %s, Customer work adress: %s", name, homeAdress,
    workAdress);
 }

}
