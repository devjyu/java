package ch11;

import java.util.LinkedList;
import java.util.Queue;

public class S06 {
    public static void main(String[] args) {
        Queue queue = new LinkedList<String>();

        queue.add("사과");
        queue.add("바나나");
        queue.add("멜론");

        System.out.println(queue); //[사과, 바나나, 멜론]

        queue.poll();

        System.out.println(queue); //[바나나, 멜론]

        // 선입선출 - 음식점, 은행 번호표, 롤큐
        System.out.println(queue); //[바나나, 멜론]
    }
}
