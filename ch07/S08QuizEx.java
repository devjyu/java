package ch07;

// 인터페이스 / 추상클래스 / 클래스를 이용해서
// 스마트폰
// 갤럭시 / 아이폰
// 갤럭시 - 통화 / 문자 / 빅스비
// 아이폰 - 통화 / 문자 / 시리
// 갤럭시 - S23
// 아이폰 - IPhone14

interface 통화 {
    void 통화수신(String data);

    String 통화송신();
}

interface 문자 {
    void 문자수신(String data);

    String 문자송신();
}

interface 빅스비 {
    void search(String question);
}

interface 시리 {
    void search(String question);
}

abstract class 스마트폰 implements 통화, 문자 {

}

abstract class 갤럭시 extends 스마트폰 implements 빅스비 {

}

abstract class 아이폰 extends 스마트폰 implements 시리 {

}

class S23 extends 갤럭시 {

    @Override
    public void search(String question) {
        System.out.println("검색 : " + question);
    }

    @Override
    public void 통화수신(String data) {
        System.out.println(data);
    }

    @Override
    public String 통화송신() {
        return "안녕하세요";
    }

    @Override
    public void 문자수신(String data) {
        System.out.println(data);
    }

    @Override
    public String 문자송신() {
        return "당근에서 연락드립니다.";
    }

}

class IPhone14 extends 아이폰 {

    @Override
    public void search(String question) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public void 통화수신(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '통화수신'");
    }

    @Override
    public String 통화송신() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '통화송신'");
    }

    @Override
    public void 문자수신(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '문자수신'");
    }

    @Override
    public String 문자송신() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method '문자송신'");
    }

}



public class S08QuizEx {
    public static void main(String[] args) {

    }
}
