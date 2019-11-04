/*
    A very basic rendition of the classic game "Snake".
    by Mogamad Raa-iq Williams
*/
import javax.swing.JFrame;
import java.awt.EventQueue;

public class Snake extends JFrame {
    public Snake() {
        add(new Board());
        setResizable(false);
        pack();

        setTitle("Your Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run(){
                JFrame ex = new Snake();
                ex.setVisible(true);
            }
        });
    }
}