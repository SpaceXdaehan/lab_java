package edu.java.singleton;

// singleton(싱글톤): 오직 한번만 생성할 수 있는 객체.

public class Captain {
    private String name = "캡틴 아메리카";
    
    // (1) private static Captain 타입의 필드
    private static Captain instance = null;
    
    // (2) private 생성자
    private Captain() {}

    // (3) public static이고, Captain을 리턴하는 메서드
    public static Captain getInstance() {
        if (instance == null) {
            instance = new Captain();
        }
        
        return instance;
    }
    
}
