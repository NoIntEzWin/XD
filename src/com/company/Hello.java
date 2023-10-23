package com.company;

import javax.swing.JOptionPane;
public class Hello
{

    public static void main(String[] args)
    {

        JOptionPane.showMessageDialog(null, "Ganditiva la un numar");
        JOptionPane.showMessageDialog (null, "Numărul este" + (1 + (int) (Math.random () * 10)));
    }
}
