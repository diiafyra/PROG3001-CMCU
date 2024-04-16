/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài.pkg47;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Bài47 extends JFrame {
    public static void main(String[] args) {
        System.out.println("Nhấn Enter để chuyển sang chế độ GUI:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myFrame frame = new myFrame();
        frame.setVisible(true);
        scanner.close();
    }
    
}
