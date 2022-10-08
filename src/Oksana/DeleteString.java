package Oksana;

import java.util.Scanner;

//3.17 Удаление слов*
//Ввести с клавиатуры строку из нескольких слов, а также некоторую последовательность символов.
// Удалить из строки слова, содержащие введенную последовательность символов в виде подстроки.
//
public class DeleteString {
    public static void main(String[] args) {
        System.out.println("Введите строку из нескольких слов:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Введите некоторые символы:");
        Scanner scanner2 = new Scanner(System.in);
        String chars = scanner.nextLine();
        StringBuffer st1 = new StringBuffer(line);

       int startIndex = line.indexOf(chars);
       st1.delete(startIndex,startIndex + (chars.length()));
       int lastIndex = startIndex + chars.length();
       System.out.println("Start with " + startIndex);
       System.out.println("End with " + lastIndex);

       System.out.println("New string is "+ st1);



    }
}
