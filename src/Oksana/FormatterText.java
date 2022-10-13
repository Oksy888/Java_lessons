package Oksana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

//3.21 Форматирование текста*
//Осуществить форматирование текста с выравниванием по ширине.
// Текст разбить на строки с длиной, не превосходящей заданного количества символов.
// Если очередное слово не помещается в текущей строке, его необходимо переносить на следующую.
//
public class FormatterText {
    public static void main(String[] args) {
        var text = "Среди новшеств, которые были привнесены в язык Java с выходом JDK 8, особняком стоят лямбда-выражения. Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно вызвать в различных местах программы. Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->. Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список параметров выражения, а правая собственно представляет тело лямбда-выражения, где выполняются все действия. Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.";

        Pattern pattern = Pattern.compile("\\s");
        String [] words = pattern.split(text);
        int len = words.length;
        int counter = 0;
        int index = 0;
        ArrayList <String> arrPhrases = new ArrayList<String>();
        StringBuilder bufferPhrases = new StringBuilder();

            while (index != len){
                if (counter <= 30){
                    counter += words[index].length();
                    bufferPhrases.append(words[index]).append(" ");
                    index ++;
                }
                else {
                    arrPhrases.add(String.valueOf(bufferPhrases));
                    bufferPhrases = new StringBuilder();
                    counter = 0;
                  }
            }
            if (bufferPhrases.length() > 0){
                arrPhrases.add(String.valueOf(bufferPhrases));
            }

            for (String el : arrPhrases){
                System.out.println(el);
            }

        System.out.println("Длина текста " + text.length());
    }
}
