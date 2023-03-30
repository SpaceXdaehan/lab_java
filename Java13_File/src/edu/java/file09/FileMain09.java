package edu.java.file09;

import java.io.File;

public class FileMain09 {

    public static void main(String[] args) {
        // 파일, 폴더(디렉토리) 생성, 삭제, 관리
        
        // System.getProperty(key): Java Runtime이 실행 중인 컴퓨터의 여러가지 시스템 정보들을 리턴.
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);
        // CWD(Current Working Directory, 현재 작업 디렉토리): 현재 프로그램이 실행되는 위치.
        
        /*
         * 절대 경로(absolute path):
         *   시스템의 루트(C:\, D:\, ...)부터 파일 또는 폴더가 있는 위치를 찾아가는 방식.
         *   (예) C:\workspaces\lab-java\Java13_File\data\encoding-ansi.txt
         * 
         * 상대 경로(relative path):
         *   현재 작업 디렉토리(CWD)를 기준으로 파일 또는 폴더가 있는 위치를 상대적으로 찾아가는 방식.
         *   (예)  data\encoding-ansi.txt
         *   . - 현재 디렉토리(폴더)
         *     (예) .\data\encoding-ansi.txt
         *   .. - 상위 디렉토리(폴더)
         *     (예) ..\Java11_MVC\src
         *
         * 파일 구분자(file separator):
         *   상위 폴더와 하위 폴더, 폴더와 파일을 구분하기 위한 문자.
         *   MS-Windows - \(backslash)
         *   MS-Windows를 제외한 다른 모든 OS - /(slash)
         * 
         * 문자열 "" 안에서 backslash는 특별한 의미를 갖음(escape 문자):
         *   "\n" - new line(줄바꿈)
         *   "\t" - tab(탭)
         *   "\\" - backslash
         * 
         */
        
        // backslash가 포함된 문자열
        System.out.println("C:\\workspaces\\lab-java\\Java13_File\\data\\encoding-ansi.txt");

        // 프로그램이 실행되는 OS에 따라서 자동으로 파일 구분자가 선택되도록 할 수 있음.
        String path = "data" + File.separator + "encoding-ansi.txt";
        System.out.println(path);
        
    }

}
