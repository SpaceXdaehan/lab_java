package edu.java.inheritance09;

import java.util.Scanner;

enum Menu {
    // enum 상수(public static final 변수) 선언
    QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE;
}

public class MenuTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // 콘솔창에서 입력받은 정수
        
//        Menu m = Menu.CREATE;
        Menu menu = Menu.getValue(n); // 정수(int)를 전달하면 Menu의 상수들 중 하나를 리턴. 
        switch (menu) {
        case QUIT:
            System.out.println(menu.name());
            break;
        case CREATE:
            System.out.println(menu.name());
            break;
        case READ_ALL:
            System.out.println(menu.name());
            break;
        case READ_BY_INDEX:
            System.out.println(menu.name());
            break;
        case UPDATE:
            System.out.println(menu.name());
            break;
        case DELETE:
            System.err.println(menu.name());
            break;
        }

    }

}
