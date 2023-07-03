package ch06;

class Cat{
    String name;
    int hp;
    int position;

    public Cat(String name, int hp, int position) {
        this.name = name;
        this.hp = hp;
        this.position = position;
    }

    // 이름만 받고 피 100 포지션 0
    public Cat(String name){
        this(name, 100, 0);
    }

    public void moveRight(){
        this.position++;
        System.out.println(this.name + "가 오른족으로 이동했습니다.");
        this.hp--;
    }

    public void moveLeft(){
        if(this.position < 1){
            System.out.println(this.name + "는 왼쪽으로 갈 수 없습니다.");
            // 함수(메소드)에서 return을 만나면 아래 코드는 실행되지 않는다
            return;
        }
        this.position--;
        System.out.println(this.name + "가 왼쪽으로 이동했습니다.");
        this.hp--;
    }

    public void reduceHp(){
        this.hp--;
        System.out.println(this.name + "의 체력이 내려갔습니다.");
    }

    public void yam(int food){
        this.hp = this.hp + food;
        System.out.println(this.name + "가 밥을 먹습니다.");
    }

    public String dong(){
        return "이쁜똥";
    }
}


public class S03 {
    public static void main(String[] args) {
        Cat cat = new Cat("야옹이");

        cat.moveLeft();

        cat.moveRight();

        cat.yam(5);

        System.out.println(cat.hp);

        System.out.println(cat.dong());

    }
}
