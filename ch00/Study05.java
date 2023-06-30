package ch00;

public class Study05 {
    public static void main(String[] args) {
        // 스코프
        // 자바 변수는 기본적으로 블록 단위
        // 어디서든 접근 할 수 있는 변수
        // 함수
        // 함수 내에서 작동하고 벗어나면 없어지는 변수
        // 블록
        // 블록 내에서만 작동하고 벗어나면 없어지는 변수
        // if / for / while 등 중괄호롤 감싸지는 영역
        // 자바 변수는 기본적으로 블록 단위

        // int i = 0;
        // while (i <10) {
        //     int a = 1;
        //     System.out.println(a);
        //     i++;
        //     a++;
        // }
        // System.out.println(i);

        // 블록 스코프 내에서 만든 변수는 
        // 블록을 빠져나오면 없어진다
        // int a = 0;
        // if (true) {
        //     // int a = 1; // 작동안됨
        // }
        // System.out.println(a);

        // for에서 만든 변수는
        // 반복이 끝날 때까지 살아 있다
        // 반복이 종료되면 없어진다.
        // for (int i = 0; i < 10; i++) {
        // }
        // System.out.println(i); //작동안됨

        // while을 쓸 때 같은 변수로 여러개의 while을 사용하려면
        // 새로운 while을 쓰기 전에 변수를 초기값으로 변경해야 한다.
        // int i = 0;
        // while (i < 10) {
        //     System.out.println("첫번째 while");
        //     i++;
        // }
        // i = 0; // 원래 쓰던 변수를 초기화해줘야 함.
        // while (i < 10) {
        //     System.out.println("두번째 while");
        //     i++;
        // }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("첫번째 for");
        // }        
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("두번째 for");
        // }

        // 프로그래밍 작동되는 동안 계속 사용할 변수라면 글로벌

        // while에서는 횟수가 정해진 반복문을 사용할 때는
        // 외부에 먼저 변수를 만들고 변수를 변경하면서 사용
        
        // for에서는 소괄호 안에 변수를 만들고 변경하면서 사용

        // if, while, for 등의 블록에서 반복회차마다 새로 사용할 변수는 
        // 블록안에서 만든 후 사용
    } 

}
