package Oksana;


public class My {
    public static int resolve(int[] array, int arraySize) {

        int num = 0;
        for (int i = 1; i < array.length-1; i++){
            if (array[i+1]<=array.length) {

                if (array[i-1] == 0 & array[i+1] == 0){
                    return num = i;
                }

            }


        }


        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {0,0,0,1};

        System.out.println(resolve(arr,arr.length));

        }
    }

