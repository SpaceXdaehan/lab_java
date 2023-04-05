package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AppMain07 {
    // JTable에서 사용할 컬럼 이름들
    private static final String[] COLUMN_NAMES = {"국어", "영어", "수학", "총점", "평균"};

    private DefaultTableModel model; // 테이블의 행, 열에 대한 정보를 갖는 객체
    private JFrame frame;
    private JLabel lblKorean;
    private JTextField textKorean;
    private JTextField textEnglish;
    private JTextField textMath;
    private JLabel lblEnglish;
    private JLabel lblMath;
    private JButton btnInsert;
    private JButton btnDelete;
    private JScrollPane scrollPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain07 window = new AppMain07();
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
    public AppMain07() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 514, 544);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        lblKorean = new JLabel("국어");
        lblKorean.setFont(new Font("D2Coding", Font.PLAIN, 28));
        lblKorean.setBounds(12, 10, 88, 61);
        frame.getContentPane().add(lblKorean);
        
        textKorean = new JTextField();
        textKorean.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textKorean.setBounds(112, 10, 374, 61);
        frame.getContentPane().add(textKorean);
        textKorean.setColumns(10);
        
        lblEnglish = new JLabel("영어");
        lblEnglish.setFont(new Font("D2Coding", Font.PLAIN, 28));
        lblEnglish.setBounds(12, 81, 88, 61);
        frame.getContentPane().add(lblEnglish);
        
        textEnglish = new JTextField();
        textEnglish.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textEnglish.setColumns(10);
        textEnglish.setBounds(112, 81, 374, 61);
        frame.getContentPane().add(textEnglish);
        
        lblMath = new JLabel("수학");
        lblMath.setFont(new Font("D2Coding", Font.PLAIN, 28));
        lblMath.setBounds(12, 152, 88, 61);
        frame.getContentPane().add(lblMath);
        
        textMath = new JTextField();
        textMath.setFont(new Font("D2Coding", Font.PLAIN, 28));
        textMath.setColumns(10);
        textMath.setBounds(112, 152, 374, 61);
        frame.getContentPane().add(textMath);
        
        btnInsert = new JButton("입력");
        btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnInsert.setBounds(12, 223, 188, 61);
        frame.getContentPane().add(btnInsert);
        
        btnDelete = new JButton("삭제");
        btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnDelete.setBounds(212, 223, 188, 61);
        frame.getContentPane().add(btnDelete);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 294, 474, 201);
        frame.getContentPane().add(scrollPane);
        
        table = new JTable();
        Object[][] data = {}; // 테이블에 사용할 데이터
        model = new DefaultTableModel(data, COLUMN_NAMES);
        table.setModel(model);
        scrollPane.setViewportView(table);
    }
}
