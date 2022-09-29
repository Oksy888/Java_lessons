package Oksana;
import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {
            double[] a = { 11, 2.5, 4, 3, 5, 26, 1, 8, 32, 44, 65 };
            boolean mustSort;
            do {
                mustSort = false;
                for (int i = a.length - 4; i < a.length - 1; i++) {
                    if (a[i] < a[i + 1]) {
                        // Меняем элементы местами:
                        double temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        mustSort = true;
                    }
                }
            }
            while (mustSort); // Повторяем до тех пор, пока mustSort равно true
            Arrays.sort(a, 0, 4);
            System.out.println(Arrays.toString(a));
        }

}
