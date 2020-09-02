package HW2_5_���ƿ�;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Name extends JFrame{
	private JButton button; //innerŬ�������� �����ϱ� ���� �����س���
	private int num_k,num_l,num_p,num_etc; //���� ���� ����
	private JTextField fid_k,fid_l,fid_p,fid_etc;
	String wrong_text="";
	
	public Name()
	{	
		Toolkit tk=getToolkit(); //Component�� ���ǵ� getToolkit()�޼��� ȣ��
		Dimension d=tk.getScreenSize(); //screen�� ���� ���� ũ�⸦ ����
		int screenHeight=d.height;
		int screenWidth=d.width;
		setSize(600,500);
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame�� ȭ���� ���߾ӿ� ��ġ�ϰ� ��
		setResizable(false); //âũ�� ����x
		setTitle("Pie Chart of Student names - ���ƿ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â������ ���α׷� �Բ� ����
		
		JPanel center_panel=new JPanel(); //��Ʈ�� �����޽����� �׸� center_panel����
		center_panel.setLayout(new BorderLayout()); //center_panel�� BorderLayout���� ���̾ƿ� ����
		JPanel south_panel=new JPanel(); //���̾ƿ� �⺻�� flowLayout���� south_panel ����
		
		Chart c=new Chart(); //Chart �ν��Ͻ� ����
		
		JLabel lbl_k=new JLabel("Kim"); //Kim �� ����
		fid_k=new JTextField(5); //Kim�� ���� �Է��� �ؽ�Ʈ�ʵ� ����
		JLabel lbl_l=new JLabel("Lee"); //���� ���� �Ʒ� �ݺ� //Lee
		fid_l=new JTextField(5);
		JLabel lbl_p=new JLabel("Park"); //Park
		fid_p=new JTextField(5);
		JLabel lbl_etc=new JLabel("Etc"); //������(Etc)
		fid_etc=new JTextField(5);
		
		button=new JButton("Graph"); //"Graph"�� �̸����� �ϴ� ��ư ����
		button.addActionListener(new ChartListener());
		
		center_panel.add(c); //center_panel�� Chart ���
		
		south_panel.add(lbl_k); //south_panel�� Kim �� ���
		south_panel.add(fid_k); //south_panel�� Kim �ؽ�Ʈ�ʵ� ���
		south_panel.add(lbl_l);  //���� ���� �Ʒ� �ݺ�
		south_panel.add(fid_l); 
		south_panel.add(lbl_p); 
		south_panel.add(fid_p);
		south_panel.add(lbl_etc); 
		south_panel.add(fid_etc);
		south_panel.add(button); //south_panel�� ��ư ���
		
		add(center_panel,BorderLayout.CENTER); //�������� CENTER�� center_panel ���
		add(south_panel,BorderLayout.SOUTH); //�������� SOUTH�� south_panel ���
		
		setVisible(true); //â�� ���̰� ��

	}
	private class Chart extends JComponent{ //center_panel�� ���� ��Ʈ
		public void paint(Graphics g)
		{
			g.setColor(Color.WHITE);//���� ���� ȭ��Ʈ��
			g.fillRect(0, 0, 600, 500); //Center panel ������� ĥ��
			
			g.setColor(Color.BLACK); //���� ���� ������
			g.drawString(wrong_text, 200, 400); //�Է°��� Ʋ���� ��� ���ڿ�(���� �޼���) �׸�
			g.setColor(Color.YELLOW); //���� ���� yellow��
			g.fillArc(170, 150, 150,150, 0, (int)(num_k*3.6)); //Kim �������� ȣ�� ä���׸�.
			g.drawString("YELLOW: KIMs", 380, 200); // ��Ʈ�� �����ʿ� Kim�� ���� ���ڿ� �׸�
			g.setColor(Color.RED); //���� ���� �Ʒ� �ݺ�
			g.fillArc(170, 150,150,150, (int)(num_k*3.6), (int)(num_l*3.6)); //�׷��� Kim ȣ�� �̾ Lee ������ ȣ�� ä�� �׸�.
			g.drawString("RED: LEEs", 380, 220);
			g.setColor(Color.BLUE);
			g.fillArc(170, 150, 150,150,  (int)(num_k*3.6)+(int)(num_l*3.6), (int)(num_p*3.6));
			g.drawString("BLUE: PARKs", 380, 240);
			g.setColor(Color.GREEN);
			g.fillArc(170, 150, 150,150, (int)(num_k*3.6)+(int)(num_l*3.6)+(int)(num_p*3.6), (int)(num_etc*3.6));
			g.drawString("GREEN: Etc.", 380, 260);
		}
	}
	
	private class ChartListener implements ActionListener{ //ActionListener�� ������ ChartListenerŬ����
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button) //��ư Ŭ���� ��
			{
				try //���ܻ�Ȳ �߻��� �� �ִ� ������� ����
				{
					num_k=Integer.parseInt(fid_k.getText()); //�ؽ�Ʈ�ʵ��� ���� ������ �ٲ㼭 num_k�� ���� // ���ٲٴ� ���NumberFormatException �߻�
					num_l=Integer.parseInt(fid_l.getText()); //���� ���� �Ʒ� �ݺ�
					num_p=Integer.parseInt(fid_p.getText());
					
					if(num_k+num_l+num_p<=100&&num_k+num_l+num_p>=0) //������ ���� 100���� 0�̻��ΰ��
					{
						num_etc=100-(num_k+num_l+num_p);
						fid_etc.setText(Integer.toString(num_etc));
						repaint();
						
					}
					else if(num_k+num_l+num_p>100) throw new Exception("Number of students is 100."); //������ ����100�ʰ��Ѱ�� ���ܻ�Ȳ �߻���Ŵ
					else throw new Exception("Input numbers of student names"); //������ ��� ���ܻ�Ȳ �߻���Ŵ
				}
				catch(NumberFormatException e1) //�Է°��� ���� ���°� �ƴ� ���
				{
					wrong_text="Input numbers of student names";
					num_k=0; //������ ������ 0���� 
					num_l=0;
					num_p=0;
					num_etc=0;
					fid_k.setText(Integer.toString(0)); //�ؽ�Ʈ�ʵ嵵 �� 0���� ����
					fid_l.setText(Integer.toString(0));
					fid_p.setText(Integer.toString(0));
					fid_etc.setText(Integer.toString(0));
					repaint();
				}
				catch(Exception e2) //�� ���� ���� 100�� �ʰ��� ��쳪, ������ �Է��� ���
				{
					wrong_text=e2.getMessage(); 
					num_k=0; //������ �������� 0���� �ٽ� ����
					num_l=0;
					num_p=0;
					num_etc=0;
					fid_k.setText(Integer.toString(0)); //�ؽ�Ʈ �ʵ�� �� 0���� ����
					fid_l.setText(Integer.toString(0));
					fid_p.setText(Integer.toString(0));
					fid_etc.setText(Integer.toString(0));
					repaint(); //��ȭ�� �ֱ� ���� repaint()ȣ��
				}
				
			}
		}
	}
}
