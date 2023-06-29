package ch04;

public class S03Temp {
    public static void main(String[] args) {
        int num = -17;

        System.out.println(num % 2);
        System.out.println(num % 3);

        switch (num % 2 + num % 3){
            case -1:
            case -2:
            case -3:
                System.out.println("잘못입력하셨습니다.");
                return;
            default:
                System.out.println("잘 입력하셨어요.");
        }
    }
}
