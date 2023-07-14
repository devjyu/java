package dev;

import java.util.ArrayList;

// import java.util.ArrayList;
import java.util.List;
// import java.util.Random;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("오늘 뭐 먹지?");

        Menu menu = new MenuImpl();
        Myclass mc = new Myclass();

        ArrayList<String> items = menu.printMenu();
        int age = menu.inputNum();
        menu.enterMenu(age, items);
        // 메뉴 작성
        // String[] items = { "돈가스", "국밥", "칼국수", "김밥" };
        // // 메뉴를 출력
        // // System.out.println("1. " + items[0]);
        // // System.out.println("2. " + items[1]);
        // // System.out.println("3. " + items[2]);
        // // System.out.println("4. " + items[3]);
        // // System.out.println("5. 아무거나");
        // for (int i = 0; i < items.length; i++) {
        //     System.out.println(i+1 + "."+ items[i]);
        // }
        // 사용자에게 입력받고
        // System.out.print("입력하게요 :");
        // Scanner scanner = new Scanner(System.in);
        // int age = scanner.nextInt();
        // // 만약에 1번을 누르면 선택된 메뉴가 출력
        // if (age == 1) {
        //     System.out.println("1. 돈가스를 선택했습니다.");
        //     System.out.println("맛있게 드세요");
        // }
        // // 만약에 2번을 누르면 선택된 메뉴가 출력
        // if (age == 2) {
        //     System.out.println("1. 국밥을 선택했습니다.");
        //     System.out.println("맛있게 드세요");
        // }
        // if (age == 3) {
        //     System.out.println("1. 칼국수를 선택했습니다.");
        //     System.out.println("맛있게 드세요");
        // }
        // if (age == 4) {
        //     System.out.println("1. 김밥을 선택했습니다.");
        //     System.out.println("맛있게 드세요");
        // }
        // // 아무꺼나 선택기능(AI)
        // // 만약에 6번을 누르면 AI가 추천해주는 메뉴가 출력
        // if (age == 5) {
        //     Random random = new Random();
        //     int rNum = random.nextInt(items.length);
        //     System.out.println("엄청난 빅데이터로 분석하고 머신러닝으로 자동추천됩니다.");
        //     System.out.println("추천된 메뉴 " + items[rNum]);
        //     System.out.println("맛있게 드세요");
        // }

        // 아무꺼나 선택 기능

        // 메뉴작성
        // List list = new ArrayList<>();

        // list.add("국밥");
        // list.add("돈가스");
        // list.add("곱창");
        // list.add("삽겹살");
        // list.add("양꼬치");
        // list.add("한우");
        // list.add("회");
        // list.add("오마카세");

        // // 메뉴 출력
        // // System.out.println(list);

        // // Scanner scanner = new Scanner(System.in);

        // for (int i = 0; i < list.size(); i++) {

        // }

    }
}
