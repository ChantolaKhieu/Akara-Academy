package Elementary;

import javax.swing.*;
import java.awt.*;

public class AreaGame extends JPanel {
    Color color = new Color(214, 255, 253);

    public AreaGame(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new GridBagLayout());
    }
}
