package ch04;

public class S08Quiz {
    public static void main(String[] args) {
        // 1000 ~ 1 사이의 숫자 중에서
        // 5의 배수만 제외하고 출력하시오
        // 101미만이 되면 작동을 멈추시오

        int i = 1000;

        // 내가 푼 방식
        while (i > 101) {
            if (i % 5 == 0) {
                continue;
            }
            i--;
            System.out.println(i);
        }

        // 강사님이 푼 방식
        while (i > 0) {
            if (i < 101)
                break;
            if (i % 5 != 0)
                System.out.println(i);
            i--;
        }
    }
}
