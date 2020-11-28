package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class GTimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}