package edu.java.contact03;

import edu.java.contact.model.Contact;

// MVC(Model-View-Controller) 아키텍쳐에서 컨트롤러 구현 클래스.
// singleton 디자인 패턴을 적용.

public class ContactDaoImpl implements ContactDao {
    // singleton step 1
    private static ContactDaoImpl instance = null;
    
    // singleton step 2
    private ContactDaoImpl() {};
    
    // singleton step 3
    public static ContactDaoImpl getInstance() {
        if (instance == null) {
            instance = new ContactDaoImpl();
        }
        
        return instance;
    }

    // fields
    private static final int MAX_LENGTH = 5; // 배열의 길이(크기)
    private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처 객체들을 저장할 배열
    private int count = 0; // 배열에 현재까지 저장된 연락처 객체의 개수.
    //-> 배열에 연락처 객체를 저장할 때 +1, 배열에서 연락처 객체를 삭제할 때 -1.
    
    // methods
    /**
     * 연락처 배열에 새로운 연락처 객체를 저장할 수 있는 지를 리턴.
     * @return 배열에 빈 공간이 있으면 true, 그렇지 않으면 false.
     */
    public boolean isMemoryAvailable() {
        return count < MAX_LENGTH;
    }
    
    /**
     * 어떤 인덱스가 검색, 수정, 삭제할 때 사용 가능한 범위 안에 있는 인덱스인 지를 리턴.
     * @param index 유효한 인덱스인 지 검사할 인덱스.
     * @return 사용가능한 인덱스는 true, 그렇지 않으면 false.
     */
    public boolean isValidIndex(int index) {
        return (index >= 0) && (index < count);
    }
    
    // CRUD(Create, Read, Update, Delete) 기능 메서드들:
    @Override
    public int create(Contact c) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Contact[] read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Contact read(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(int index, Contact contact) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

}
