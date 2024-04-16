/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg46;

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class myFrame extends JFrame {
    private JTextField inputField;
    private JButton displayButton;
    private JButton exitButton;

    public myFrame() {
        setTitle("myFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(20);
        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    hienThiGiaTri();
                }
            }
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetterOrDigit(c) && !Character.isDigit(c)) {
                    e.consume(); 
                    JOptionPane.showMessageDialog(rootPane, "Chi duoc nhap vao so hoac chu");
                }
            }            
        });
        add(inputField);

        displayButton = new JButton("Hiển thị giá trị");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hienThiGiaTri();
            }
        });
        add(displayButton);

        exitButton = new JButton("Thoát");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        pack();
        setVisible(true);
    }

    private void hienThiGiaTri() {
        JOptionPane.showMessageDialog(this, inputField.getText(), "Giá trị nhập", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        System.out.println("Nhấn Enter để chuyển sang chế độ GUI:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myFrame frame = new myFrame();
        frame.setVisible(true);
        scanner.close();
    }
}
