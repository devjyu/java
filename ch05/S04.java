package ch05;

public class S04 {
    public static void main(String[] args) {
        String[] strArray = {"바나나", "사과", "멜론"};
        System.out.println(strArray.length); // 3

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]); // 바나나 사과 멜론
        }
    }
}
