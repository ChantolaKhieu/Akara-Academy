package HighSchool;

import javax.swing.*;
import java.awt.*;

public class LineSim extends JPanel {
    Color color = new Color(214, 255, 253);

    public LineSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new GridBagLayout());
    }
}
