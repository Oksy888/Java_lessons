package Oksana;
import java.util.Arrays;
public class SortArrayFirstFourAndSecondFour {
        public static void main(String[] args) {
            int[] a = {18, 10, 8, 2, 3, 7, 94, 6, 15, 28};
            System.out.println(Sort(a));
        }
            public static String Sort(int[] a){

                Arrays.sort(a,0,4);
                Arrays.sort(a, a.length-4, a.length);

        /*    for (int i = 6, i < a.length-1; i++){
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                  }
            }*/
                return Arrays.toString(a);
    }
}
