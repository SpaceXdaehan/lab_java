package edu.java.contact06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ContactCreateFrame extends JFrame {

    private JPanel contentPane;
    private JPanel panel;
    private JPanel buttonPanel;
    private JLabel lblName;
    private JTextField textName;
    private JTextField textPhone;
    private JLabel lblPhone;
    private JTextField textEmail;
    private JLabel lblEmail;
    private JButton btnCreate;
    private JButton btnCancel;

    private Component parent; // 부모 컴포넌트(JFrame)를 저장하기 위한 필드.
    
    /**
     * Launch the application.
     */
    public static void showContactCreateFrame(Component parent) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    ContactCreateFrame frame = new ContactCreateFrame(parent);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ContactCreateFrame(Component parent) {
        this.parent = parent;
        initialize(); // GUI 컴포넌트들을 생성하고 초기화.
    }
    
    public void initialize() {
        setTitle("새 연락처 저장");
        
        // 닫기(x) 버튼의 기본 동작을 현재 창만 닫기(dispose)로 설정.
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // JFrame이 화면에 보이는 좌표
        int x = 100;
        int y = 100;
        if (parent != null) {
            x = parent.getX();
            y = parent.getY();
        }
        setBounds(x, y, 545, 354);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
        
        lblName = new JLabel("이름");
        lblName.setFont(new Font("D2Coding", Font.PLAIN, 28));
        lblName.setBounds(12, 10, 164, 65);
        panel.add(lblName);
        
        textName = new JTextField();
        textName.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textName.setBounds(188, 10, 319, 65);
        panel.add(textName);
        textName.setColumns(10);
        
        lblPhone = new JLabel("전화번호");
        lblPhone.setFont(new Font("D2Coding", Font.PLAIN, 28));
        lblPhone.setBounds(12, 85, 164, 65);
        panel.add(lblPhone);
        
        textPhone = new JTextField();
        textPhone.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textPhone.setColumns(10);
        textPhone.setBounds(188, 85, 319, 65);
        panel.add(textPhone);
        
        lblEmail = new JLabel("이메일");
        lblEmail.setFont(new Font("D2Coding", Font.PLAIN, 28));
        lblEmail.setBounds(12, 160, 164, 65);
        panel.add(lblEmail);
        
        textEmail = new JTextField();
        textEmail.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textEmail.setColumns(10);
        textEmail.setBounds(188, 160, 319, 65);
        panel.add(textEmail);
        
        buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        
        btnCreate = new JButton("저장");
        btnCreate.setFont(new Font("D2Coding", Font.PLAIN, 28));
        buttonPanel.add(btnCreate);
        
        btnCancel = new JButton("취소");
        btnCancel.setFont(new Font("D2Coding", Font.PLAIN, 28));
        buttonPanel.add(btnCancel);
    }
}
