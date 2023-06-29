package ch04;

public class S03Temp {
    public static void main(String[] args) {
        int num = 90;

        // 2,3으로 해야 범위가 작아져서 switch문의 코드도 작아진다.
        System.out.println(num % 2);
        // 나머지 -1, 0, 1 나오고
        System.out.println(num % 3);
        // 나머지 -2, -1, 0, 1, 2 나오니까
        // 둘이 합친다면 -1, -2, -3, 1, 2, 3이 나온다.
        // case -1, -2, -3 이면 잘못, 그외의 것은 잘

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
