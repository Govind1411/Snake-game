import javax.swing.JFrame;
public class gameframe extends JFrame {
    gameframe(){
        this.add(new gamepanel());
        this.setTitle("snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        gameframe my = new gameframe();
    }
    
}
