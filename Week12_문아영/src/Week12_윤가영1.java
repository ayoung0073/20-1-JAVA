import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CarFrame extends JFrame implements ActionListener{
   JPanel p1 = new JPanel();
   JPanel p2 = new JPanel();
   Color c = new Color(255,0,0);
   
   ButtonGroup cg = new ButtonGroup();
   
   JRadioButton red = new JRadioButton("RED", true);
   JRadioButton green = new JRadioButton("GREEN");
   JRadioButton blue = new JRadioButton("BLUE");
   
   JButton paint = new JButton("Paint");
   
   class CarBody extends JPanel{
      public static final int x = 100, y = 100;
         
      public void paint(Graphics g) {
         g.setColor(c);
         g.fillRect(x, y, 140, 60);
         g.fillRect(x-70, y+60, 280, 100);
         g.setColor(c.LIGHT_GRAY);
         g.fillOval(x-40, y+120, 80, 80);
         g.fillOval(x+100, y+120, 80, 80);
         g.setColor(c.BLACK);
         g.drawArc(x+80, y+10, 50, 40, 0, 180);
         
      }
   }
   
   public CarFrame(){
      Toolkit tk = getToolkit();
      Dimension d = tk.getScreenSize();
      int scHeight = d.height;
      int scWidth = d.width;
      
      setTitle("MyCar - 윤가영");
      setSize(500, 350);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocation(scWidth/2 - this.getWidth()/2, scHeight/2 - this.getHeight()/2);
      setLayout(new BorderLayout());
      
      //p1 채우기
      CarBody cb = new CarBody();
   
      //p2 채우기(RadioButton)
      
      cg.add(red);
      cg.add(green);
      cg.add(blue);
      
      p2.add(red);
      p2.add(green);
      p2.add(blue);
      
      paint.addActionListener(this);
      p2.add(paint);
      
      add(cb, BorderLayout.CENTER);
      add(p2, BorderLayout.PAGE_END);
      
      pack();
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == paint)
      {
         if(red.isSelected())
            c = Color.RED;
         else if(blue.isSelected())
            c = Color.BLUE;
         else if(green.isSelected())
            c = Color.green;
      }
      repaint();
   }
   
}
public class Week12_윤가영1 {

   public static void main(String[] args) {
      System.out.println("============");
      System.out.println("전공: 사이버보안");
      System.out.println("학번: 1971079");
      System.out.println("성명: 윤가영");
      System.out.println("============");
      
      CarFrame cf = new CarFrame();

   }

}