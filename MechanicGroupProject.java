/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mechanic.group.project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Author: Jay Kumar
 * Mechanic Group Project for ICS4U1
 * November 6 2025
 * version 1.0
 */

//start of main jpanel class for GUI
public class MechanicGroupProject extends JPanel {
    
    public MechanicGroupProject() {
        setFocusable(true);
        requestFocusInWindow();
    }

//main method
    public static void main(String[] args) {
        int run = 0;
        JFrame MainFrame = new MainFrame();        //create the window
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setLocation(360, 40);
        MainFrame.setVisible(true);
        
    }
}
//end of main jpanel class for GUI
   
