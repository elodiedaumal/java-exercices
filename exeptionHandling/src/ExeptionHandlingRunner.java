public class ExeptionHandlingRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    public static void method1() {
        method2();
        System.out.println("Method1 ended");
    }

    public static void method2() {

        System.out.println("Method2 ended");
    }
}
