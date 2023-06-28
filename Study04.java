public class Study04 {
    // 함수
    // 반복적으로 사용하는 로직들을 하나로 모은 것    
    public static void printAdd(int a , int b) {
        System.out.println(" 계산을 시작합니다.");
        System.out.println(a + b);
        System.out.println(" 계산을 끝났습니다.");        
    }
    public static void main(String[] args) {
        // 함수 사용 시 
        // 함수 명을 적어주고
        // 소괄호 안에 함수가 요구하는 타입의 데이터를 넣어준다.
        printAdd(3, 2);
        printAdd(3, 2);
        printAdd(3, 2);
        printAdd(3, 2);
        printAdd(3, 2);
    }
}
