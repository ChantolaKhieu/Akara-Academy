import javax.swing.*;
import javax.swing.border.Border;
import Primary.*;
import Elementary.*;
import HighSchool.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Option extends JPanel implements ActionListener {
    // Card Layout and Color
    private final CardLayout optionCard = new CardLayout();
    Color color = new Color(214, 255, 253);
    Border border = new LineBorder(Color.BLACK);
    ImageIcon mathIcon = new ImageIcon("src/assets/math.png");
    ImageIcon simIcon = new ImageIcon("src/assets/simulation.png");
    ImageIcon gameIcon = new ImageIcon("src/assets/game.png");
    ImageIcon countingIcon = new ImageIcon("src/assets/counting.png");
    ImageIcon comparingIcon = new ImageIcon("src/assets/comparing.png");
    ImageIcon fractionIcon = new ImageIcon("src/assets/fraction.png");
    ImageIcon areaIcon = new ImageIcon("src/assets/area.png");

    /* Education Level Panel */
    private final JPanel educationLevelOptionPanel = new JPanel(new GridBagLayout());
    /* Primary School Panel */
    private final JPanel subPrimaryPanel = new JPanel(new GridBagLayout());
    private final JPanel simAndGamePrimaryPanel = new JPanel(new GridBagLayout());
    private final JPanel simCountingAndComparingPanel = new JPanel(new GridBagLayout());
    private final JPanel gameCountingAndComparingPanel = new JPanel(new GridBagLayout());
    /* Elementary School Panel */
    private final JPanel subElementaryPanel = new JPanel(new GridBagLayout());
    private final JPanel simAndGameElementaryPanel = new JPanel(new GridBagLayout());
    private final JPanel simElementaryPanel = new JPanel(new GridBagLayout());
    private final JPanel gameElementaryPanel = new JPanel(new GridBagLayout());
    /* High School Panel */
    private final JPanel subHighSchoolPanel = new JPanel(new GridBagLayout());
    private final JPanel mathHSPanel = new JPanel(new GridBagLayout());
    private final JPanel physicHSPanel = new JPanel(new GridBagLayout());
    private final JPanel chemHSPanel = new JPanel(new GridBagLayout());

    /* Button */
    //region Education Level Button
    private final JButton primaryButton = new JButton("Primary");
    private final JButton elementaryButton = new JButton("Elementary");
    private final JButton highSchoolButton = new JButton("High school");
    //endregion

    //region Simulation and Game Button in primary level
    private final JButton simulationPrimaryButton = new JButton("Simulation");
    private final JButton gamePrimaryButton = new JButton("Game");
    // Counting and Comparing button in simulation option
    private final JButton countingSimButton = new JButton("Counting");
    private final JButton comparingSimButton = new JButton("Comparing");
    // Counting and Comparing button in game option
    private final JButton countingGameButton = new JButton("Counting");
    private final JButton comparingGameButton = new JButton("Comparing");
    //endregion

    //region Elementary School Button
    private final JButton simElementaryButton = new JButton("Simulation");
    private final JButton gameElementaryButton = new JButton("Game");
    // Fraction and Area button in simulation option
    private final JButton fractionSimButton = new JButton("Fraction");
    private final JButton areaSimButton = new JButton("Area & Perimeter");
    // Fraction and Area button in game option
    private final JButton fractionGameButton = new JButton("Fraction");
    private final JButton areaGameButton = new JButton("Area & Perimeter");
    // Math Button
    private final JButton mathPrimaryButton = new JButton("Mathematics");
    private final JButton mathElementaryButton = new JButton("Mathematics");
    //endregion

    //region High School Button
    private final JButton mathHSButton = new JButton("Mathematics");
    private final JButton physicHSButton = new JButton("Physic");
    private final JButton chemHSButton = new JButton("Chemistry");
    private final JButton lineSimButton = new JButton("Line");
    private final JButton quadraticButton = new JButton("Quadratic");
    private final JButton parabolaButton = new JButton("Parabola");
    private final JButton waveButton = new JButton("Wave");
    private final JButton laboratoryButton = new JButton("Laboratory");
    //endregion


    // Back Button
    private final JButton backButton1 = new JButton();
    private final JButton backButton2 = new JButton();

    public Option(){
        /* Customize Panel */
        setPreferredSize(new Dimension(1460,1024));
        setBackground(color);

        setLayout(optionCard);
        setBorder(border);

        educationLevel();
        mathematicsPrimaryOption();
        simulationAndGamePrimaryOption();
        simulationPrimaryLevel();
        gamePrimaryLevel();
        // Elementary School
        mathematicsElementary();
        simulationAndGameElementaryOption();
        simulationElementaryOption();
        gameElementaryOption();

        // High School
        subjectHighSchool();
        mathHighSchool();
        physicHighSchool();
        chemistryHighSchool();
    }

    //region Education Level
    public void educationLevel(){
        // Icons
        educationLevelOptionPanel.setBackground(color);
        ImageIcon primaryIcon = new ImageIcon("src/assets/primary.png");
        primaryIcon = new ImageIcon(primaryIcon.getImage().
                getScaledInstance(260,260, BufferedImage.SCALE_SMOOTH));

        ImageIcon elementaryIcon = new ImageIcon("src/assets/elementary.png");
        elementaryIcon = new ImageIcon(elementaryIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        ImageIcon highSchoolIcon = new ImageIcon("src/assets/high.png");
        highSchoolIcon = new ImageIcon(highSchoolIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        primaryButton.setIcon(primaryIcon);
        primaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        primaryButton.setVerticalTextPosition(JButton.BOTTOM);
        primaryButton.setVerticalAlignment(JButton.TOP);
        primaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        primaryButton.setContentAreaFilled(false);
        primaryButton.setFocusable(false);
        primaryButton.setBorderPainted(false);
        primaryButton.setHorizontalTextPosition(JButton.CENTER);
        primaryButton.addActionListener(this);

        elementaryButton.setIcon(elementaryIcon);
        elementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        elementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        elementaryButton.setVerticalAlignment(JButton.TOP);
        elementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        elementaryButton.setContentAreaFilled(false);
        elementaryButton.setFocusable(false);
        elementaryButton.setBorderPainted(false);
        elementaryButton.setHorizontalTextPosition(JButton.CENTER);
        elementaryButton.addActionListener(this);

        highSchoolButton.setIcon(highSchoolIcon);
        highSchoolButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        highSchoolButton.setVerticalTextPosition(JButton.BOTTOM);
        highSchoolButton.setVerticalAlignment(JButton.TOP);
        highSchoolButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        highSchoolButton.setContentAreaFilled(false);
        highSchoolButton.setFocusable(false);
        highSchoolButton.setBorderPainted(false);
        highSchoolButton.setHorizontalTextPosition(JButton.CENTER);
        highSchoolButton.addActionListener(this);
        highSchoolButton.addActionListener(this);

        GridBagConstraints customPrimaryButton = new GridBagConstraints();
        GridBagConstraints customElementaryButton = new GridBagConstraints();
        GridBagConstraints customHighSchoolButton = new GridBagConstraints();

        // Primary Button
        customPrimaryButton.fill = GridBagConstraints.HORIZONTAL;
        customPrimaryButton.insets = new Insets(0,0,0,5);
        customPrimaryButton.gridx = 0;
        customPrimaryButton.gridy = 0;
        educationLevelOptionPanel.add(primaryButton, customPrimaryButton);

        // Elementary Button
        customElementaryButton.fill = GridBagConstraints.HORIZONTAL;
        customElementaryButton.gridx = 1;
        customElementaryButton.gridy = 0;
        customElementaryButton.insets = new Insets(0,0,0,5);
        educationLevelOptionPanel.add(elementaryButton, customElementaryButton);

        // High School Button
        customHighSchoolButton.fill = GridBagConstraints.HORIZONTAL;
        customHighSchoolButton.gridx = 2;
        customHighSchoolButton.gridy = 0;
        educationLevelOptionPanel.add(highSchoolButton, customHighSchoolButton);

        add(educationLevelOptionPanel, "eduOption");
    }
    //endregion

    //region Math in Primary School
    public void mathematicsPrimaryOption(){
        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        subPrimaryPanel.setBackground(color);

        mathPrimaryButton.setIcon(mathIcon);
        mathPrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathPrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        mathPrimaryButton.setVerticalAlignment(JButton.TOP);
        mathPrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathPrimaryButton.setContentAreaFilled(false);
        mathPrimaryButton.setFocusable(false);
        mathPrimaryButton.setBorderPainted(false);
        mathPrimaryButton.setHorizontalTextPosition(JButton.CENTER);
        mathPrimaryButton.addActionListener(this);

        // Back Button
        backButton1.setSize(100,100);
        backButton1.addActionListener(this);
        backButton1.setText("Back");

        GridBagConstraints customMathButton = new GridBagConstraints();
        GridBagConstraints customBackButton = new GridBagConstraints();

        customMathButton.fill = GridBagConstraints.HORIZONTAL;
        customMathButton.gridx = 0;
        customMathButton.gridy = 0;
        subPrimaryPanel.add(mathPrimaryButton, customMathButton);

        customBackButton.fill = GridBagConstraints.HORIZONTAL;
        customBackButton.gridx = 1;
        customBackButton.gridy = 0;
        subPrimaryPanel.add(backButton1, customBackButton);

        add(subPrimaryPanel, "mathPrimaryOption");
    }
    //endregion

    public void simulationAndGamePrimaryOption(){
        simAndGamePrimaryPanel.setBackground(color);
        simIcon = new ImageIcon(simIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        gameIcon = new ImageIcon(gameIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        simulationPrimaryButton.setIcon(simIcon);
        simulationPrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        simulationPrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        simulationPrimaryButton.setVerticalAlignment(JButton.TOP);
        simulationPrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        simulationPrimaryButton.setContentAreaFilled(false);
        simulationPrimaryButton.setFocusable(false);
        simulationPrimaryButton.setBorderPainted(false);
        simulationPrimaryButton.setHorizontalTextPosition(JButton.CENTER);
        simulationPrimaryButton.addActionListener(this);

        gamePrimaryButton.setIcon(gameIcon);
        gamePrimaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        gamePrimaryButton.setVerticalTextPosition(JButton.BOTTOM);
        gamePrimaryButton.setVerticalAlignment(JButton.TOP);
        gamePrimaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gamePrimaryButton.setContentAreaFilled(false);
        gamePrimaryButton.setFocusable(false);
        gamePrimaryButton.setBorderPainted(false);
        gamePrimaryButton.setHorizontalTextPosition(JButton.CENTER);
        gamePrimaryButton.addActionListener(this);

        GridBagConstraints customSimulationButton = new GridBagConstraints();
        GridBagConstraints customGameButton = new GridBagConstraints();

        customSimulationButton.fill = GridBagConstraints.BOTH;
        customSimulationButton.anchor = GridBagConstraints.CENTER;
        customSimulationButton.insets = new Insets(0,0,0,100);
        customSimulationButton.gridx = 0;
        customSimulationButton.gridy = 0;
        simAndGamePrimaryPanel.add(simulationPrimaryButton, customSimulationButton);

        customGameButton.fill = GridBagConstraints.BOTH;
        customGameButton.anchor = GridBagConstraints.CENTER;
        customGameButton.gridx = 1;
        customGameButton.gridy = 0;
        simAndGamePrimaryPanel.add(gamePrimaryButton, customGameButton);

        add(simAndGamePrimaryPanel, "Simulation & Game Primary");
    }

    public void simulationPrimaryLevel(){
        simCountingAndComparingPanel.setBackground(color);
        countingIcon = new ImageIcon(countingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        comparingIcon = new ImageIcon(comparingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        countingSimButton.setIcon(countingIcon);
        countingSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        countingSimButton.setVerticalTextPosition(JButton.BOTTOM);
        countingSimButton.setVerticalAlignment(JButton.TOP);
        countingSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        countingSimButton.setContentAreaFilled(false);
        countingSimButton.setFocusable(false);
        countingSimButton.setBorderPainted(false);
        countingSimButton.setHorizontalTextPosition(JButton.CENTER);
        countingSimButton.addActionListener(this);

        comparingSimButton.setIcon(comparingIcon);
        comparingSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        comparingSimButton.setVerticalTextPosition(JButton.BOTTOM);
        comparingSimButton.setVerticalAlignment(JButton.TOP);
        comparingSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comparingSimButton.setContentAreaFilled(false);
        comparingSimButton.setFocusable(false);
        comparingSimButton.setBorderPainted(false);
        comparingSimButton.setHorizontalTextPosition(JButton.CENTER);
        comparingSimButton.addActionListener(this);

        GridBagConstraints customCountingSimulationButton = new GridBagConstraints();
        GridBagConstraints customComparingSimulationButton = new GridBagConstraints();

        customCountingSimulationButton.fill = GridBagConstraints.BOTH;
        customCountingSimulationButton.anchor = GridBagConstraints.CENTER;
        customCountingSimulationButton.insets = new Insets(0,0,0,100);
        customCountingSimulationButton.gridx = 0;
        customCountingSimulationButton.gridy = 0;
        simCountingAndComparingPanel.add(countingSimButton, customCountingSimulationButton);

        customComparingSimulationButton.fill = GridBagConstraints.BOTH;
        customComparingSimulationButton.anchor = GridBagConstraints.CENTER;
        customComparingSimulationButton.gridx = 1;
        customComparingSimulationButton.gridy = 0;
        simCountingAndComparingPanel.add(comparingSimButton, customComparingSimulationButton);

        add(simCountingAndComparingPanel, "Counting & Comparing Simulation");
    }

    public void gamePrimaryLevel(){

        gameCountingAndComparingPanel.setBackground(color);
        simCountingAndComparingPanel.setBackground(color);
        countingIcon = new ImageIcon(countingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        comparingIcon = new ImageIcon(comparingIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        countingGameButton.setIcon(countingIcon);
        countingGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        countingGameButton.setVerticalTextPosition(JButton.BOTTOM);
        countingGameButton.setVerticalAlignment(JButton.TOP);
        countingGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        countingGameButton.setContentAreaFilled(false);
        countingGameButton.setFocusable(false);
        countingGameButton.setBorderPainted(false);
        countingGameButton.setHorizontalTextPosition(JButton.CENTER);
        countingGameButton.addActionListener(this);

        comparingGameButton.setIcon(comparingIcon);
        comparingGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        comparingGameButton.setVerticalTextPosition(JButton.BOTTOM);
        comparingGameButton.setVerticalAlignment(JButton.TOP);
        comparingGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comparingGameButton.setContentAreaFilled(false);
        comparingGameButton.setFocusable(false);
        comparingGameButton.setBorderPainted(false);
        comparingGameButton.setHorizontalTextPosition(JButton.CENTER);
        comparingGameButton.addActionListener(this);

        GridBagConstraints customCountingGameButton = new GridBagConstraints();
        GridBagConstraints customComparingGameButton = new GridBagConstraints();

        customCountingGameButton.fill = GridBagConstraints.BOTH;
        customCountingGameButton.anchor = GridBagConstraints.CENTER;
        customCountingGameButton.insets = new Insets(0,0,0,100);
        customCountingGameButton.gridx = 0;
        customCountingGameButton.gridy = 0;
        gameCountingAndComparingPanel.add(countingGameButton, customCountingGameButton);

        customComparingGameButton.fill = GridBagConstraints.BOTH;
        customComparingGameButton.anchor = GridBagConstraints.CENTER;
        customComparingGameButton.gridx = 1;
        customComparingGameButton.gridy = 0;
        gameCountingAndComparingPanel.add(comparingGameButton, customComparingGameButton);

        add(gameCountingAndComparingPanel, "Counting & Comparing Game");
    }

    public void mathematicsElementary(){
        subElementaryPanel.setBackground(color);
        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        mathElementaryButton.setIcon(mathIcon);
        mathElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        mathElementaryButton.setVerticalAlignment(JButton.TOP);
        mathElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathElementaryButton.setContentAreaFilled(false);
        mathElementaryButton.setFocusable(false);
        mathElementaryButton.setBorderPainted(false);
        mathElementaryButton.setHorizontalTextPosition(JButton.CENTER);
        mathElementaryButton.addActionListener(this);

        // Back Button
        backButton2.setSize(100,100);
        backButton2.addActionListener(this);
        backButton2.setText("Back");

        GridBagConstraints customMathButton = new GridBagConstraints();
        GridBagConstraints customBackButton = new GridBagConstraints();

        customMathButton.fill = GridBagConstraints.HORIZONTAL;
        customMathButton.gridx = 0;
        customMathButton.gridy = 0;
        subElementaryPanel.add(mathElementaryButton, customMathButton);

        customBackButton.fill = GridBagConstraints.HORIZONTAL;
        customBackButton.gridx = 1;
        customBackButton.gridy = 0;
        subElementaryPanel.add(backButton2, customBackButton);

        add(subElementaryPanel, "mathElementaryOption");
    }

    public void simulationAndGameElementaryOption(){
        simAndGameElementaryPanel.setBackground(color);

        simIcon = new ImageIcon(simIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        gameIcon = new ImageIcon(gameIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        simElementaryButton.setIcon(simIcon);
        simElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        simElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        simElementaryButton.setVerticalAlignment(JButton.TOP);
        simElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        simElementaryButton.setContentAreaFilled(false);
        simElementaryButton.setFocusable(false);
        simElementaryButton.setBorderPainted(false);
        simElementaryButton.setHorizontalTextPosition(JButton.CENTER);
        simElementaryButton.addActionListener(this);

        gameElementaryButton.setIcon(gameIcon);
        gameElementaryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        gameElementaryButton.setVerticalTextPosition(JButton.BOTTOM);
        gameElementaryButton.setVerticalAlignment(JButton.TOP);
        gameElementaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        gameElementaryButton.setContentAreaFilled(false);
        gameElementaryButton.setFocusable(false);
        gameElementaryButton.setBorderPainted(false);
        gameElementaryButton.setHorizontalTextPosition(JButton.CENTER);
        gameElementaryButton.addActionListener(this);

        GridBagConstraints customSimulationElementaryButton = new GridBagConstraints();
        GridBagConstraints customGameElementaryButton = new GridBagConstraints();

        customSimulationElementaryButton.fill = GridBagConstraints.HORIZONTAL;
        customSimulationElementaryButton.anchor = GridBagConstraints.CENTER;
        customSimulationElementaryButton.insets = new Insets(0,0,0,100);
        customSimulationElementaryButton.gridx = 0;
        customSimulationElementaryButton.gridy = 0;
        simAndGameElementaryPanel.add(simElementaryButton, customSimulationElementaryButton);

        customGameElementaryButton.fill = GridBagConstraints.HORIZONTAL;
        customGameElementaryButton.anchor = GridBagConstraints.CENTER;
        customGameElementaryButton.gridx = 1;
        customGameElementaryButton.gridy = 0;
        simAndGameElementaryPanel.add(gameElementaryButton, customGameElementaryButton);

        add(simAndGameElementaryPanel, "Simulation & Game Elementary");
    }

    public void simulationElementaryOption(){
        simElementaryPanel.setBackground(color);
        fractionIcon = new ImageIcon(fractionIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        areaIcon = new ImageIcon(areaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        fractionSimButton.setIcon(fractionIcon);
        fractionSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        fractionSimButton.setVerticalTextPosition(JButton.BOTTOM);
        fractionSimButton.setVerticalAlignment(JButton.TOP);
        fractionSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fractionSimButton.setContentAreaFilled(false);
        fractionSimButton.setFocusable(false);
        fractionSimButton.setBorderPainted(false);
        fractionSimButton.setHorizontalTextPosition(JButton.CENTER);
        fractionSimButton.addActionListener(this);

        areaSimButton.setIcon(areaIcon);
        areaSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        areaSimButton.setVerticalTextPosition(JButton.BOTTOM);
        areaSimButton.setVerticalAlignment(JButton.TOP);
        areaSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        areaSimButton.setContentAreaFilled(false);
        areaSimButton.setFocusable(false);
        areaSimButton.setBorderPainted(false);
        areaSimButton.setHorizontalTextPosition(JButton.CENTER);
        areaSimButton.addActionListener(this);

        GridBagConstraints customFractionButton = new GridBagConstraints();
        GridBagConstraints customAreaButton = new GridBagConstraints();

        customFractionButton.fill = GridBagConstraints.BOTH;
        customFractionButton.anchor = GridBagConstraints.CENTER;
        customFractionButton.insets = new Insets(0,0,0,100);
        customFractionButton.gridx = 0;
        customFractionButton.gridy = 0;
        simElementaryPanel.add(fractionSimButton, customFractionButton);

        customAreaButton.fill = GridBagConstraints.BOTH;
        customAreaButton.anchor = GridBagConstraints.CENTER;
        customAreaButton.gridx = 1;
        customAreaButton.gridy = 0;
        simElementaryPanel.add(areaSimButton, customAreaButton);

        add(simElementaryPanel, "Fraction & Area Simulation");
    }

    public void gameElementaryOption(){
        gameElementaryPanel.setBackground(color);

        fractionIcon = new ImageIcon(fractionIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        areaIcon = new ImageIcon(areaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        fractionGameButton.setIcon(fractionIcon);
        fractionGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        fractionGameButton.setVerticalTextPosition(JButton.BOTTOM);
        fractionGameButton.setVerticalAlignment(JButton.TOP);
        fractionGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fractionGameButton.setContentAreaFilled(false);
        fractionGameButton.setFocusable(false);
        fractionGameButton.setBorderPainted(false);
        fractionGameButton.setHorizontalTextPosition(JButton.CENTER);
        fractionGameButton.addActionListener(this);

        areaGameButton.setIcon(areaIcon);
        areaGameButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        areaGameButton.setVerticalTextPosition(JButton.BOTTOM);
        areaGameButton.setVerticalAlignment(JButton.TOP);
        areaGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        areaGameButton.setContentAreaFilled(false);
        areaGameButton.setFocusable(false);
        areaGameButton.setBorderPainted(false);
        areaGameButton.setHorizontalTextPosition(JButton.CENTER);
        areaGameButton.addActionListener(this);

        GridBagConstraints customFractionButton = new GridBagConstraints();
        GridBagConstraints customAreaButton = new GridBagConstraints();

        customFractionButton.fill = GridBagConstraints.BOTH;
        customFractionButton.anchor = GridBagConstraints.CENTER;
        customFractionButton.insets = new Insets(0,0,0,5);
        customFractionButton.gridx = 0;
        customFractionButton.gridy = 0;
        gameElementaryPanel.add(fractionGameButton, customFractionButton);

        customAreaButton.fill = GridBagConstraints.BOTH;
        customAreaButton.anchor = GridBagConstraints.CENTER;
        customAreaButton.gridx = 1;
        customAreaButton.gridy = 0;
        gameElementaryPanel.add(areaGameButton, customAreaButton);

        add(gameElementaryPanel, "Fraction & Area Game");
    }

    public void subjectHighSchool(){
        subHighSchoolPanel.setBackground(color);

        mathIcon = new ImageIcon(mathIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon physicIcon = new ImageIcon("src/assets/physic.png");
        physicIcon = new ImageIcon(physicIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon chemIcon = new ImageIcon("src/assets/chemistry.png");
        chemIcon = new ImageIcon(chemIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        mathHSButton.addActionListener(this);
        physicHSButton.addActionListener(this);
        chemHSButton.addActionListener(this);

        mathHSButton.setIcon(mathIcon);
        mathHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        mathHSButton.setVerticalTextPosition(JButton.BOTTOM);
        mathHSButton.setVerticalAlignment(JButton.TOP);
        mathHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mathHSButton.setContentAreaFilled(false);
        mathHSButton.setFocusable(false);
        mathHSButton.setBorderPainted(false);
        mathHSButton.setHorizontalTextPosition(JButton.CENTER);

        physicHSButton.setIcon(physicIcon);
        physicHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        physicHSButton.setVerticalTextPosition(JButton.BOTTOM);
        physicHSButton.setVerticalAlignment(JButton.TOP);
        physicHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        physicHSButton.setContentAreaFilled(false);
        physicHSButton.setFocusable(false);
        physicHSButton.setBorderPainted(false);
        physicHSButton.setHorizontalTextPosition(JButton.CENTER);

        chemHSButton.setIcon(chemIcon);
        chemHSButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        chemHSButton.setVerticalTextPosition(JButton.BOTTOM);
        chemHSButton.setVerticalAlignment(JButton.TOP);
        chemHSButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        chemHSButton.setContentAreaFilled(false);
        chemHSButton.setFocusable(false);
        chemHSButton.setBorderPainted(false);
        chemHSButton.setHorizontalTextPosition(JButton.CENTER);


        GridBagConstraints customMath = new GridBagConstraints();
        GridBagConstraints customPhysic = new GridBagConstraints();
        GridBagConstraints customChemistry = new GridBagConstraints();

        customMath.fill = GridBagConstraints.HORIZONTAL;
        customMath.gridx = 0;
        customMath.insets = new Insets(0,0,0,20);
        customMath.gridy = 0;
        subHighSchoolPanel.add(mathHSButton, customMath);

        customPhysic.fill = GridBagConstraints.HORIZONTAL;
        customPhysic.gridx = 1;
        customPhysic.gridy = 0;
        subHighSchoolPanel.add(physicHSButton, customPhysic);

        customChemistry.fill = GridBagConstraints.HORIZONTAL;
        customChemistry.gridx = 2;
        customChemistry.gridy = 0;
        subHighSchoolPanel.add(chemHSButton, customChemistry);

        add(subHighSchoolPanel, "Subject in High School");
    }

    public void mathHighSchool(){
        mathHSPanel.setBackground(color);

        lineSimButton.addActionListener(this);
        quadraticButton.addActionListener(this);
        parabolaButton.addActionListener(this);

        ImageIcon lineIcon = new ImageIcon("src/assets/line.png");
        lineIcon = new ImageIcon(lineIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon quadraticIcon = new ImageIcon("src/assets/quadratic.png");
        quadraticIcon = new ImageIcon(quadraticIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));
        ImageIcon parabolaIcon = new ImageIcon("src/assets/parabola.png");
        parabolaIcon = new ImageIcon(parabolaIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        lineSimButton.setIcon(lineIcon);
        lineSimButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        lineSimButton.setVerticalTextPosition(JButton.BOTTOM);
        lineSimButton.setVerticalAlignment(JButton.TOP);
        lineSimButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lineSimButton.setContentAreaFilled(false);
        lineSimButton.setFocusable(false);
        lineSimButton.setBorderPainted(false);
        lineSimButton.setHorizontalTextPosition(JButton.CENTER);

        quadraticButton.setIcon(quadraticIcon);
        quadraticButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        quadraticButton.setVerticalTextPosition(JButton.BOTTOM);
        quadraticButton.setVerticalAlignment(JButton.TOP);
        quadraticButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        quadraticButton.setContentAreaFilled(false);
        quadraticButton.setFocusable(false);
        quadraticButton.setBorderPainted(false);
        quadraticButton.setHorizontalTextPosition(JButton.CENTER);

        parabolaButton.setIcon(parabolaIcon);
        parabolaButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        parabolaButton.setVerticalTextPosition(JButton.BOTTOM);
        parabolaButton.setVerticalAlignment(JButton.TOP);
        parabolaButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        parabolaButton.setContentAreaFilled(false);
        parabolaButton.setFocusable(false);
        parabolaButton.setBorderPainted(false);
        parabolaButton.setHorizontalTextPosition(JButton.CENTER);

        GridBagConstraints customLine = new GridBagConstraints();
        GridBagConstraints customQuadratic = new GridBagConstraints();
        GridBagConstraints customParabola = new GridBagConstraints();

        customLine.fill = GridBagConstraints.HORIZONTAL;
        customLine.gridx = 0;
        customLine.insets = new Insets(0,0,0,35);
        customLine.gridy = 0;
        mathHSPanel.add(lineSimButton, customLine);

        customQuadratic.fill = GridBagConstraints.HORIZONTAL;
        customQuadratic.gridx = 1;
        customQuadratic.gridy = 0;
        mathHSPanel.add(quadraticButton, customQuadratic);

        customParabola.fill = GridBagConstraints.HORIZONTAL;
        customParabola.gridx = 2;
        customParabola.gridy = 0;
        mathHSPanel.add(parabolaButton, customParabola);

        add(mathHSPanel, "Math in High School");
    }

    public void physicHighSchool(){
        physicHSPanel.setBackground(color);

        ImageIcon waveIcon = new ImageIcon("src/assets/wave.png");
        waveIcon = new ImageIcon(waveIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        waveButton.addActionListener(this);
        waveButton.setIcon(waveIcon);
        waveButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        waveButton.setVerticalTextPosition(JButton.BOTTOM);
        waveButton.setVerticalAlignment(JButton.TOP);
        waveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        waveButton.setContentAreaFilled(false);
        waveButton.setFocusable(false);
        waveButton.setBorderPainted(false);
        waveButton.setHorizontalTextPosition(JButton.CENTER);

        GridBagConstraints customWave = new GridBagConstraints();
        customWave.fill = GridBagConstraints.HORIZONTAL;
        customWave.gridx = 0;
        customWave.gridy = 0;
        physicHSPanel.add(waveButton, customWave);

        add(physicHSPanel, "Physic in High School");
    }

    public void chemistryHighSchool(){
        chemHSPanel.setBackground(color);
        laboratoryButton.addActionListener(this);

        ImageIcon labIcon = new ImageIcon("src/assets/Lab.png");
        labIcon = new ImageIcon(labIcon.getImage().
                getScaledInstance(260,260,BufferedImage.SCALE_SMOOTH));

        laboratoryButton.setIcon(labIcon);
        laboratoryButton.setFont(new Font("Monospaced", Font.BOLD, 30));
        laboratoryButton.setVerticalTextPosition(JButton.BOTTOM);
        laboratoryButton.setVerticalAlignment(JButton.TOP);
        laboratoryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        laboratoryButton.setContentAreaFilled(false);
        laboratoryButton.setFocusable(false);
        laboratoryButton.setBorderPainted(false);
        laboratoryButton.setHorizontalTextPosition(JButton.CENTER);

        GridBagConstraints customLab = new GridBagConstraints();
        customLab.fill = GridBagConstraints.HORIZONTAL;
        customLab.gridx = 0;
        customLab.gridy = 0;
        chemHSPanel.add(laboratoryButton, customLab);

        add(chemHSPanel, "Chemistry in High School");
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // If user clicks on Back Button
        if(e.getSource() == backButton1){
            optionCard.show(this, "eduOption");
        }
        if(e.getSource() == backButton2){
            optionCard.show(this, "eduOption");
        }
        // If user clicks on Primary Level button
        if(e.getSource() == primaryButton){
            optionCard.show(this, "mathPrimaryOption");
        }
        // If user clicks on math button
        if(e.getSource() == mathPrimaryButton){
            optionCard.show(this, "Simulation & Game Primary");
        }
        // If user clicks on simulation
        if(e.getSource() == simulationPrimaryButton){
            optionCard.show(this, "Counting & Comparing Simulation");
        }
        // If user clicks on game button in primary
        if(e.getSource() == gamePrimaryButton){
            optionCard.show(this, "Counting & Comparing Game");
        }
        // If user clicks on
        if(e.getSource() == elementaryButton){
            optionCard.show(this, "mathElementaryOption");
        }
        // If user clicks on math button in elementary option
        if(e.getSource() == mathElementaryButton){
            optionCard.show(this, "Simulation & Game Elementary");
        }
        // If user clicks on simulation button in elementary option
        if(e.getSource() == simElementaryButton){
            optionCard.show(this, "Fraction & Area Simulation");
        }
        // If user clicks on game button in elementary option
        if(e.getSource() == gameElementaryButton){
            optionCard.show(this, "Fraction & Area Game");
        }
        if(e.getSource() == highSchoolButton){
            optionCard.show(this, "Subject in High School");
        }
        if(e.getSource() == mathHSButton){
            optionCard.show(this, "Math in High School");
        }
        if(e.getSource() == physicHSButton){
            optionCard.show(this, "Physic in High School");
        }
        if(e.getSource() == chemHSButton){
            optionCard.show(this, "Chemistry in High School");
        }
        if(e.getSource() == countingSimButton){
            CountingSim countingSim = new CountingSim();
            add(countingSim, "Primary.CountingSim");
            optionCard.show(this, "Primary.CountingSim");
        }
        if(e.getSource() == comparingSimButton){
            ComparingSim comparingSim = new ComparingSim();
            add(comparingSim, "Primary.ComparingSim");
            optionCard.show(this, "Primary.ComparingSim");
        }
        if(e.getSource() == countingGameButton){
            CountingGame countingGame = new CountingGame();
            add(countingGame, "Primary.CountingGame");
            optionCard.show(this, "Primary.CountingGame");
        }
        if(e.getSource() == comparingGameButton){
            ComparingGame comparingGame = new ComparingGame();
            add(comparingGame, "Primary.ComparingGame");
            optionCard.show(this, "Primary.ComparingGame");
        }
        if(e.getSource() == fractionSimButton){
            FractionSim fractionSim = new FractionSim();
            add(fractionSim, "Elementary.FractionSim");
            optionCard.show(this, "Elementary.FractionSim");
        }
        if(e.getSource() == fractionGameButton){
            FractionGame fractionGame = new FractionGame();
            add(fractionGame, "Elementary.FractionGame");
            optionCard.show(this, "Elementary.FractionGame");
        }
        if(e.getSource() == areaSimButton) {
            AreaSim areaSim = new AreaSim();
            add(areaSim, "Elementary.AreaSim");
            optionCard.show(this, "Elementary.AreaSim");
        }
        if(e.getSource() == areaGameButton){
            AreaGame areaGame = new AreaGame();
            add(areaGame, "Elementary.AreaGame");
            optionCard.show(this,"Elementary.AreaGame");
        }
        if(e.getSource() == lineSimButton){
            LineSim lineSim = new LineSim();
            add(lineSim, "LineSim");
            optionCard.show(this, "LineSim");
        }
        if(e.getSource() == quadraticButton){
            QuadraticSim quadraticSim = new QuadraticSim();
            add(quadraticSim, "QuadraticSim");
            optionCard.show(this, "QuadraticSim");
        }
        if(e.getSource() == parabolaButton){
            ParabolaSim parabolaSim = new ParabolaSim();
            add(parabolaSim, "ParabolaSim");
            optionCard.show(this, "ParabolaSim");
        }
        if(e.getSource() == waveButton){
            WaveSim waveSim = new WaveSim();
            add(waveSim, "WaveSim");
            optionCard.show(this, "WaveSim");
        }
        if(e.getSource() == laboratoryButton){
            LaboratorySim laboratorySim = new LaboratorySim();
            add(laboratorySim, "LaborSim");
            optionCard.show(this,"LaborSim");
        }
    }

    public CardLayout getOptionCard() {
        return optionCard;
    }
}
