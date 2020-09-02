package HW2_4_���ƿ�;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Subject extends JFrame{ //JFrame�� ��ӹ��� Subject
	private JButton button; //innerŬ�������� �����ϱ� ������ �����س���
	private int kor_scr,eng_scr,math_scr;
	JTextField kor_fid,eng_fid,math_fid;
	String wrong_text=""; //�߸� �Է������� ��Ÿ�� ���ڿ� ����

	public Subject() //SubjectŬ���� ������
	{
		Toolkit tk=getToolkit(); //Component�� ���ǵ� getToolkit()�޼��� ȣ��
		Dimension d=tk.getScreenSize(); //screen�� ���� ���� ũ�⸦ ����
		int screenHeight=d.height;
		int screenWidth=d.width;
		setSize(600,500); //â ������ ����
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame�� ȭ���� ���߾ӿ� ��ġ�ϰ� ��
		setTitle("Score Graph");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�ݱ� ���� ���α׷� ����ǰ� �ϴ� �޼���
	    setResizable(false); //â ũ�������� �� ���� ����
	    
		JPanel t_panel=new JPanel(); // �ٸ� component���� �� �ִ� container(panel) ����.
		JPanel graph_panel=new JPanel(); //�׷����� ���� panel ����
		JPanel score_panel=new JPanel(); //������ �Է��ϴ� panel ���� ���̾ƿ��⺻��(FlowLayout)
		
		t_panel.setLayout(new BorderLayout()); //t_panel�� ���̾ƿ��� BorderLayout���� ����
		graph_panel.setLayout(new BorderLayout()); //graph_panel�� ���̾ƿ��� BorderLayout���� ����
		
		JLabel kor_lbl=new JLabel("Kor"); //�ؽ�Ʈ�� "Kor"�� �� ����
		JLabel eng_lbl=new JLabel("Eng"); //�ؽ�Ʈ�� "Eng"�� �� ����
		JLabel math_lbl=new JLabel("Math"); //�ؽ�Ʈ�� "Math"�� �� ����
		
		kor_fid=new JTextField(4); //���� ���� �Է��� �ؽ�Ʈ �ʵ� ����
		eng_fid=new JTextField(4); //���� ���� �Է��� �ؽ�Ʈ �ʵ� ����
		math_fid=new JTextField(4); //���� ���� �Է��� �ؽ�Ʈ �ʵ� ����
		
		button=new JButton("Show Graph"); //�ؽ�Ʈ�� "Show Graph"�� ��ư ����
		button.addActionListener(new GraphListener()); //��ư�� �̺�Ʈ������(�̳�Ŭ����)�� GraphListener���
		
		Graph g=new Graph(); //Graph Ŭ���� �ν��Ͻ� ����
		graph_panel.add(g); //graph_panel�� g(�׷���Ŭ���� ��������)����
		
		score_panel.add(kor_lbl);//score_panel�� ���� �� ����
		score_panel.add(kor_fid); //scor_panel�� �����ؽ�Ʈ �ʵ� ����
		score_panel.add(eng_lbl); //���� ���� �Ʒ� �ݺ�
		score_panel.add(eng_fid);
		score_panel.add(math_lbl);
		score_panel.add(math_fid);
		score_panel.add(button); //score_panel�� button����
		
		t_panel.add(graph_panel,BorderLayout.CENTER); //t_panel�� CENTER�� graph_panel����
		t_panel.add(score_panel,BorderLayout.SOUTH); //t_panel�� �ؿ� score_panel ����
		
		add(t_panel); //�����ӿ� t_panel����
		
		setVisible(true); //â�� ���̰� ��
	}
	
	private class Graph extends JPanel{
		private static final int x=100;
		private static final int y=380;
		
		public void paint(Graphics g)
		{
			g.setColor(Color.WHITE); //���� ���� ������� ����
			g.fillRect(0, 0, 600, 500); //graph_panel��ü ������� ĥ��
			
			g.setColor(Color.black); //���� ���� ���������� ����
			
			g.drawString(wrong_text,280 , 50); //wrong_text ���ڿ��׸�
			g.drawString("KOR",195,400); //"KOR"���ڿ� �׸�
			g.drawString("ENG",295,400); //���� ���� �Ʒ� �ݺ�
			g.drawString("MATH",395,400);
			
			for(int i=0;i<11;i++) //�׷��� ���μ�(11��) �׸���
			{
				g.drawLine(x,y-i*30,x+400,y-i*30);	//���μ������� �ʺ� 30���� ����
			}
			g.drawLine(x,y,x,y-310); //y�� �׸���
			for(int i=1;i<=10;i++) //y�� ������(10,20,30, ..., 100) �׸���
			{
				int temp=10*i;
				g.drawString(Integer.toString(temp),x-22,y-i*30);
			}
			

			g.setColor(Color.RED); //���� ���� ���������� ����
			g.fillRect(204,80+3*(100-kor_scr),6,300-3*(100-kor_scr)); //�������� �׷��� �׸�
		    g.fillRect(304,80+3*(100-eng_scr),6,300-3*(100-eng_scr)); //���� ���� �׷��� �׸�
		    g.fillRect(407,80+3*(100-math_scr),6,300-3*(100-math_scr)); //�������� �׷��� �׸�
		}
	}
	
	private class GraphListener implements ActionListener{  //ActionListener�� ������ GraphListenerŬ����
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button) //��ư Ŭ���ϸ�
			{
				try //���ܻ�Ȳ �߻��� �� �ִ� ������� ����
				{
					kor_scr=Integer.parseInt(kor_fid.getText());
					eng_scr=Integer.parseInt(eng_fid.getText());
					math_scr=Integer.parseInt(math_fid.getText());
					
					if(!(kor_scr>=0 && kor_scr<=100)||!(eng_scr>=0&&eng_scr<=100)||!(math_scr>=0&&math_scr<=100))
					{//�� �������� 0�̻� 100���ϰ� �ƴ� ��� ���ܻ�Ȳ �߻���Ŵ
						throw new Exception();
					}
					else //0�̻� 100������ ���
					{
						repaint(); //��ȭ�� �ֱ� ���� repaint()ȣ��
						wrong_text=""; //wrong_text�� ��ĭ���� ����
					}
				}
				catch(Exception e1) //�Է°��� �������°� �ƴϰų� �� �������� 0�̻� 100���ϰ� �ƴ� ���
				{
					wrong_text="Wrong Input"; //worng_text�� "Wrong Input"����
					kor_scr=0; //�� ������ 0���� �ʱ�ȭ
					eng_scr=0;
					math_scr=0;
					repaint(); //��ȭ�� �ֱ� ���� repaintȣ��

				}					
			}
			}
		}
	}

