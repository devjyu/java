package ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
    
public class S01 {
    public static void main(String[] args) {
        // 순서가 있고 데이터 중복이 가능하다
        List list = new ArrayList<>();
        // 순서가 없고 데이터 중복이 불가능하다
        // key만으로 이루어져 있다
        Set set = new HashSet<>();
        // 순서가 없고 key, value로 이루어져있다
        // key는 중복이 불가능하고 value는 중복이 가능하다
        Map map = new HashMap<>();
        // 나중에 들어온 값이 먼저 나간다
        Stack Stack = new Stack<>();
        // 먼저 들어온 값이 먼저 나간다
        Queue queue = new LinkedList<>();
    }
}
