package ch07;

// 인터페이스 / 추상클래스 / 클래스를 이용해서
// 스마트폰
// 갤러시 / 아이폰
// 갤럭시 - 통화 / 문자 / 빅스비
// 아이폰 - 통화 / 문자 / 시리
// 갤럭시 - s23
// 아이폰 - IPhone14
interface 통화{
    void call();
}

interface 문자{
    void massage();
}

interface 빅스비{
    void bigsb();
}

interface 시리{
    void siri();
}

abstract class 스마트폰 implements 통화, 문자{

}

class S23 extends 스마트폰 implements 빅스비{

    @Override
    public void call() {
        System.out.println("삼성 ceo 이재용");
    }

    @Override
    public void massage() {
        System.out.println("안녕하신가");
    }

    @Override
    public void bigsb() {
        System.out.println("어떤 것을 도와드릴까요?");
    }

}

class Iphone extends 스마트폰 implements 시리{

    @Override
    public void call() {
        System.out.println("잡스");
    }

    @Override
    public void massage() {
        System.out.println("hello");
    }

    @Override
    public void siri() {
        System.out.println("Can I help you?");
    }

}

public class S08Quiz {
    public static void main(String[] args) {
        S23 galuxyS23 = new S23();
        Iphone appleIPhone = new Iphone();
    }
}
