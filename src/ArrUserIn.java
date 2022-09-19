import java.util.Scanner;

public class ArrUserIn {
    public static void main(String[] arg) {
        int[][] nums2 = new int[3][3];
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число для массива ");
                int value = scanner.nextInt();
                nums2[i][j] = value;
            }

        }
        System.out.println("Ваш массив:");
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.printf("%d ", nums2[i][j]);
            }
            System.out.println();
        }
    }
}
