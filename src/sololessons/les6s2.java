package sololessons;

import java.util.Scanner;

public class les6s2 {
    public static void main(String[] args) { // Массивы вместе с циклами

        int[] array = new int[4]; // Создали массив без значений
        Scanner scanner = new Scanner(System.in); // Создали сканнер для получения значений от пользователя

        for(int i = 0; i < array.length; i++) {
            System.out.print("Введите значение: "); // Сколько выделено памяти в массиве, столько и запросит значений
            int value = scanner.nextInt();
            array[i] = value;
        }

        int min = array[0];

        for(int i = 0; i < array.length; i++) { // Создали цикл для перебора значений, что бы найти наименьшее
            if(array[i] < min)
                min = array[i]; // Переменные в скобках цикла не работают за их пределами
        }

        int max = array[0];

        for(int i = 0; i < array.length; i++) { // Создали цикл для перебора значений, что бы найти наибольшее
            if(array[i] > max)
                max = array[i];
        }

        System.out.println("Minimal: " + min);
        System.out.println("Maximum: " + max);
    }
}
