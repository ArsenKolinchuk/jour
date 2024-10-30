

import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    public static CardLayout layout = new CardLayout();
    private JPanel contentPane;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Exit());
        frame.pack();
        frame.setLocationRelativeTo(null); // Центрування вікна на екрані
        frame.setVisible(true);
    }


    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(layout);
        setContentPane(contentPane);

        // Додаємо панель Exit
        Exit exit = new Exit();
        contentPane.add(exit, "Exit");

        setLocationRelativeTo(null); 
        layout.show(contentPane, "Exit"); // Показуємо панель Exit
    }
}