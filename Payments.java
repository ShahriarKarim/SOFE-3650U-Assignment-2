import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payments implements ActionListener {
    private static JButton btn;
    private static JButton btn1;
    private static JLabel l1;
    private static JLabel success;

    public Payments(){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Payment Options");
        frame.setSize(550,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        l1=new JLabel("Select your preferred payment option.");
        l1.setBounds(100,100,500,25);
        panel.add(l1);

        success = new JLabel("");
        success.setBounds(100,200,180,25);
        panel.add(success);

        btn = new JButton("Cash");
        btn.setBounds(100,200,400,25);
        btn.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        success.setText("Print receipt");
                    }
                }
        );
        panel.add(btn);

        btn1 = new JButton("Credit or Debit Card");
        btn1.setBounds(100,250,500,25);
        btn1.addActionListener(this);
        panel.add(btn1);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Payments();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Transaction();
    }
}
