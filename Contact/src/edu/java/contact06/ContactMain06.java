package edu.java.contact06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.model.Contact;
import edu.java.contact05.ContactDaoImpl;

public class ContactMain06 {
    // 테이블 컬럼 이름 (상수)
    private static final String[] COLUMN_NAMES = {"이름", "전화번호"};

    private JFrame frame;
    private JPanel buttonPanel;
    private JButton btnInsert;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnSearch;
    private JScrollPane scrollPane;
    private JTable table;
    private DefaultTableModel model; // 테이블의 데이터, 컬럼 이름 등을 관리하는 객체.
    
    // 연락처 정보 관리하는 객체(Controller)
    private final ContactDaoImpl dao = ContactDaoImpl.getInstance();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ContactMain06 window = new ContactMain06();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ContactMain06() {
        initialize(); // 화면에 보여질 GUI 컴포넌트들을 생성하고 초기화.
        loadContactData(); // 파일에 저장된 연락처 데이터를 로딩(테이블 초기화).
    }
    
    private void loadContactData() {
        List<Contact> list = dao.read();
        for (Contact c : list) {
            Object[] row = {c.getName(), c.getPhone()};
            model.addRow(row);
        }
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 495, 451);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("연락처 v0.6");
        
        buttonPanel = new JPanel();
        frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
        
        btnInsert = new JButton("새 연락처");
        btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 28));
        buttonPanel.add(btnInsert);
        
        btnUpdate = new JButton("수정");
        btnUpdate.setFont(new Font("D2Coding", Font.PLAIN, 28));
        buttonPanel.add(btnUpdate);
        
        btnDelete = new JButton("삭제");
        btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 28));
        buttonPanel.add(btnDelete);
        
        btnSearch = new JButton("검색");
        btnSearch.setFont(new Font("D2Coding", Font.PLAIN, 28));
        buttonPanel.add(btnSearch);
        
        scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        table = new JTable(); // JTable 타입 객체 생성.
        model = new DefaultTableModel(null, COLUMN_NAMES); // TableModel 객체 생성.
        table.setModel(model); // TableModel 객체를 테이블에 세팅.
        // TODO: 테이블 컬럼 이름의 폰트 변경.
        // TODO: 테이블 데이터 행의 폰트 변경.
        scrollPane.setViewportView(table); // 테이블을 스크롤페인에 넣음.
    }

}
