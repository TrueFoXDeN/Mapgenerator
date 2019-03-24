package gui;

import javax.swing.*;

public class Gui {
    public static JFrame jf;
    public static Draw draw;

    public static int width = 1028, height = 720;
    public static int offsetX = 200;
    public static int offsetY = 25;


    public static void create(){
        jf = new JFrame("Mapgenerator");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("Datei");
        JMenu mode = new JMenu("Modus");

        //Datei
        JMenuItem inew = new JMenuItem("Neu");
        inew.addActionListener(e->{
            System.out.println("Neu");
        });

        JMenuItem iexport = new JMenuItem("Exportieren...");
        iexport.addActionListener(e->{
            System.out.println("Export");
        });

        JMenuItem iexit = new JMenuItem("Beenden");
        iexit.addActionListener(e->{
           System.exit(0);
        });

        //Modus
        JMenuItem iperlin = new JMenuItem("Perlin");
        iperlin.addActionListener(e->{
            System.out.println("Perlin");
        });

        JMenuItem isimplex = new JMenuItem("Simplex");
        isimplex.addActionListener(e->{
            System.out.println("Simplex");
        });

        menu.add(inew);
        menu.add(iexport);
        menu.add(iexit);

        mode.add(iperlin);
        mode.add(isimplex);

        bar.add(menu);
        bar.add(mode);
        jf.setJMenuBar(bar);

        //Draw
        draw = new Draw();
        draw.setBounds(0,0,width,height);
        draw.setVisible(true);
        jf.add(draw);

        jf.setVisible(true);
    }
}
