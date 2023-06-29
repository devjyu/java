package ch02;

public class S01 {
    public static void main(String[] args) {
        System.out.println(65); //65
        // 형변환
        // 리터럴 앞에 소괄호를 적고
        // 소괄호 안에 타입을 적는다
        // 명시적형변환 -> 가로를 적어서 해주는 것
        System.out.println((char) 65); //A
        // 범위가 적은 타입에서 큰 타입으로 변환 할 때는
        // 보통 문제가 없다
        System.out.println((double) 65);//65.0
        // 범위가 큰 타입에서 적은 타입으로 변환 할 때는
        // 데이터 소실이 일어날 수 있다
        System.out.println((int) 65.1);//65
        // 다른 타입을 계산하게 되면
        // 범위가 큰 타입으로 자동으로 형변환(캐스팅) 된다.
        // 묵시적 형변환 -> 가로를 해주지 않은 것
        System.out.println(3.0 / 2);//1.5
        System.out.println(3.0 / (double) 2);//1.5
        System.out.println(3 / 2.0);//1.5
    }
}
