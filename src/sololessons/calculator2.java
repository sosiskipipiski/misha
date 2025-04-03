package sololessons;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) { // Калькулятор 2
        Scanner scanner = new Scanner(System.in);
        int res;

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Операция: ");
        String operation = scanner.nextLine();
        operation = scanner.nextLine(); // Почему-то java скпиает 17-ую строчку, поэтому нужно еще раз написать scan

        switch (operation) { // Проверка переменной operation методом switch-case
            case "+": // Если переменная равна +
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-": // Если переменная равна -
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*": // Если переменная равна *
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/": // Если переменная равна /
                if(num2 == 0) // Если второе число равно 0, то выдаст ошибку, т.к. на ноль делить нельзя
                    System.out.println("На ноль делить нельзя!");
                else { // Если num2 не равен 0, то выполняем все так как должно быть
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default: // Если вдруг пользователь введет что-нибудь не то
                System.out.println("Ошибка!");
        }
    }
}
