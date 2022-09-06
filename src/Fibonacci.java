public class Fibonacci {
    public static void main (String [] args) {
    //var fibonacci = new Fibonacci();
       var n = 12;
       var res = GetFibonacciByNum(n);
    System.out.println("Сумма всех чисел Фибоначчи до "+ n +": " +res);
    System.out.println("Рекурсивным методом: " + recursive(n));

    }
    public static long GetFibonacciByNum(int n){
        if (n == 0) {
            return 0;
        }
        if (n < 0 || n > 92){
            throw new IndexOutOfBoundsException(n);
        }
    var n0 = 0L;
    var n1 = 1L;
    for (int i = 2; i <= n; i++){
        var n2 = n0 + n1;
        n0 = n1;
        n1 = n2;
        System.out.println(n1);
    }
        return n1;
    }
    private static long recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 2) + recursive(n - 1);
    }

}

