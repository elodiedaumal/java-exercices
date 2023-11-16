
public class Adress {

 private String street;
 private String city;
 private String zipCode;

 public Adress(String street, String city, String zipCode) {
  this.street = street;
  this.city = city;
  this.zipCode = zipCode;
 }

 public String toString() {

  return String.format("%s, %s %s", street, city, zipCode);
 }
}
