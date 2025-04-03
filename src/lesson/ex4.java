package lesson;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) { // тут полезная хуйня как рестартнуть код
        Scanner scanner = new Scanner(System.in);
        int rest = 0;
        do
        {
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.println("Ведите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Равно: " + a * b);

        System.out.println("Завершаем работу программы? (Введите 1, для завершения работы) ");
        rest = scanner.nextInt();
        }
        while (rest!=1); {
            System.out.println("Бб, клоун");
            System.exit(0);
        }
        }
    }