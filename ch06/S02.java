// package ch06;

// class Dog{
//     String name;
//     int position;

//     public Dog(String name, int position) {
//         this.name = name;
//         this.position = position;
//         System.out.println(this.name + "가 태어났습니다.");
//     }
    
//     public Dog(String name){
//         this(name, 0);
//     }

//     public void moveRight(){
//         this.position++;
//         System.out.println(this.name + "가 오른쪽으로 이동했습니다.");
//     }

//     public void moveLeft(){
//         this.position--;
//         System.out.println(this.name + "가 왼쪽으로 이동했습니다.");
//     }
// }

// public class S02 {
//     public static void main(String[] args) {
//         // 고양이 생성
//         Dog dog = new Dog("댕댕이");

//         // 유저가 고양이를 움직임
//         dog.moveRight();
//         dog.moveLeft();

//         // 캐릭터 위치 확인
//         System.out.println(dog.position);
//     }
// }
