import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Barcode implements ActionListener {

    private HashMap<String, String> products = new HashMap<String, String>();
    private static JLabel label;
    private static JTextField barcode;
    private static JButton btn1;
    private static JLabel label2;
    private static JButton btn2;


    public Barcode(){

        JFrame frame = new JFrame("Barcode");
        JPanel panel = new JPanel();
        frame.setSize(500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        label = new JLabel("Barcode");
        label.setBounds(15, 25, 200,25);
        panel.add(label);

        barcode = new JTextField(20);
        barcode.setBounds(100,25,165,25);
        panel.add(barcode);

        btn1 = new JButton("Search product...");
        btn1.setBounds(100,100,200,25);
        btn1.addActionListener(this);
        panel.add(btn1);

        label2 = new JLabel(" ");
        label2.setBounds(10, 120, 350,25);
        panel.add(label2);

        btn2 = new JButton("Payment Option");
        btn2.setBounds(80,180,200,25);
        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Payments();
                    }
                }
        );
        panel.add(btn2);

        // Adding 5 items to the hash map
        products.put("001","Rice");
        products.put("002","Bread");
        products.put("003","Pasta");
        products.put("004","Chicken");
        products.put("005","Beef");

        frame.setVisible(true);



    }

    public static void main(String[] args) {
        new Barcode();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String code = barcode.getText();

        for(String key: products.keySet()) {
            if (code.equals(key)){
                label2.setText("The product is : "+" " + products.get(key));

                break;
            }
            else {
                label2.setText("Unable to find product.");
            }
        }

    }
}
