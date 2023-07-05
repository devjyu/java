package sub;

public class Sub01 {
    // 객체지향에서 데이터는 객체만 볼 수 있는게 기본적이다.
    private String data = "데이터";

    // 객체의 데이터를 외부에 노출 시키는 것은
    // 보통 메소드로 한다
    // 원본 데이터를 넘길 수도 있고
    // 숨겨야 하는 부분은 숨길 수도 있다
    public String getData(){
        return "숨긴 " + data;
    }

}
