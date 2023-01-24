package HighSchool;

import javax.swing.*;
import java.awt.*;

public class WaveSim extends JPanel {
    Color color = new Color(214, 255, 253);

    public WaveSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new GridBagLayout());
    }
}
