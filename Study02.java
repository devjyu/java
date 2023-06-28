public class Study02 {
    // 한 프로그램 내에 여러 main함수가 있을 수 없다.
    public static void main(String[] args) {
        // 변수
        // 데이터를 자바 프로그램이 실행되는 동안 유지할 때 사용

        // 기본형 타입 변수(예약어 첫글자가 소문자인 타입 - 파란색 친구들도)

        // 정수형 데이터를 저장할 때 int를 사용한다.
        // 정수는 소수가 없는 숫자 ex) -1, -2, 0, 100, 1000
        // 21억정도까지 저장된다.
        int num = 1;
        // long은 정수형 데이터 int보다 큰 숫자를 저장할 때 사용
        // long은 L을 붙여도 되고 안해도 되고지만 확실히 할려면 붙이는게 좋음
        long longNum = 2L;
        
        // 실수형 데이터
        // float는 무조건 F를 붙여줘야함
        float floatNum = 1.2F;

        // 실수형 데이터보다 더 큰 것
        double doubleNum = 1.2;

        // 논리형 데이터
        boolean bool = true; // 또는 false

        // 문자 데이터 (캐릭터의 줄임말 char)
        // 홀 따음표로 감싼다.
        char ch = 'a';

        // 참조형 타입 변수(예약어 첫 글자가 대문자인 타입)

        // 문자열 데이터
        // 쌍 따음표로 감싼다
        String str = "hello world";

    }
}
