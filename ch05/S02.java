package ch05;

public class S02 {
    public static void main(String[] args) {
        // 배열의 값을 교환하기
        int[] intArray = new int[2];
        intArray[0] = 1;
        intArray[1] = 2;

        // 임시저장 int
        int temp = intArray[0];

        // 기존에 있던 값이 1이 사라지게 되니까 임시저장을 해줘야한다
        intArray[0] = intArray[1];
        intArray[1] = temp;
    }
}
