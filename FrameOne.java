import javax.swing.*;  //importing swing package
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameOne implements ActionListener
{

    JButton btn;
    JLabel label;
    public FrameOne() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Cash Register");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Hello, let's begin.");
        label.setBounds(15,25,200,25);
        panel.add(label);

        btn = new JButton("Start new session.");
        btn.setBounds(10,100,400,25);
        btn.addActionListener(this);
        panel.add(btn);




        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new FrameOne();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Barcode();
    }
}
