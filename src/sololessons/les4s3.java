package sololessons;

import java.util.Scanner;

public class les4s3 {
    public static void main(String[] args) { // Условные конструкции switch-case
        // В switch-case мы проверяем на четкое значение (не больше и не меньше)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int num = scanner.nextInt();
        switch (num) { // Проверка переменной num
            case 1: // Если переменная равна тому что после case
                System.out.println("Number is 1");
                break; // что бы выйти из switch-case
            case 2:
                System.out.println("Number is 2");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            default: // Это как else, только в switch-case
                System.out.println("Default");
                break; // не обязательно после default
        }
    }
}
