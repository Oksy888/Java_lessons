import java.util.Random;
import java.util.Arrays;

public class Rand {
    public static void main(String[] args) {
        int[] a = new int[15];

        Random rand = new Random(100);

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(50); // случайные значения от 0 до 10
        }
        System.out.println(Arrays.toString(a));

    }
}
