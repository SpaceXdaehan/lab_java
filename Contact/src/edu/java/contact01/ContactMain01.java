package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {
    // 상수(constant)
    private static final int MAX_LENGTH = 5; // 연락처 배열의 최대 길이(원소 개수).
    
    // field
    private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장할 배열.
    private int count = 0; // 연락처 배열에 현재까지 저장된 연락처의 개수. 배열에 저장될 때마다 값 증가.
    private Scanner scanner = new Scanner(System.in); // 입력 도구.

    public static void main(String[] args) {
        System.out.println("***** 연락처 프로그램 v0.1 *****");
        
        ContactMain01 app = new ContactMain01();
        //-> static이 아닌 메서드들을 사용하기 위해서 참조 변수를 생성.
        
        boolean run = true;
        while (run) {
            int menu = app.showMainMenu();
            switch (menu) {
            case 0: // 프로그램 종료
                run = false;
                break;
            }
        }

        System.out.println("***** 프로그램 종료 *****");
    }
    
    public int showMainMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
        System.out.println("---------------------------------------------------------");
        System.out.print("선택> ");
        
        // 콘솔 창에서 입력된 문자열 1개 라인을 정수(int)로 변환.
        int result = Integer.parseInt(scanner.nextLine());
        
        return result;
    }

}
