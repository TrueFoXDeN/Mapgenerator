package gui;

import javax.swing.*;

public class Gui {
    public static JFrame jf;

    public static void create(){
        jf = new JFrame("Mapgenerator");
        jf.setSize(1028,720);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
