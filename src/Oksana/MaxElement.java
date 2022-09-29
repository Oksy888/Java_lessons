package Oksana;
//В функции main() проинициализировать двумерный массив размерностью m x n вещественных чисел
//Создать функцию, которая принимает в качестве параметра массив, находит максимальный по модулю элемент массива
//и возвращает найденное значение. Результат вывести на экран.

public class MaxElement {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {4,-7,3},
                {95,1,-96},
                {1,-3},
                {0,100}
        };
        int m = 0;
        int n = 0;

        for( int i= 0; i < array.length; i++){
            m++;
              for (int j = 0; j < array[i].length; j++){
                n++;
            }

        }
        int d = n-2*m;
       System.out.println(maxElem(array, m, d));
    }
    public static int maxElem(int[][] a, int m, int n){
        int maxEl = a[0][0];
        int [][] arr = new int[m][];
        System.arraycopy(a,0,arr,0, arr.length);

        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = Math.abs(arr[i][j]);

            }
        }
        //Math.abs(a[][])
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > maxEl){
                    maxEl = arr[i][j];
                }
            }
        }
        return maxEl;
    }
}
