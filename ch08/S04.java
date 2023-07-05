// package ch08;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class S04 {
//     public static void main(String[] args) {
       
//         int num;

//         // try의 소괄호 안에는
//         // 자동으로 close 할 수 있는 객체가 들어갈 수 있다.
//         // finally로 close한 것과 같이 처리된다
//         try(Scanner scanner = new Scanner(System.in);) {
//             num = scanner.nextInt();
//         } catch (InputMismatchException e) {
//             num = 0;
//             System.out.println("정수가 아닙니다.");
//             // finally는 try안의 변수와 관련된 객체가
//             // 무조건 처리되어야 할 경우 사용한다.
//             // try안의 코드가 예외가 발생하든 안하든 무조건 실행된다.
//         }

//         System.out.println(num);

//     }
// }
