package Oksana;

public class WorkWithString {
    public static void main(String[] args) {
        String text = "FIFA will!never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }

        String tel = "+3805059563123";
        var result = tel.matches("(\\+*)\\d{13}");
        if (result){
            System.out.println("Ви ввели телефонный номер");
        }
        else {
            System.out.println("Это не телефонный номер");
        }

    }

}
