package Week12_2_���ƿ�;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CarFrame extends JFrame { //JFrame�� ��ӹ��� CarFrame
	Color wc=Color.red; //�ڵ������κл���(�ٲ�������), innerŬ�������� �����ؾ���. �⺻��: red
	private JButton button; //innerŬ�������� �����ؾ��ϱ⶧���� �����س���
	private JRadioButton red; //���� ���� �Ʒ��ݺ�
	private JRadioButton green;
	private JRadioButton blue;
	
	public CarFrame() //CarFrame������
	{
		Toolkit tk=getToolkit(); //Component�� ���ǵ� getToolkit()�޼��� ȣ��
		Dimension d=tk.getScreenSize(); //screen�� ���� ���� ũ�⸦ ����
		int screenHeight=d.height;
		int screenWidth=d.width;
		setSize(500,350);
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame�� ȭ���� ���߾ӿ� ��ġ�ϰ� ��
		setResizable(false); //âũ�� ����x
		setTitle("MyCar -  ���ƿ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â������ ���α׷��Բ� ����
		
		JPanel bottom_Panel=new JPanel(); //�������� South�κп� �г� ���� 
		
		red=new JRadioButton("RED",true); //�ؽ�Ʈ�� "RED"�� ������ư����(�⺻��)
		green=new JRadioButton("GREEN");//�ؽ�Ʈ�� "GREEN""�� ������ư����
		blue=new JRadioButton("BLUE");//�ؽ�Ʈ�� "BLUE"�� ������ư����
		ButtonGroup bg=new ButtonGroup();
		bg.add(red);
		bg.add(green);
		bg.add(blue); //������ư�� �ϳ��� ���ؾ��ϹǷ� �׷����� ����
		
		button=new JButton("Paint"); //�ؽ�Ʈ�� "Paint"�� ��ư ����
		button.addActionListener(new PaintListener()); //��ư�� �̺�Ʈ������(�̳�Ŭ����������)�� PaintListener���
		
		CarPanel cp=new CarPanel(); //�̳�Ŭ������ CarPanel����
		
		bottom_Panel.add(red);   //�Ʒ��гο� ������ư�� ��ư ����
		bottom_Panel.add(green);
		bottom_Panel.add(blue);
		bottom_Panel.add(button);
		
		add(cp,"Center"); //CarPanel�� �������� Center�κп� ����
		add(bottom_Panel,"South"); //�Ʒ��г��� �������� South�κп� ����
		
		
		this.setVisible(true); // â�� ���̰� ��
	}
	
	private class CarPanel extends JPanel{ //JPanel�� ��ӹ��� CarPanel
		public void paint(Graphics g) //paint�޼��� �����ϱ�(�������̵�)
		{
			g.setColor(wc); //���� ������ wc�� ����
			g.fillRect(180, 55, 140, 60); //������ ����� �ڵ��� ��� �簢�� ä���
			g.fillRect(110, 115,280, 100);//������ �ڵ��� �ϴ� �簢�� ä���
			g.setColor(Color.lightGray); //���� ������ lightGray�� ����
			g.fillOval(140, 175, 80, 80); //������ ù��° ���� ä��
			g.fillOval(280, 175, 80, 80); //������ �ι�° ���� ä��
			g.setColor(Color.black); //���� ������ �������� ����
			g.drawArc(280,70,39,50,0,180); //���� ��(ȣ)�׸���
		}
	}
	private class PaintListener implements ActionListener{ //ActionListener�� ������ PaintListenerŬ����
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button) //�ؽ�Ʈ�� "Paint"�� ��ư Ŭ���� ��
			{
				if(red.isSelected()) wc=Color.red; //red������ư�� ���õǾ����� wc�� ���������� ����
				else if(green.isSelected()) wc=Color.green; //green������ư�� ���õǾ����� wc�� �ʷϻ����� ����
				else if(blue.isSelected()) wc=Color.blue; //blue ������ư�� ���õǾ����� wc�� �Ķ������� ����
			}
			repaint(); //��ȭ�� �ֱ����� repaint()ȣ�� 
		}
	}
}
