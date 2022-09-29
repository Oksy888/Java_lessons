package Oksana;

import java.util.Arrays;
import java.util.Random;

public class NegativeNumbs {
    public static void main(String[] args) {
        double [] array = new double[20];
        Random r = new Random();

        for (int i = 0; i < array.length ; i++)
        {
            array[i] = r.nextDouble(100+100) - 100;
        }
        int count = 0;
        for (double value: array)
        {
            if ( value < 0 ){
                count++;
            }
        }
       negative(array, count);

    }
    public static void negative (double [] a, int n){
        int negativeCount = 0;
        double[] b = new double[n];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0 ){

                b[negativeCount]  = a[i];
                negativeCount++;

            }
        }
        System.out.println( "Количество отрицательных чисел: " + negativeCount);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
