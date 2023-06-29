package ch03;

public class S05 {
    public static void main(String[] args) {
        // 논리형 ? 사실이면 : 거짓이면

        int age = 70;

        String man = age > 65 ? "할아버지" : "아저씨";
        
        System.out.println(man); //할아버지

        // 삼항 연산자를 겹쳐서 사용하는 경우는 적다
        String man1 = age > 65 ? "할아버지" : age > 20 ? "아저씨" : "학생";
        
        System.out.println(man1);//할아버지
    }
}
