
import java.util.Scanner;

public class DividedClasses {
    static int read(){
        System.out.println("Введите число n");
        return new Scanner(System.in).nextInt();
    }
    static int calc (int n){
        int y = 0;
        for(int i = 1; i <= n; i++) {
            y += i * i;
        }
        return y;
    }
    static void write(int y){
        System.out.println("y = " + y);
    }
    public static void main(String[] arg){
        int n = read();
        int y = calc(n);
        write(y);
    }
}
