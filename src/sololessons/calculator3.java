package sololessons;

import java.util.Scanner;

public class calculator3 {
    public static void main(String[] args) { // Калькулятор 3 (с рестартом проги)
        Scanner scanner = new Scanner(System.in);

        String rest;
        int res;

        do
        {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            System.out.print("Операция: ");
            String operation = scanner.nextLine();
            operation = scanner.nextLine();

            switch (operation) {
                case "+":
                    res = num1+num2;
                    System.out.printf("Результат: " + res);
                    break;
                case "-":
                    res = num1-num2;
                    System.out.printf("Результат: " + res);
                    break;
                case "*":
                    res = num1*num2;
                    System.out.printf("Результат: " + res);
                    break;
                case "/":
                    if(num2 == 0)
                        System.out.println("На ноль делить нельзя!");
                    else {
                        res = num1 / num2;
                        System.out.println("Результат: " + res);
                    } // Конец else
                default:
                    System.out.println("Ошибка!");
            } // Конец switch
            System.out.print("\nЗавершаем работу  программы? (y/n): ");
            rest = scanner.nextLine();
        } // Конец do
        while ("y".equals(rest)); {
            System.out.print("До свидания!");
            System.exit(0);
        } // Конец while
    }
}

