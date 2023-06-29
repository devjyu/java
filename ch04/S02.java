package ch04;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt(); //ctrl + alt + v하면 빠져나옴

        if (nextInt < 10) {
            System.out.println("숫자가 10보다 작습니다.");
        } else if (nextInt < 20) {
            System.out.println("숫자가 9보다 크고 20보다 작습니다.");
        } else if(nextInt < 30){
            System.out.println("숫자가 19보다 크고 30보다 작습니다.");
        } else {
            System.out.println("숫자가 29보다 큽니다.");
        }

        scanner.close();
    }
}
