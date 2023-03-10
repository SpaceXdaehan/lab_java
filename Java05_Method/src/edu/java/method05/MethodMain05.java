package edu.java.method05;

public class MethodMain05 {

    public static void main(String[] args) {
        System.out.printf("이름: %s \n", "오쌤");
        System.out.printf("이름: %s, 나이: %d \n", "오쌤", 16);
        System.out.printf("이름: %s, 나이: %d, 키: %f \n", "오쌤", 16, 180.5);

        // 가변 길이(variable-length) argument를 갖는 메서드:
        // 파라미터를 선언할 때, 변수 타입 뒤에 "..."을 붙임.
        // 가변 길이 아규먼트는 메서드 안에서는 배열처럼 취급함.
        // (주의) 가변 길이 아규먼트는 가장 마지막 파라미터로 선언해야 함!
        // (주의) 가변 길이 아규먼트를 갖는 파라미터는 오직 1개만 선언할 수 있음.
        
    }

}
