import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n в диапазоне от 0 до 10");
        int n = scanner.nextInt();
        int power = 1;
        final int k = 8;
        if (n < 0 || n > 10) {
            System.err.println("Неправильное значение n");
        }
        else {
            for (int i = 0; i <= n; i++){
                System.out.printf("8 ^ %d = %d\n", i, power);
                power *= k;
            }
        }
    }
}

