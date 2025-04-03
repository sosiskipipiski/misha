package sololessons;

import java.util.Scanner; // импортировали класс Scanner

public class les3 { // Данные от пользователя. Математические действия
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // создали сканнер с именем scan
        System.out.println("Введите ваше имя: "); // это то, что будет написано перед вводом данных
        String user_name = scan.nextLine(); // эта строка говорит о том, что создается новая переменная (от пользователя) с типом string
        System.out.println("Привет " + user_name); // вывод текста с переменной от пользователя

        int num = scan.nextInt(); // что бы пользователь мог ввести целое число
        byte num1 = scan.nextByte(); // что бы пользователь мог ввести маленькое число
        boolean num2 = scan.nextBoolean(); // что бы пользователь мог ввести true/false
        float num3 = scan.nextFloat(); // что бы пользователь мог ввести дробное число
    }
}
