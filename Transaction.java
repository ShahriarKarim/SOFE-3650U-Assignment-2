import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction implements ActionListener {
    private static JLabel label;
    private static JLabel label2;
    private static JLabel label3;
    private static JLabel success;
    private static JTextField cardInfo;
    private static JTextField nameInfo;
    private static JPasswordField cvv;
    private static JButton btn;

    public Transaction() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Payment Transaction");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        label = new JLabel("Card Number");
        label.setBounds(15, 25, 100, 25);
        panel.add(label);

        cardInfo = new JTextField(20);
        cardInfo.setBounds(100, 20, 165, 25);
        panel.add(cardInfo);


        label2 = new JLabel("Card Name");
        label2.setBounds(10, 50, 100, 25);
        panel.add(label2);

        nameInfo = new JTextField(20);
        nameInfo.setBounds(100, 50, 165, 25);
        panel.add(nameInfo);

        label3 = new JLabel("CVV");
        label3.setBounds(15, 100, 120, 25);
        panel.add(label3);

        cvv = new JPasswordField();
        cvv.setBounds(100, 80, 165, 25);
        panel.add(cvv);

        btn = new JButton("Verify");
        btn.setBounds(80, 120, 250, 25);
        btn.addActionListener(this);
        panel.add(btn);

        success = new JLabel("");
        success.setBounds(90,160,300,25);
        panel.add(success);


        panel.setLayout(null);


        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new Transaction();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        success.setText("Payment successful.");

    }
}

