/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài48;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bài48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nhấn Enter để chuyển sang chế độ GUI:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myFrame frame = new myFrame();
        frame.setVisible(true);
        scanner.close();
    }
    
}
