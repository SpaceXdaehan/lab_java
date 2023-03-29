package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMain02 {

    public static void main(String[] args) {
        // 대용량 파일 복사:
        // data/ratings.dat 파일을 읽고 data/ratings-copy.dat 파일에 복사.
        // (1) read(), write(int b) 사용할 때 복사 시간 측정.
        // (2) read(byte[] b), write(byte[] b, int off, int len) 사용할 때 복사 시간 측정.
        
        String origin = "data/ratings.dat"; // 원본 파일 경로, 이름
        String dest = "data/ratings-copy.dat"; // 복사할 파일 경로, 이름
        
        FileInputStream in = null; // 파일 읽기 통로
        FileOutputStream out = null; // 파일 쓰기 통로
        try {
            in = new FileInputStream(origin);
            out = new FileOutputStream(dest);
            
        } catch (Exception e) {
            e.printStackTrace(); // 예외 이름, 내용, 발생한 코드 위치를 콘솔창에 출력.
        } finally {
            try {
                in.close();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
