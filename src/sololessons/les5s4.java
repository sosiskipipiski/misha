package sololessons;

public class les5s4 {
    public static void main(String[] args) { // Циклы с...
        int i;
        for (i = 5; i < 25; i ++) {
            if(i % 3 == 0) {
                continue; // Выполняет условие, но при этом продолжает цикл, вместо завершения как break

            } else if(i >= 17) {
                break; // Останавливает цикл
            }

            System.out.println(i);
        }
    }
}