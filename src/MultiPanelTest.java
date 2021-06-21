import java.awt.*;
import javax.swing.*;
public class MultiPanelTest extends JFrame {
   private JPanel subPanel1;
   public MultiPanelTest() {
      setTitle("MultiPanel Test");
      subPanel1 = new JPanel(); 
      subPanel1.setLayout(new GridLayout(3, 1));
      subPanel1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
      subPanel1.add(new JLabel("Main Panel", SwingConstants.CENTER));
      subPanel1.setBackground(Color.red);// sub-panel 1
      add(subPanel1);
      setSize(400, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new MultiPanelTest();
   }
}