// 인터페이스는 '기능'을 의미
// 여러 클래스에 적용될 수 있다
interface 입{
    void cry();
}

interface 눈{
    void see();
}

interface 날개{
    void fly();
}

class Cat implements 입, 눈{

    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public void see() {
        System.out.println("고양이가 봅니다.");
    }

}

// 인터페이스들이 모이면 종족의 특성이 될 수 있다
abstract class 사람 implements 입, 눈{

}

class 홍길동 extends 사람{

    @Override
    public void cry() {
            
    }

    @Override
    public void see() {

    }

}

class 천사 extends 사람 implements 날개{

    @Override
    public void cry() {
        
    }

    @Override
    public void see() {
    
    }

    @Override
    public void fly() {
    }

}

// 인터페이스는 클래스에서 여러개를 구현할 수 있다
class Dog implements 입, 눈{

    @Override
    public void cry() {
        System.out.println("멍");

    }

    @Override
    public void see() {
        System.out.println("강아지가 봅니다.");
    }

}

public class S08 {
    public static void main(String[] args) {
        
    }
}
