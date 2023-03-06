package edu.java.loop04;

public class LoopMain04 {

    public static void main(String[] args) {
        // 반복문에서 break와 continue

        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                break;
            }
            System.out.println(n);
        }
        
        System.out.println("----------");
        
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println(n);
        }
        
    }

}
