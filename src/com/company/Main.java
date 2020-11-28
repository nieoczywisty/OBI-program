package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {



        JFrame frame = new JFrame("Gmenu");
        frame.setContentPane(new Gmenu().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        Menu menu = new Menu();
        menu.Start();
    }

}

