package ch11;

import java.util.HashMap;
import java.util.Map;

public class S04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>(); 

        map.put("사과", "3개");
        map.put("바나나", "1개");
        map.put("멜론", "2개");

        System.out.println(map); //{멜론=2개, 사과=3개, 바나나=1개}

        System.out.println(map.get("사과")); //3개

        map.remove("멜론");

        // 이름과 값 둘 다 중요할 때 사용한다
        System.out.println(map); //{사과=3개, 바나나=1개}
    }
}
