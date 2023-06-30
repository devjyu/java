package ch04;

public class S11 {
    public static void main(String[] args) {
        // do while 무조건 1번은 작동되어야 한다.

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }
}
