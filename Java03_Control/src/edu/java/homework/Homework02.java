package edu.java.homework;

public class Homework02 {

    public static void main(String[] args) {
        // 369 게임 출력
        /* 실행 결과
            1   2   *   4   5   *   7   8   *   10  
            11  12  *   14  15  *   17  18  *   20  
            21  22  *   24  25  *   27  28  *   *   
            *   *   *   *   *   *   *   *   *   40  
            41  42  *   44  45  *   47  48  *   50  
            51  52  *   54  55  *   57  58  *   *   
            *   *   *   *   *   *   *   *   *   70  
            71  72  *   74  75  *   77  78  *   80  
            81  82  *   84  85  *   87  88  *   *   
            *   *   *   *   *   *   *   *   *   100
         */
        
        for (int n = 1; n <= 100; n++) {
            int n1 = n % 10; // n을 10으로 나눈 나머지 -> 1의 자릿수
            int n10 = n / 10; // n을 10으로 나눈 몫 -> 10의 자릿수
            
            // 숫자를 출력할 것인 지, "*"를 출력할 것인 지.
            if (n1 == 3 || n1 == 6 || n1 == 9 || n10 == 3 || n10 == 6 || n10 == 9) {
                System.out.print("*\t");
            } else {
                System.out.print(n + "\t");
            }
            
            // 줄바꿈을 할 것인 지, 아닌 지
            if (n % 10 == 0) {
                System.out.println(); // 줄바꿈
            }
        }

    }

}
