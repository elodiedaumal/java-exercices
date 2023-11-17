class Amount {
 private String currency;
 private int amount;

 public Amount(String currency, int amount) {
  this.currency = currency;
  this.amount = amount;
 }

 public void add(Amount other) {
  if (!this.currency.equals(other.currency)) {
   throw new CurrenciesDontMatchExeption("Currencies don't match " + this.currency + " and " + other.currency);
  }
  this.amount = this.amount + other.amount;
 }

 @Override
 public String toString() {
  return amount + " " + currency;
 }
}

class CurrenciesDontMatchExeption extends RuntimeException {
 CurrenciesDontMatchExeption(String message) {
  super(message);
 }
}

public class ThrowingExeption {
 public static void main(String[] args) {
  Amount amount1 = new Amount("USD", 20);
  Amount amount2 = new Amount("EUR", 10);
  Amount amount3 = new Amount("USD", 50);

  amount1.add(amount2);
  System.out.println(amount1);
 }
}
