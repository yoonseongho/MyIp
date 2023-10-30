import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.*;

public class MyIP extends JFrame {

    private JLabel ipLabel;

    public MyIP() {
        ipLabel = new JLabel();
        add(ipLabel);
        setTitle("My IP Address");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            String ipAddress = ip.getHostAddress();
            new MyIP().ipLabel.setText("My IP Address: " + ipAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
