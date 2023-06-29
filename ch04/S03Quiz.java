package ch04;

import java.util.Scanner;

public class S03Quiz {
    public static void main(String[] args) {
        // 점수를 입력받아서
        // 90점 이상이면 A
        // 80점 이상이면 B
        // 70점 이상이면 C
        // 60점 이상이면 D
        // 60점 미만이면 F

        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();

        switch (nextInt / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

        scanner.close();
    }
}
