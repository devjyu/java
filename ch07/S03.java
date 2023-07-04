// package ch07;

// class Skill{
//     String name; // 스킬 이름
//     int damage; // 공격력

//     public Skill(String name, int damage) {
//         this.name = name;
//         this.damage = damage;
//     }
// }

// class Skill0 extends Skill{
    
//     public Skill0(){
//         super("달팽이 세마리", 1);
//     }

//     public Skill0(String name, int damage){
//         // 부모의 생성자를 호출한다
//         // Skill은 name, damage 둘다 받아야 생성이 되기 때문에
//         // 무조건 부모생성자를 호출해서 값을 넣어줘야 한다
//         super(name, damage);
//     }
// }

// // Skill1 클래스 생성 / 모든 매개변수를 받는 생성자
// class Skill1 extends Skill{
//     public Skill1(String name, int damage) {
//         super(name, damage);
//     }
// }


// class 초보자{
//     Skill skill0;

//     public 초보자() {
//         this.skill0 = new Skill0();
//     }

//     public 초보자(Skill0 skill0){
//         this.skill0 = skill0;
//     }
// }

// // 초보자 -> 마법사 skill2 매직클로 10 콤포지트
// class 마법사 extends 초보자{
//     Skill skill1;

//     public 마법사() {
//         super(new Skill0("달팽이 세마리", 3));
//         this.skill1 = new Skill1("매직클로", 10);
//     }
// }

// public class S03 {
//     public static void main(String[] args) {
        
//     }
// }
