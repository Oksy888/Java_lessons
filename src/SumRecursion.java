public class SumRecursion {

    public static double sum(int n) {
        if (n <= 1){
            return 1;
        }
        else {
            return n*n + sum(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(sum(2));
        System.out.println(sum(5));
    }

}
