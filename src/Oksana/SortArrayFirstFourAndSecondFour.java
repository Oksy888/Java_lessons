package Oksana;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayFirstFourAndSecondFour {

    public static void Sort(int[] a){

        Arrays.sort(a,0,4);
        Arrays.sort(a, a.length-4, a.length);

        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a = {18, 10, 8, 2, 3, 7, 94, 6, 15,28};
        Sort(a);

    }
}
