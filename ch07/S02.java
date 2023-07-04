package ch07;

class Skill{
    String name; // 스킬 이름
    int damage; // 공격력

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}

class 초보자{
    Skill skill1;

    public 초보자(Skill skill1) {
        this.skill1 = new Skill("달팽이 세마리", 1);
    }
}

// 초보자 -> 마법사 skill2 매직클로 10 콤포지트
class 마법사 extends 초보자{
    Skill skill2;

    public 마법사(Skill skill1, Skill skill2) {
        super(skill1);
        this.skill2 = new Skill("매직클로", 10);
    }
}

public class S02 {
    public static void main(String[] args) {
        
    }
}
