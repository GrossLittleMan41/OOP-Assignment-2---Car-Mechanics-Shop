/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mechanic.group.project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import apphelper.Sprite;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/** Author: Jay Kumar
 * Mechanic Group Project for ICS4U1
 * November 6 2025
 * version 1.0
 */
public class MechanicGroupProject extends JPanel implements MouseListener, KeyListener {
    
    final Sprite loginButton = new Sprite(0,0,"LoginButton.png",720,720);
    
    public static boolean findUsername(String username) {
        File userData = new File("loginData.txt");
        boolean x = false;
        try {
            Scanner scanFile = new Scanner(userData);
            while (scanFile.hasNextLine()) {
                String phrase = scanFile.nextLine();
                if (phrase.equals(username)) {
                    x = true;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Something went wrong");
            System.exit(0);
        }
        return x;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.decode("#c6c6c6"));
        g.setColor(Color.RED);
        
        loginButton.draw(g);
    }
    
    public MechanicGroupProject() {
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        System.out.println(mouseX + " , " + mouseY);
        if (mouseX >= 220 && mouseX <= 500){
            if (mouseY >= 315 && mouseY <= 405){

                JTextField field1 = new JTextField(10);
                JTextField field2 = new JTextField(10);

                JPanel panel = new JPanel(new GridLayout(0, 1));
                panel.add(new JLabel("Enter Username:"));
                panel.add(field1);
                panel.add(new JLabel("Enter Password:"));
                panel.add(field2);

                int result = JOptionPane.showConfirmDialog(null, panel, "Log Into Database", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    String username = field1.getText();
                    String password = field2.getText();
                    System.out.println("First input: " + username);
                    System.out.println("Second input: " + password);
                } else {
                    System.out.println("Dialog cancelled.");
                }
   
                
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mechanic GUI");        //create the window which the game will be played on
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 720);
        frame.setLocation(380, 60);

        frame.add(new MechanicGroupProject());
        frame.setVisible(true);
    }
}
   
