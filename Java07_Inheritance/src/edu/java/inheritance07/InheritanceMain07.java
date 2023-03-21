package edu.java.inheritance07;

// 추상 메서드(abstract method):
// 메서드의 signature(수식어, 리턴 타입, 이름, 파라미터 선언)만 선언되어 있고,
// 메서드의 body(본체, { ... })가 구현되지 않은 메서드.
// 추상 메서드는 반드시 abstract 키워드로 수식해야 함.
// 추상 메서드 선언은 반드시 세미콜론(;)으로 끝나야함.

// 추상 클래스(abstract class):
// abstract로 선언된 클래스.
// 추상 메서드를 갖는 클래스는 반드시 추상 클래스로 선언해야 함.
// 추상 클래스는 객체를 생성할 수 없음.

// 추상 메서드와 추상 클래스는 상속하는 하위 클래스에서 메서드 구현을 목적으로 함.

abstract class Animal {
    public abstract void move();
}

public class InheritanceMain07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
