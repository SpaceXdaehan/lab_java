package edu.java.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain06 {

    private JFrame frame;
    private JButton btnMsgDlg;
    private JButton btnConfirmDlg;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain06 window = new AppMain06();
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
    public AppMain06() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 514);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        btnMsgDlg = new JButton("Message Dialog");
        btnMsgDlg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(frame, "안녕하세요.");
                JOptionPane.showMessageDialog(
                        frame, // 메시지 다이얼로그가 실행될 부모 컴포넌트
                        "안녕하세요?", // 다이얼로그에 표시될 메시지
                        "메시지", // 다이얼로그 타이틀(제목)
                        JOptionPane.QUESTION_MESSAGE // 메시지 타입
                );
            }
        });
        btnMsgDlg.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnMsgDlg.setBounds(12, 10, 410, 72);
        frame.getContentPane().add(btnMsgDlg);
        
        btnConfirmDlg = new JButton("Confirm Dialog");
        btnConfirmDlg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(
                        frame, 
                        "정말 삭제할까요?", 
                        "삭제 확인", 
                        JOptionPane.YES_NO_CANCEL_OPTION, 
                        JOptionPane.QUESTION_MESSAGE
                );
            }
        });
        btnConfirmDlg.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnConfirmDlg.setBounds(12, 92, 410, 72);
        frame.getContentPane().add(btnConfirmDlg);
    }

}
