package Week12_1_���ƿ�;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CatchFrame extends JFrame{ //JFrame�� ��ӹ��� CatchFrame
	private JButton button; //inner Ŭ�������� button�� �����ϹǷ� �����ڹۿ��� ������ �س��´�.
	
	public CatchFrame() //CatchFrame ������
	{
	this.setTitle("�� ��ƺ�~��! - ���ƿ�"); 
	
	this.setSize(300,300);
	this.setResizable(false); //ũ�� ���� x
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â ������ ���α׷��� �Բ� ����
	JPanel panel=new JPanel(); //�г� ����
	button=new JButton("Click!"); //�ؽ�Ʈ�� "Click!"�� ��ư ����
	button.addMouseListener(new CatchListener()); //��ư�� �̺�Ʈ ������ CatchListener ���
	panel.add(button); //�гο� ��ư ����
	this.add(panel); //�����ӿ� �г� ����
	this.setVisible(true); //â ���̰� ��
	}
	
	private class CatchListener extends MouseAdapter{ //MouseAdapter�� ��ӹ��� CatchListener Ŭ����
		public void mouseEntered(MouseEvent e) 
		{
			if (e.getSource()==button) //���콺�� ��ư�����ȿ� ������
			{
				int x=(int)(Math.random()*200); //x,y�� 0~199�� ���� ������ ����
				int y=(int)(Math.random()*200);
				button.setLocation(x,y); //��ư��(x,y)��ǥ�� ��ġ�ϰ� ��.
				System.out.println("x="+x+",\ty="+y); //�� (x,y)��ǥ ������ �ܼ�â�� ���
			}
		}
		public void mouseClicked(MouseEvent e) 
		{
			if (e.getSource()==button) //���콺�� ��ư������ Ŭ���ϸ�
			{
				System.out.println("��,,,�����٤Ф�"); //�ܼ�â�� "��,,,�����٤Ф�"���
			}
		}
	}
}