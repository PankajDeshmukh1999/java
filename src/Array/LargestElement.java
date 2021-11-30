package Array;

import java.util.Arrays;

public class LargestElement {
    public  static  int largestElement(int [] a, int b){
        Arrays.sort(a);
        return a[b-1];
    }

    public static void main(String[] args) {
        int [] a = {11,12,13,88};
        System.out.println("Largest:"+largestElement(a,4));
    }
}
