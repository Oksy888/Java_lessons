public class SumPositiveEl {

     static int sum(int[] a, int n) {
        if (n <= 0) {
            return 0;
        }
        n--;
        if (a[n] > 0){
            return a[n] + sum(a, n);
        }
        else {
            return sum(a, n);
        }
    }
    static int sum(int[] a) {
         return sum(a,a.length);
    }
    public static void main(String[] args) {

        int [] my = {2,5,-3,8,12,-7 };
        //recursive
        System.out.println("Sum is = "+ sum(my));
        //recursive
        var sum = 0;
        for (int i = 0; i < my.length; i++)
        {
            if (my[i] > 0) {
                sum += my[i];
            }
        }
        System.out.println(sum);
    }

}
