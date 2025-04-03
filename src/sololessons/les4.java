package sololessons;

public class les4 {
    public static void main(String[] args) { // Условные конструкции if-else
        int a = 10, b = 10;
        char sym1 = 'A', sym2 = 'A';
        boolean isHasDick = false;

        if(!isHasDick && a > b) { // && - и.
            System.out.println("Норм");
        } else if(isHasDick || a >= b) { // || - или. еще условие (неограничено)
            System.out.println("Пикми");
        } else { // если все иначе
            System.out.println("Не норм");
        }
    }
}
