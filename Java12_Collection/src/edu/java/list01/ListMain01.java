package edu.java.list01;

import java.util.ArrayList;

/*
 * 리스트(list)의 특징:
 * 1. 한가지 타입의 값들을 여러개 저장할 수 있는 데이터 구조체.
 * 2. 값들을 저장하는 순서가 중요 - index를 가지고 있음.
 * 3. 값들을 저장할 때마다 인덱스는 자동으로 증가 - 배열과는 다르게 저장용량이 자동으로 증가.
 * 4. 중간에 있는 값을 삭제하면 인덱스는 자동으로 재배열됨.
 * 5. 같은 값을 여러번 저장할 수 있음 -> Set과 다른 점.
 * 
 * ArrayList의 특징:
 * 1. 배열(array)을 사용하는 리스트.
 * 2. 데이터를 저장(add)하거나 삭제(remove)할 때 속도가 느림.
 * 3. 데이터를 검색(get)할 때 속도가 빠름.
 * 
 * LinkedList의 특징:
 * 1. linked list 알고리즘을 사용한 리스트.
 * 2. 데이터를 저장하거나 삭제할 때 속도가 빠름.
 * 3. 데이터를 검색할 때 속도가 느림.
 * 
 * Collection<E>
 * |__ List<E>
 *     |__ ArrayList<E>, LinkedList<E>, ...
 * 
 */

public class ListMain01 {

    public static void main(String[] args) {
        // 문자열을 저장하는 ArrayList 객체를 생성.
        // ArrayList<저장할 원소 타입> 변수이름 = new ArrayList<>();
        // 생성자 호출에서는 리스트의 원소 타입을 생략해도 됨.
        ArrayList<String> languages = new ArrayList<>(); // new ArrayList<String>();
        
        System.out.println("리스트 크기: " + languages.size());
        System.out.println(languages); // toString() 메서드가 override되어 있음.
        
        // 리스트에 원소 추가: add()
        languages.add("Java");
        languages.add("SQL");
        languages.add("HTML");
        
        System.out.println("리스트 크기: " + languages.size());
        System.out.println(languages);

    }

}
