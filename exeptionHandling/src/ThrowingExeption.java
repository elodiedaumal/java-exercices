class Amount {
 private String currency;
 private int amount;

 public Amount(String currency, int amount) {
  this.currency = currency;
  this.amount = amount;
 }

 public void add(Amount other) throws Exception {
  if (!this.currency.equals(other.currency)) {
   throw new Exception("Currency don't match");
  }
  this.amount = this.amount + other.amount;
 }

 @Override
 public String toString() {
  return amount + " " + currency;
 }
}

public class ThrowingExeption {
 public static void main(String[] args) throws Exception {
  Amount amount1 = new Amount("USD", 20);
  Amount amount2 = new Amount("EUR", 10);
  Amount amount3 = new Amount("USD", 50);

  amount1.add(amount2);
  System.out.println(amount1);
 }
}
