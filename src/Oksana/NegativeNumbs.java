package Oksana;

import java.util.Arrays;
import java.util.Random;

public class NegativeNumbs {
    public static void main(String[] args) {
        float [] array = new float[20];
        Random r = new Random();

        for (int i = 0; i < array.length ; i++)
        {
            array[i] = r.nextFloat(100+100) - 100;
        }
        int count = 0;
        for (float value: array)
        {
            if (value < 0 ){
                count++;
            }
        }
       negative(array, count);

    }
    public static void negative (float [] a, int n){
        int negativeCount = 0;
        float[] b = new float[n];

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
