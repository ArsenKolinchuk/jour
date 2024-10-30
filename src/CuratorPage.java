import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class CuratorPage extends JFrame {

    private JTextField curatorTextField;
    private JTextField groupTextField;
    private JTextField studentTextField;
    private JTable studentsTable;
    private JButton planWorkButton;
    private JButton workWithStudentsButton;

    public CuratorPage() {
        setTitle("Curator Page");
        setSize(640, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Header Panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(196, 200, 16));
        headerPanel.setLayout(null);
        headerPanel.setPreferredSize(new Dimension(640, 67));

        JLabel curatorLabel = new JLabel("Куратор");
        curatorLabel.setBounds(150, 25, 60, 20);
        headerPanel.add(curatorLabel);

        curatorTextField = new JTextField();
        curatorTextField.setBounds(202, 21, 150, 25);
        headerPanel.add(curatorTextField);

        JLabel groupLabel = new JLabel("Група");
        groupLabel.setBounds(378, 23, 60, 20);
        headerPanel.add(groupLabel);

        groupTextField = new JTextField();
        groupTextField.setBounds(417, 21, 74, 25);
        headerPanel.add(groupTextField);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Table for students
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(null);

        String[] columnNames = {"Прізвище", "Ім'я", "По батькові"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        studentsTable = new JTable(tableModel);
        
        JScrollPane tableScrollPane = new JScrollPane(studentsTable);
        tableScrollPane.setBounds(14, 10, 350, 300);
        tablePanel.add(tableScrollPane);

        studentTextField = new JTextField();
        studentTextField.setBounds(404, 10, 150, 25);
        tablePanel.add(studentTextField);

        // Buttons
        planWorkButton = new JButton("План роботи");
        planWorkButton.setBounds(404, 60, 150, 26);
        tablePanel.add(planWorkButton);

        workWithStudentsButton = new JButton("Робота з студентами");
        workWithStudentsButton.setBounds(404, 100, 150, 26);
        tablePanel.add(workWithStudentsButton);

        mainPanel.add(tablePanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CuratorPage::new);
    }
}
