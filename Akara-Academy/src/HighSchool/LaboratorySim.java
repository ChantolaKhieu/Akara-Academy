package HighSchool;

import javax.swing.*;
import java.awt.*;

public class LaboratorySim extends JPanel {
    Color color = new Color(214, 255, 253);

    public LaboratorySim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new GridBagLayout());
    }
}
