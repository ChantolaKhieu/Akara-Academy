import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        init();
    }
    private void init(){
        Option option = new Option();
        add(option);

        pack();
        setTitle("Akara Academy");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
