package edu.java.inner03;

import edu.java.inner03.Button.OnClickListener;

public class InnerMain03 {

    public static void main(String[] args) {
        // 1. 버튼 객체 생성
        Button btnOpen = new Button("파일 열기");
        // 2. 버튼을 클릭했을 때 할 일을 구현
        OnClickListener l = new OpenButtonListener(); // 인터페이스 구현 클래스 객체 생성
        // 3. 버튼에 버튼 클릭 기능을 연결
        btnOpen.setOnClickListener(l);
        // 4. 버튼 클릭
        btnOpen.click();

        // 1. Button 타입 객체 생성.
        Button btnSave = new Button("저장");
        
        // 2. 지역 (내부) 클래스(local class) 선언
        class SaveButtonListener implements OnClickListener {
            @Override
            public void onClick() {
                System.out.println("파일 저장...");
            }
        }
        
        // 3. OnClickListener 타입 객체 생성
        OnClickListener listener2 = new SaveButtonListener();
        
        // 4. OnClickLister를 버튼의 기능으로 설정.
        btnSave.setOnClickListener(listener2);
        
        // 5. btnSave의 click 메서드 사용 -> btnSave가 가지고 있는 listener의 onClick() 호출.
        btnSave.click();
        
    }

}
