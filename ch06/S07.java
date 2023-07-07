// package ch06;

// class temp{
//     // 자기 자신을 호출하는 함수
//     // 재귀함수
//     public static int myFunction(int b){
//         int a = 1;
//         if (a + b > 0) {
//             System.out.println("10보다 작습니다.");
//             return myFunction(a + b);
//         } else {
//             return a + b;
//         }

//     }

// }

// public class S07 {
//     public static void main(String[] args) {
//         // temp.myFunction(0);

//         // 대부분의 재귀 함수는 반복문으로 바뀔 수 있다
//         // 특별한 경우가 아니면 재귀함수는 자제한다.
//         while(true){
//             System.out.println("10보다 작습니다.");
//         }
//     }
// }
