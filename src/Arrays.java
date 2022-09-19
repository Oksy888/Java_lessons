import java.util.Scanner;

public class Arrays {
    public static void main(String[] arg) {
        int[] scores = new int[10];

        System.out.println("Длина массива1 = " + scores.length);
        System.out.println("Массив2 - зубчатый, с разным количеством элементов:");
       int[][] two = new int[5][];

        for (int b = 0; b < 5; b++) {

           two[b] = new int[b + 2];
        }

        for (int i = 0; i < two.length; i++){
            for (int j = 0; j < two[i].length; j++){

                System.out.printf("%d ", two[i][j] = 0);
            }
            System.out.println();
        }
        System.out.println("Длина зубчатого массива = " + two.length);

        System.out.println("Массив3 - инициализирован и выведен в цикле:");
        int[][] three = new int[][]
           {
                {1,0,3},
                {4,5,9},
                {7,8,12}
           };
        int count = 0;
        int s = 1;

        for (int i = 0; i < three.length; i++){
            for (int j = 0; j < three[i].length; j++){

                System.out.printf("%d ", three[i][j]);
                        count  += s;


            }
           System.out.println();
        }
        System.out.println("Количество элементов массива: "+ count);


        int sum = 0;
        for (int i = 0; i < three.length; i++){
            for (int j = 0; j < three[i].length; j++)
            {
                sum += three[i][j];
            }
        }
        System.out.printf("Сумма элементов массива3 = %d", sum);

    }
}
