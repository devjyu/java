package ch04;

import java.util.Scanner;

public class S02Quiz {
    public static void main(String[] args) {
        // 점수를 입력받아서
        // 90점 이상이면 A
        // 80점 이상이면 B
        // 70점 이상이면 C
        // 60점 이상이면 D
        // 60점 미만이면 F

        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();
        if(nextInt >= 90) {
            System.out.println("A");
        } else if(nextInt >= 80){
            System.out.println("B");
        } else if(nextInt >= 70){
            System.out.println("C");
        } else if(nextInt >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}
