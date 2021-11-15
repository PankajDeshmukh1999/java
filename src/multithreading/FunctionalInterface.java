package multithreading;

public class FunctionalInterface {
    public static void main(String[] args) {
        Functional1 obj = (int a, int b) ->{
            return a+b;
        };
        System.out.println("add->"+obj.add(45,45));

    }
}
@java.lang.FunctionalInterface
interface Functional1{
    Integer add(int a, int b);
}
