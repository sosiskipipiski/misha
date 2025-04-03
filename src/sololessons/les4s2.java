package sololessons;

import java.util.Scanner;

public class les4s2 {
    public static void main(String[] args) { // Условные конструкции if-else вместе с метдом scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("122")) { // если нужно проверить строки (str), то нужно использовать метод equals
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет, как вас зовут?");
            String name = scanner.nextLine();
        }
    }
}
