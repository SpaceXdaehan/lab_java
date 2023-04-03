package edu.java.lambda01;

import edu.java.lambda01.Calculator.Calculable;

public class LambdaMain01 {

    public static void main(String[] args) {
        // Calculator 타입의 객체 생성
        Calculator calc = new Calculator(1, 2);
        // Calculable 인터페이스 구현 클래스 타입의 객체 생성
        Calculable adder = new CalcAdder();
        // 생성된 객체를 calculate 메서드의 argument로 전달.
        double result = calc.calculate(adder);
        System.out.println("result = " + result);

    }

}
