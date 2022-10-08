package Oksana;
//Ввести с клавиатуры строку из нескольких слов. Составить строку из первых букв слов с переводом этих букв в верхний регистр.

import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        String firstLetters = "";
        for (String currentWord : words){
            String  firstLetter = String.valueOf(Character.toUpperCase(currentWord.charAt(0)));
            firstLetters += firstLetter;
        }

        System.out.println(firstLetters);
    }
}
