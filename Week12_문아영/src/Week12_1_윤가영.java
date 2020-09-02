import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MouseFrame extends JFrame{
   JPanel p = new JPanel();
   JButton b = new JButton();
   
   public MouseFrame() {
      setTitle("�� ��ƺ�~��! - ������");
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
            System.out.println("��,,, �����٤Ф�");
      }
   }
}
public class Week12_1_������ {

   public static void main(String[] args) {
      System.out.println("============");
      System.out.println("����: ���̹�����");
      System.out.println("�й�: 1971079");
      System.out.println("����: ������");
      System.out.println("============");
      
      MouseFrame m = new MouseFrame();
   }

}