package ch03;

public class S03 {
    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        short c = (short)(a + b);

        int num1 = 1000000;
        int num2 = -2000000;
        System.out.println(num1 * num2); //1454759936 부호가 바뀜

    }
}
