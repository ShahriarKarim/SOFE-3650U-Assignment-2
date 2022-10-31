import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTwo implements ActionListener {
    private static JLabel label;
    private static JLabel label2;
    private static  JTextField textBoxUser;
    private static JPasswordField textBoxPass  ;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Login");
        frame.setSize(500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Enter User");
        label.setBounds(15, 25, 80,25);
        panel.add(label);

        textBoxUser = new JTextField(20);
        textBoxUser.setBounds(100,20,165,25);
        panel.add(textBoxUser);

        label2 = new JLabel("Enter Password");
        label2.setBounds(10, 50, 80,25);
        panel.add(label2);

        textBoxPass = new JPasswordField();
        textBoxPass.setBounds(100,50,165,25);
        panel.add(textBoxPass);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new FrameTwo());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new FrameOne();
    }
}
