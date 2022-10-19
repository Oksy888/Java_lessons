package Oksana;

public class Factorial {
    private static long[] f = new long[30];
    public static int last = 0;

    public static long factorial (int n){
        f[0] = 1;
        if ( n > last){
            for ( int i = last+1; i <= n; i++){
                f[i] = i * f [i-1];
                System.out.println( f[i]);
            }
            last = n;
        }

        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(factorial(8));


    }
}
