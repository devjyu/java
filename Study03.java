public class Study03 {
    public static void main(String[] args) {
        // 문자는 더하면 합쳐진다
        // System.out.println("hello" + "world");

        // 숫자는 연산된다
        // System.out.println(1 + 1);

        // 문자와 숫자를 더하면 합쳐진다.
        // System.out.println("hello" + 1);
        // 결과 hello1
        
        // 문자와 불린을 더하면 합쳐진다
        // System.out.println("hello" + false);
        // 결과 hellofalse

        int num = 2;
        double doubleNum = 3;
        
        // 정수와 실수를 더하면 실수가 된다.
        System.out.println(num + doubleNum); //결과값 5.0
        
        // 정수와 실수를 빼면 실수가 된다
        System.out.println(num - doubleNum); //결과값 -1.0
        
        // 정수와 실수를 곱하면 실수가 된다
        System.out.println(num * doubleNum); //결과값 6.0
        
        // 정수와 실수를 나누면 실수가 된다
        System.out.println(num / doubleNum); //결과값 0.66666666
        System.out.println(doubleNum / num); //결과값 1.5
        
        // 정수와 정수를 나누면 정수가 된다.(나머지 소수가 증발한다.)
        // 몫을 구한다
        System.out.println(3 / 2); //결과값 1
        
        // %는 나머지를 구한다
        System.out.println(3 % 2); //결과값 1
    
    
    
    
    }
}
