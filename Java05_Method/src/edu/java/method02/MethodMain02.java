package edu.java.method02;

public class MethodMain02 {
    
    public static void main(String[] args) {
        // argument를 가지고, 리턴 값이 있는 메서드 작성/호출 연습
        
        // 같은 클래스 안에서 작성한 메서드인 경우에는 메서드 이름으로만 호출하면 됨.
        double result = add(1, 2); // 메서드 호출. argument - 1, 2.
        System.out.println(result);
    }
    
    /**
     * 실수 2개를 전달받아서, 덧셈 결과를 리턴하는 메서드.
     * @param x 실수(double) 타입.
     * @param y 실수(double) 타입.
     * @return x + y.
     */
    public static double add(double x, double y) {
        // 메서드 정의(선언)
        // 메서드 수식어 - public static
        // 메서드 리턴 타입 - double
        // 메서드 이름 - add
        // 파라미터(parameter) - double x, double y
        
        return x + y; // 리턴 문장. x + y -> 리턴 값.
    }
    
}
