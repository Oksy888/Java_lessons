import java.util.Scanner;
public class Calc {
    public static void main (String [] args) {
        double num1;
        double num2;
        double result = 0;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите первое число:");
        num1 = sc.nextDouble();
        System.out.println("\nВведите второе число:");
        num2 = sc.nextDouble();

        System.out.println("\nВведите оператор, один из следующих '+, -, /, * ':");

        op = sc.next().charAt(0);
        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default: System.out.println("Ошибка! Введите правильный оператор");

        }
        System.out.println("\nРезультат: "+num1 +" " + op + " " + num2 +" = "+ result);
        sc.close();

    }

}
