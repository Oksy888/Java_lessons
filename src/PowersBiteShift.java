import java.util.Scanner;
public class PowersBiteShift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n в диапазоне от 0 до 10");
        int n = scanner.nextInt();
        if (n < 0 || n > 30){
            System.out.println("Не правильное значение n!");
        }
        else {
            for (int i = 0; i <= n; i++){
                System.out.printf("8 ^ %d = %d\n", i, 1 << i*3);
            }
        }
    }
}
