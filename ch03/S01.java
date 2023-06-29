package ch03;

public class S01 {
    public static void main(String[] args) {
        int num = 10;

        // 증감 연산자
        // 앞에 있으면 계산이 다 끝난 다음에
        // 값이 대입된다.
        System.out.println(++num);//11
        System.out.println(num);//11

        int num1 = 20;

        // 증감 연산자가 뒤에 있으면
        // 대입이 된 이후에 계산이 시작된다.
        System.out.println(num1++);//20
        System.out.println(num1);//21

        int num2 = 30;
        int num3 = num2++;

        System.out.println(num3);//30
    }
}
