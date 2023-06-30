package ch04;

public class S10 {
    public static void main(String[] args) {
        // 1에서 100까지 더해주세요

        int result = 0;
        for (int i = 1; i < 101; i++) {
            result = result + i;
        }
        System.out.println(result); // 5050

        // 2에서 100까지 짝수만 더해주세요

        int result1 = 0;
        for (int i = 2; i < 101; i = i + 2) {
            result1 = result1 + i;
        }
        System.out.println(result1); // 2550
    }
}
