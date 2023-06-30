package ch04;

public class S13 {
    public static void main(String[] args) {
        
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(i);
        //     System.out.print("-");
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("*");
        //     } // *****
        //     System.out.println(); // 엔터(개행)
        // }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(i * j);
                System.out.print(" / ");
            }
            System.out.println();
        }

    }
}
