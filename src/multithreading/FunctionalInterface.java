package multithreading;

public class FunctionalInterface {
    public static void main(String[] args) {

        FunctionalInterface1 obj = (int a, int b) -> {
            return a + b;
        };
        System.out.println(obj.add(2,5));
    }



}
@java.lang.FunctionalInterface
interface FunctionalInterface1{
    Integer add(int a, int b);
}