package Primary;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class CountingSim extends JPanel implements ActionListener {

    Color color = new Color(214, 255, 253);

    private final JPanel bottomPanel = new JPanel();
    private final JButton backButton = new JButton();
    private final JPanel topPanel = new JPanel();
    private final JPanel centerPanel = new JPanel();

    private final JPanel rightPanel = new JPanel();

    private final JPanel leftPanel = new JPanel();

    private final JPanel centerBoxPanel = new JPanel();

    public CountingSim(){
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);
        setLayout(new BorderLayout());

        customBackBtn();
        setCenterPanel();
        setBottomPanel();
        setRightPanel();
        setLeftPanel();
    }

    public void setLeftPanel(){
        leftPanel.setBackground(Color.red);
        add(leftPanel, BorderLayout.LINE_START);
    }

    public void setRightPanel(){
        rightPanel.setPreferredSize(new Dimension(500,0));
        rightPanel.setBackground(Color.red);
        add(rightPanel, BorderLayout.LINE_END);
    }

    public void customBackBtn(){
        ImageIcon backIcon = new ImageIcon("src/assets/back.png");
        backIcon = new ImageIcon(backIcon.getImage().
                getScaledInstance(60,60, BufferedImage.SCALE_SMOOTH));

        backButton.setIcon(backIcon);
        backButton.setFocusable(false);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(this);

        JPanel test = new JPanel();
        test.setLayout(new BoxLayout(test, BoxLayout.X_AXIS));
        test.setBackground(Color.gray);
        test.add(backButton);

        topPanel.setLayout(new BorderLayout());
        topPanel.add(test, BorderLayout.LINE_START);
        topPanel.setBackground(Color.green);
        add(topPanel, BorderLayout.PAGE_START);
    }

    public void setCenterPanel(){
        centerPanel.setBackground(Color.pink);
        centerPanel.setLayout(new BorderLayout());

        centerBoxPanel.setPreferredSize(new Dimension(600,500));
        centerBoxPanel.setBackground(Color.ORANGE);
        centerBoxPanel.setBorder(new LineBorder(Color.gray));

        JPanel test1 = new JPanel();
        test1.setLayout(new BoxLayout(test1, BoxLayout.X_AXIS));
        test1.add(centerBoxPanel);

        centerPanel.add(test1, BorderLayout.LINE_END);
        add(centerPanel, BorderLayout.CENTER);
    }

    public void setBottomPanel(){
        bottomPanel.setBackground(Color.gray);
        bottomPanel.setPreferredSize(new Dimension(0,300));
        add(bottomPanel, BorderLayout.PAGE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
