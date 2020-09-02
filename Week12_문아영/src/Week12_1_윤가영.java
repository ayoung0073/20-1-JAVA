import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MouseFrame extends JFrame{
   JPanel p = new JPanel();
   JButton b = new JButton();
   
   public MouseFrame() {
      setTitle("³ª Àâ¾ÆºÁ~¶ó! - À±°¡¿µ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setSize(300, 300);
      //setResizable(false);
      b.setText("Click!");
      b.addMouseListener(new MyListener());
      p.add(b);
      add(p, BorderLayout.CENTER);
      pack();
      setVisible(true);
   }
   
   private class MyListener extends MouseAdapter{
      public void mouseEntered(MouseEvent e) {
         int x, y;
         x = (int)(Math.random()*100);
         y = (int)(Math.random()*100);
         b.setLocation(x, y);
         System.out.println("x="+x+", y="+y);
      }
      
      public void mouseClicked(MouseEvent e) {
         if(e.getSource() == b)
            System.out.println("À¹,,, ÀâÇû´Ù¤Ð¤Ð");
      }
   }
}
public class Week12_1_À±°¡¿µ {

   public static void main(String[] args) {
      System.out.println("============");
      System.out.println("Àü°ø: »çÀÌ¹öº¸¾È");
      System.out.println("ÇÐ¹ø: 1971079");
      System.out.println("¼º¸í: À±°¡¿µ");
      System.out.println("============");
      
      MouseFrame m = new MouseFrame();
   }

}