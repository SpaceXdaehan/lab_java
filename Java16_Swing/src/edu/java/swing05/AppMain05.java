package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AppMain05 {

    private JFrame frame;
    private JRadioButton rbPrivate;
    private JRadioButton rbPackage;
    private JRadioButton rbProtected;
    private JRadioButton rbPublic;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JCheckBox cbAbstract;
    private JCheckBox cbFinal;
    private JCheckBox cbStatic;
    private JComboBox<String> comboBox;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    AppMain05 window = new AppMain05();
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
    public AppMain05() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 843, 558);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        rbPrivate = new JRadioButton("private");
        buttonGroup.add(rbPrivate);
        rbPrivate.setFont(new Font("D2Coding", Font.PLAIN, 32));
        rbPrivate.setBounds(8, 6, 199, 74);
        frame.getContentPane().add(rbPrivate);
        
        rbPackage = new JRadioButton("package");
        buttonGroup.add(rbPackage);
        rbPackage.setFont(new Font("D2Coding", Font.PLAIN, 32));
        rbPackage.setBounds(211, 6, 199, 74);
        frame.getContentPane().add(rbPackage);
        
        rbProtected = new JRadioButton("protected");
        buttonGroup.add(rbProtected);
        rbProtected.setFont(new Font("D2Coding", Font.PLAIN, 32));
        rbProtected.setBounds(414, 6, 199, 74);
        frame.getContentPane().add(rbProtected);
        
        rbPublic = new JRadioButton("public");
        buttonGroup.add(rbPublic);
        rbPublic.setFont(new Font("D2Coding", Font.PLAIN, 32));
        rbPublic.setBounds(617, 6, 199, 74);
        frame.getContentPane().add(rbPublic);
        
        cbAbstract = new JCheckBox("abstract");
        cbAbstract.setFont(new Font("D2Coding", Font.PLAIN, 32));
        cbAbstract.setBounds(8, 82, 199, 74);
        frame.getContentPane().add(cbAbstract);
        
        cbFinal = new JCheckBox("final");
        cbFinal.setFont(new Font("D2Coding", Font.PLAIN, 32));
        cbFinal.setBounds(211, 82, 199, 74);
        frame.getContentPane().add(cbFinal);
        
        cbStatic = new JCheckBox("static");
        cbStatic.setFont(new Font("D2Coding", Font.PLAIN, 32));
        cbStatic.setBounds(424, 82, 199, 74);
        frame.getContentPane().add(cbStatic);
        
        comboBox = new JComboBox<>();
        String[] items = {"naver.com", "gmail.com", "kakao.com"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(items);
        comboBox.setModel(model);
        comboBox.setFont(new Font("D2Coding", Font.PLAIN, 32));
        comboBox.setBounds(8, 162, 402, 74);
        frame.getContentPane().add(comboBox);
    }
}
