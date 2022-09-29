package Oksana;
import java.util.Arrays;
public class SortArrayFirstFourAndSecondFour {
    public static void main(String[] args) {
        int[] array = {18, 10, 8, 2, 3, 7, 28, 6, 4, 19};
        System.out.println(sort(array));
    }

    public static String sort(int[] a) {

       Arrays.sort(a, 0, 4);
        boolean mustSort;
        do {
            mustSort = false;
            for (int i = a.length - 4; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    mustSort = true;
                }
            }
        }
        while (mustSort);
        return Arrays.toString(a);
    }
}