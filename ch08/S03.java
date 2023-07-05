// package ch08;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class S03 {
//     public static void main(String[] args) {
        
//         // 스캐너 -> 마지막에 꼭 close()를 해줘야함

//         Scanner scanner = new Scanner(System.in);

//         int num;

//         try {
//             num = scanner.nextInt();
//         } catch (InputMismatchException e) {
//             num = 0;
//             System.out.println("정수가 아닙니다.");
//             // finally는 try안의 변수와 관련된 객체가
//             // 무조건 처리되어야 할 경우 사용한다.
//             // try안의 코드가 예외가 발생하든 안하든 무조건 실행된다.
//         } finally {
//             scanner.close();
//         }

//         System.out.println(num);
//     }
// }
