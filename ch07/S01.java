package ch07;

class 초보자{
    String skill1 = "달팽이세마리";
}

class 마법사 extends 초보자{
    String skill2 = "매직클로";
}

// 썬콜 전직 / skill3 / 썬더볼트
class 썬콜 extends 마법사{
    String skill3 = "썬더볼트";
}

// 초보자 -> 로그 -> 시프전직
// 로그 skill2 더블 스탭
// 시프 skill3 새비지 블로우

class 로그 extends 초보자{
    String skill2 = "더블스탭";
}

class 시프 extends 로그{
    String skill3 = "새비지 블로우";
}

public class S01 {
    public static void main(String[] args) {

        마법사 magic1 = new 마법사();
        
        System.out.println(magic1.skill1);
        System.out.println(magic1.skill2);
        // System.out.println(magic1.skill3);
        
    }
}
