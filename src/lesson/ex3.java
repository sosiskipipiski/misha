package lesson;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        int summa = scanner.nextInt();

        System.out.println("Введите срок вклада в месяцах: ");
        int months = scanner.nextInt();

        for (int i = 0; i <= months; i++ ) {
            double itogo =+ summa * 0.07 + summa;
        System.out.println("После " + months + " месяцев сумма вклада составит: " + itogo);
        }
    }
}
