package Oksana;

import java.util.Arrays;

//3.12 Сортировка вставками*
//В функции main() проинициализировать одномерный массив целых чисел.
// Создать функцию, которая осуществляет упорядочение массива методом сортировки вставками.
// Алгоритм заключается в следующем:
//
//перебираем все элементы массива по очереди;
//выбираем очередной элемент массива, сдвигаем, если нужно, элемент влево, пока он не окажется
// на нужной позиции (при этом элементы, стоящие между первоначальной и окончательной позициями
// данного элемента, сдвигаются вправо);
//продолжаем до тех пор, пока не переберем все элементы массива.
//Результат вывести на экран.
//
public class SortByInsert {
    public static void main(String[] args) {
        int[] array = new int[] {10,22,1,13,9,17,16,32,25,2,4};
        System.out.println(sort(array));

    }
    public static String sort(int[] a){
        boolean mustSort;
    do{
        mustSort = false;
        for (int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                mustSort = true;
            }
        }

    }
    while (mustSort);
        return Arrays.toString(a);
    }
}
