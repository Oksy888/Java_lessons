package Oksana;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayFirstFourAndSecondFour {

    public static void Sort(int[] a){

        int[] b =  Arrays.copyOfRange(a, 0, 4);
        Arrays.sort(b);
        int[] bb = Arrays.copyOfRange(a, a.length-4, a.length);
        Arrays.sort(bb);
        String arr = Arrays.toString(b);
        String arr2 = Arrays.toString(bb);
        StringBuffer sb = new StringBuffer(arr2);
        sb.reverse();
        System.out.println(arr + arr2);

    }
    public static void main(String[] args) {
        int[] a = {18, 10, 8, 2, 3, 7, 94, 6, 15,28};
        Sort(a);

    }
}
