public class CustomerRunner {
 public static void main(String[] args) {
  Adress homeAdress = new Adress("calle gardenias", "Malaga", "29013");
  Adress workAdress = new Adress("calle libra", "Malaga", "29000");
  Customer elodie = new Customer("Elodie", homeAdress);
  elodie.setWorkAdress(workAdress);

  System.out.println(elodie);
 }

}
