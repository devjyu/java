package ch03;

public class S04 {
    public static void main(String[] args) {
        System.out.println(3 > 2);//true

        boolean check = 100 >= 100;

        boolean check1 = true && true;
        System.out.println(check1); //true

        boolean check2 = true && false;
        System.out.println(check2); //false

        boolean check3 = false && false;
        System.out.println(check3); //false

        boolean check4 = true || false;
        System.out.println(check4); //true

        // 계산을 6번
        boolean check5 = true && true && true && true && true && false;
        // 계산을 1번
        // 로직을 짤 때 and 조건을 걸 때에는 false가 자주나오는 조건을 앞에 건다.
        boolean check6 = false && true && true && true && true && true;
        System.out.println(check5);//false
        System.out.println(check6);//false

        // 계산을 4번
        boolean check7 = false || false || false || true;
        // 계산을 1번
        // 로직을 짤 때 or 조건을 걸 때에는 true가 자주 나오는 조건을 앞에 건다.
        boolean check8 = true || false || false || false;
        System.out.println(check7);//true
        System.out.println(check8);//true
    
    }
}
