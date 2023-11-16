public abstract class AbstractRecipe {
 public void excute() {
  setUp();
  cook();
  clean();

 }

 abstract void setUp();

 abstract void cook();

 abstract void clean();

}
