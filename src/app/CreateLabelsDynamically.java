/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.LEFT;
import javax.swing.event.*;
 
class CreateLabelsDynamically extends JFrame{
 JPanel jpan;
 
 public CreateLabelsDynamically() throws ClassNotFoundException, SQLException {
  jpan = new JPanel();
  jpan.setLayout(new BoxLayout(jpan, BoxLayout.Y_AXIS));
  jpan.setBounds(0, 50, 800, 500);
  jpan.setOpaque(true);
  jpan.setBackground(Color.white);
  add(jpan);
  postdisplay();
 }
 
 public void postdisplay() throws ClassNotFoundException, SQLException  {
     try{
      Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vamshi","root","9035");
    PreparedStatement ps=conn.prepareStatement("select * from posts");
    ResultSet rs=ps.executeQuery();
    jpan.removeAll();
   JLabel jlabels[] = new JLabel[7];
   int i=0;
   while(rs.next()) {
    jlabels[i] = new JLabel(rs.getString("question"));
    jlabels[i].setHorizontalAlignment(CENTER);
    jpan.add(jlabels[i]);
    i++;
   }
  jpan.validate();
  jpan.repaint();
 } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(dashbord.class.getName()).log(Level.SEVERE, null, ex);
                }
 }
 
 public static void main(String args[]) throws ClassNotFoundException, SQLException {
  
  CreateLabelsDynamically c = new CreateLabelsDynamically();
  c.setTitle("My Frame");
  c.setSize(800,550);
  c.setVisible(true);
 }
}