package java8;

public class MethodRefToConstructor {
    public static void main(String[] args) {

        //refer
        MyInterface5 myInterface5 = MethodRefToConstructor::new; //interface-obj-class name-new
        //call
        myInterface5.methodRef();

    }
    public MethodRefToConstructor(){
        System.out.println("In constructor");
    }
}
@FunctionalInterface
interface MyInterface5{
    MethodRefToConstructor methodRef(); // constructor or class name
}
