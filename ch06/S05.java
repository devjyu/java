// package ch06;

// // 함수를 사용하기 위한 클래스
// class CalcUtil {

//     // static을 사용하면 객체를 생성하지 않아도 기능을 사용할 수 있다
//     // 함수
//     // 리턴 타입은 없거나 있을 수 있다 (아래 함수는 int를 리턴한다.)
//     // 함수의 이름은 개발자가 정한다 (기능과 관련 있는 이름을 추천)
//     // 소괄호 안에는 외부에서 받아올 데이터 타입과 변수명을 적는다
//     // 외부 데이터를 매개변수 / 인자 / 인수
//     public static int add(int a, int b){
//         // return 뒤에는 내부에서 연산된 값을 요청한 곳에 되돌려 준다
//         // 리턴 타입이 없으면 return을 적지 않거나
//         // return; 으로 마무리 할 수 있다.
//         return a + b;
//     }

// }

// public class S05 {
//     public static void main(String[] args) {
        
//         // 호출된 함수는 (CalcUtil.add)는 결과 값으로 바뀐다.
//         // ex)자판기에 500원을 넣으면 
//         // 자판기에서 콜라가 나오는게 아니라
//         // 자판기 자체에서 콜라가 되어버리는 것과 비슷하다
//         int result = CalcUtil.add(2, 3);

//         System.out.println(result);
//     }
// }
