package gui;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.drawRect(Gui.offsetX, Gui.offsetY,600,600);

        repaint();
    }

}
