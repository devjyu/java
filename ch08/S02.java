// package ch08;

// public class S02 {
//     public static void main(String[] args) {
        
//         int[] intArray = {10, 20};

//         // try {
//         //     // 여기서 에러 발생
//         //     System.out.println(10 / 0);
//         //     // 밑으로 안내려감
//         //     // catch로 바로감
//         //     System.out.println(intArray[2]);
//         // } catch (ArithmeticException e) {
//         //     System.out.println("계산중 예외가 발생했습니다.");
//         // }

//         // try {
//         //     // intArray에서 바로 밑에 catch로 넘어감
//         //     System.out.println(intArray[2]);
//         //     System.out.println(10 / 0);
//         //     // 발생할 수 있는 모든 에러에 대한 처리를 각각 해주는 것이 좋다.
//         // } catch (ArithmeticException e) {
//         //     System.out.println("계산중 예외가 발생했습니다.");
//         // } catch (ArrayIndexOutOfBoundsException e1){
//         //     System.out.println("배열검색 범위를 넘어섰습니다.");
//         // }

//         try {
//             System.out.println(10 / 0);
//             System.out.println(intArray[2]);
//             // 중요한 코드가 아닐 경우에는
//             // 한꺼번에 처리할 수도 있다
//             // 최상위 예외 클래스 Exception
//         } catch (ArithmeticException e) {
//             System.out.println("예외가 발생했습니다.");
//         }
//     }
// }
