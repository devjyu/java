package dev;

import java.util.ArrayList;

public interface Menu {
    // 작성된 메뉴 출력 기능
    public ArrayList<String> printMenu();
    // 사용자 입력 기능
    public int inputNum();
    // 입력된 값의 따라 메뉴 출력
    public void enterMenu(int age, ArrayList<String> items);
    // 아무거나 AI 추천 메뉴 출력
    public void aiPrintMenu(ArrayList<String> items);
}
