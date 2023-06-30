package ch04;

public class S14 {
    public static void main(String[] args) {
        // 이중 for문
        // repeat 없이
        // "*"

        // 2번문제
        // *
        // **
        // ***
        // ****
        // *****

        System.out.println("2번문제");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 4번문제
        // *****
        //  *** 
        //   *
        System.out.println("4번문제");
        for (int i = 1; i < 6; i+=2) {
            for (int j = 1; j < i; j+=2) {
                System.out.print(" ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 구구단
        // 2 X 1 = 2
        // ...
        // 9 X 1 = 9
        System.out.println("구구단");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + i*j);
            }
            System.out.println("");
        }
    }
}
