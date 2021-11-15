package assignment;

public class Assignment41 {

    public static void main(String[] args) {   //even or odd number bet 1 to 100.
        int n =100;
        System.out.println("\nEven number from 1 to"+n+" are:");
        for (int i = 1; i<=100; i++){
            if (i%2 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd Number 1 to" +n+ " are:");
        for (int i = 1; i<=n; i++){
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }

    }

}
