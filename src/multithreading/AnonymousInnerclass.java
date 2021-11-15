package multithreading;

public class AnonymousInnerclass {
    public static void main(String[] args) {

    MyInterface obj = new MyInterface() {
        @Override
        public Integer add(int a, int b) {
            return a + b;
        }

        @Override
        public Integer sub(int a, int b) {
            return a - b;
        }
    };
        System.out.println(obj.add(2,3));
        System.out.println(obj.sub(5,3));

}

}
interface MyInterface{
    Integer add(int a, int b);
    Integer sub(int a, int b);
}
