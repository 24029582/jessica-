package com.mycompany.randomguess;

import javax.swing.JOptionPane;
public class Randomguess {

    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"think of number from 1 to 10");
    JOptionPane.showMessageDialog(null,"the number is" +(1+ (int)(Math.random() * 10)));
    }
}
