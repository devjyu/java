package ch04;

public class S12 {
    public static void main(String[] args) {
        // for. while 문을 이용해서 별찍기
        // "*****" 안됨 "*" 이걸루

        // 1번문제
        // *****
        // *****
        // *****
        // *****
        // *****

        System.out.println("1번문제");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i < 6; i++) {
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.println("*");
        }

        // 2번문제
        // *
        // **
        // ***
        // ****
        // *****

        System.out.println("2번문제");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("------------------");

        


        // 3번문제
        // *****
        // ****
        // ***
        // **
        // *

        System.out.println("3번문제");
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("-----------");

        
        for (int i = 5; i < 0; i++) {
            System.out.println("*".repeat(i));
        }

        // 4번문제
        // *****
        //  *** 
        //   *


        System.out.println("4번문제");
        for (int i = 1; i < 4; i++) {
            if(i == 1){
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
            else if(i == 2){
                System.out.print(" ");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("");
            }
            else{
                System.out.print(" ");
                System.out.print(" ");
                System.out.print("*");
                System.out.print("");
                System.out.println("");
            }
        }

        // 5번문제
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        System.out.println("5번문제");
        System.out.println("---------");

        for (int i = 1; i < 6; i++) {
            if (i >= 2 && i <= 4) {
                System.out.print("*");
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");
                System.out.println("*");
            }
            else{
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
        }
        

    }
}
