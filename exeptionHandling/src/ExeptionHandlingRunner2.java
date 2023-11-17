public class ExeptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    public static void method1() {
        method2();
        System.out.println("Method1 ended");
    }

    public static void method2() {
        try {
            // String str = null;
            // str.length();
            int[] i = { 1, 2 };
            int number = i[2];
            System.out.println("Method2 ended");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exeption");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exeption");
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Matched exeption");
        }

    }
}
