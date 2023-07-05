package ch09;

public class S02 {
    public static void main(String[] args) {
        // 수학 계산용 기능 - 객체가 필요없음 
        // 인스턴스가 아니라 static
        // 0이상 1미만의 랜덤한 doubel
        System.out.println("Math.random() : " + Math.random()); //0.20735816721148037
        // abs는 숫자의 절대값을 리턴한다
        System.out.println("Math.abs(-10) : " + Math.abs(-10)); //10
        // round 5를 기준으로 반올림값을 리턴한다
        System.out.println("Math.round(1.5) : " + Math.round(1.5)); //2
        System.out.println("Math.round(1.4) : " + Math.round(1.4)); //1
        // floor 내림값을 double로 리턴한다.
        System.out.println("Math.floor(1.5) : " + Math.floor(1.5)); //1.0
        System.out.println("Math.floor(1.25) : " + Math.floor(1.25)); //1.0
        // ceil 올림값을 double로 리턴한다
        System.out.println("Math.ceil(1.5) : " + Math.ceil(1.5)); //2.0
        System.out.println("Math.ceil(1.25) : " + Math.ceil(1.25)); //2.0
        System.out.println("Math.ceil(1.0) : " + Math.ceil(1.0)); //1.0
        // pow 제곱값을 double로 리턴한다
        System.out.println("Math.pow(2, 3) : " + Math.pow(2, 3)); //8.0
        // sqrt 루트값을 double로 리턴한다
        System.out.println("Math.sqrt(4) : " + Math.sqrt(4)); //2.0

        System.out.println("Math.PI : " + Math.PI); //3.141592653589793
    }
}
