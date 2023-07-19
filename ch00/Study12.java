package ch00;

// 싱클톤
class Sun{
    //생성자를 private로 만들어서 new를 막는다.
    private Sun() {};

    private static Sun sun = null;

    public static Sun getSun(){
        if (sun == null) {
            // 객체를 한번만 생성

            sun = new Sun();
        }
        return sun;
    }
}

public class Study12 {
    public static void main(String[] args) {
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
        System.out.println(Sun.getSun());
    }
}
