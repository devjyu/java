package ch05;

public class S01 {
    public static void main(String[] args) {
        // 배열선언 + 초기화
        int[] intArray = new int[5];

        // 배열의 요소 값 가져오기
        // int 배열은 초기화 할 때 값을 넣지 않으면
        // 모두 0으로 초기화한다
        System.out.println(intArray[0]); // 0

        // 배열의 값 바꾸기
        intArray[0] = 5; 

        System.out.println(intArray[0]); // 0 5

        // 범위를 넘어서 요소 가져오기
        // 에러가 발생한다
        // IndexOutOfBoundsException
        // Index 5 out of bounds for length 5
        // System.out.println(intArray[5]); //에러
    }
}
