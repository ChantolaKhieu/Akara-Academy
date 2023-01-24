package Primary;

import javax.swing.*;
import java.awt.*;

public class CountingGame extends JPanel {
    Color color = new Color(214, 255, 253);

    private final JPanel containerPanel = new JPanel();

    public CountingGame() {
        setPreferredSize(new Dimension(1460, 1024));
        setBackground(color);
        setLayout(new GridBagLayout());

    }
}

