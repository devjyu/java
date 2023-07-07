package ch11;

import java.util.ArrayList;
import java.util.List;

public class S02 {
    public static void main(String[] args) {
        List list = new ArrayList<>();

        System.out.println(list.size());

        list.add("바나나");
        
        System.out.println(list.size());
        System.out.println(list);
        
        list.add("사과");
        list.add("바나나");
        
        // add한 순서대로 정렬이 되어있다
        System.out.println(list);

        System.out.println(list.get(1));

        list.set(1, "멜론");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

    

    }
}
