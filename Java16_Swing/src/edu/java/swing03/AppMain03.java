package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class AppMain03 {

    private JFrame frame;
    private JTextField textNumber1;
    private JTextField textNumber2;
    private JTextArea textResult;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain03 window = new AppMain03();
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
    public AppMain03() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(300, 200, 500, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel label1 = new JLabel("Number1");
        label1.setFont(new Font("D2Coding", Font.PLAIN, 32));
        label1.setBounds(12, 10, 120, 64);
        frame.getContentPane().add(label1);
        
        JLabel label2 = new JLabel("Number2");
        label2.setFont(new Font("D2Coding", Font.PLAIN, 32));
        label2.setBounds(12, 84, 120, 64);
        frame.getContentPane().add(label2);
        
        textNumber1 = new JTextField();
        textNumber1.setFont(new Font("D2Coding", Font.PLAIN, 32));
        textNumber1.setBounds(144, 10, 320, 64);
        frame.getContentPane().add(textNumber1);
        textNumber1.setColumns(10);
        
        textNumber2 = new JTextField();
        textNumber2.setFont(new Font("D2Coding", Font.PLAIN, 32));
        textNumber2.setColumns(10);
        textNumber2.setBounds(144, 84, 320, 64);
        frame.getContentPane().add(textNumber2);
        
        btnPlus = new JButton("+");
        btnPlus.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnPlus.setBounds(12, 158, 64, 64);
        frame.getContentPane().add(btnPlus);
        
        btnMinus = new JButton("-");
        btnMinus.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnMinus.setBounds(88, 158, 64, 64);
        frame.getContentPane().add(btnMinus);
        
        btnMultiply = new JButton("x");
        btnMultiply.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnMultiply.setBounds(164, 158, 64, 64);
        frame.getContentPane().add(btnMultiply);
        
        btnDivide = new JButton("/");
        btnDivide.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnDivide.setBounds(240, 158, 64, 64);
        frame.getContentPane().add(btnDivide);
        
        textResult = new JTextArea();
        textResult.setFont(new Font("D2Coding", Font.PLAIN, 32));
        textResult.setBounds(12, 236, 452, 195);
        frame.getContentPane().add(textResult);
    }
}
