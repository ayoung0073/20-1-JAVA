package HW2_3_���ƿ�;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	private JButton button_new; //"New" ��ư, innerŬ�������� ������ �� �ֵ��� ���� ���� �س���
    private JButton button[]=new JButton[15]; //JButtonŬ������ �迭����
	private JTextField field; //���� �ؽ�Ʈ�ʵ� ����
	
	int index=0;
	
	String cal[]=new String[3];

	
	int cal_i=0;//���������� 0,1,2
	
	int result=0; //result�� ����
	double divide_result=0; //�������� ��(/) ���� result�� ����
	
	public Calculator()
	{
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�ݱ� ���� ���α׷� ����ǰ� �ϴ� �޼���
		setSize(300,200); //â ������ ����
	    setResizable(false); //â ũ�������� �� ���� ����
		
		JPanel t_panel=new JPanel(); // �ٸ� component���� �� �ִ� container(panel) ����.
		JPanel panel=new JPanel(); //t_panel�� ���� �� �ٸ� panel->���� �ε帱 ����
		t_panel.setLayout(new BorderLayout()); //t_panel�� ���̾ƿ��� BorderLayout���� ����
		panel.setLayout(new GridLayout(0,4)); //panel�� ���̾ƿ��� Grid���� ����. column�� 4�� ������ row�� �ڵ� �����ϰ� ���鵵�� ��.
		
		makeButton("7",panel);//String���� JPanel���� ���ڷ� �޴� makeButton�޼��� ȣ��
		makeButton("8",panel);//���� ���� �Ʒ� �ݺ�
		makeButton("9",panel);
		makeButton("/",panel);
		makeButton("4",panel);
		makeButton("5",panel);
		makeButton("6",panel);
		makeButton("*",panel);
		makeButton("1",panel);
		makeButton("2",panel);
		makeButton("3",panel);
		makeButton("-",panel);
		makeButton("New",panel);
		makeButton("0",panel);
		makeButton("=",panel);
		makeButton("+",panel);
		
		
		field=new JTextField(); //t_panel�� NORTH�κп� ���� �ؽ�Ʈ ���� �ν��Ͻ� ���� ��������: field
		field.setHorizontalAlignment(JTextField.RIGHT); //������ �Է� �� �����ʿ� ��Ÿ���� ��
		
		add(t_panel); //�����ӿ� t_panel�߰�
		
		t_panel.add(field,BorderLayout.NORTH); //t_panel�� NORTH�κп� �ؽ�Ʈ����(field)�߰�(����)
		t_panel.add(panel,BorderLayout.CENTER); //t_panel�� CENTER�κп� panel �߰� (����)
		
		setVisible(true); //â�� ���̰� ��
	}
	
	public void makeButton(String text,JPanel panel)  //String�� text�� JPanel�� panel�� ���ڷ� ����
	{
		if (text.equals("New")) //text�� "New"�̸�
		{
			button_new=new JButton(text); //�ؽ�Ʈ�� "New"�� ��ư button_new ����
			button_new.addMouseListener(new CalcListener()); //button_new��ư�� �̺�Ʈ�������� CalcListener ���
			panel.add(button_new); //panel�� button_new����
		}
		else
		{
			button[index]=new JButton(text); //text���ڿ��� �Բ� ��ư ����
			button[index].setAlignmentX(CENTER_ALIGNMENT); //x��(����)�� ��� ���ķ� ��
			button[index].addMouseListener(new CalcListener()); //button[index]��ư�� �̺�Ʈ�������� CalcListener ���
			panel.add(button[index]); //panel�� button[index] ����
			index++; //index�� 1���ϱ�
		}

	}
	
	private class CalcListener extends MouseAdapter //MouseAdapterŬ������ ��ӹ��� CalcListener
	{
		public void mouseClicked(MouseEvent e) 
		{
			try
			{
			if(e.getSource()==button_new) //button_new��ư�� Ŭ���� ��
			{
				field.setText(""); //�ؽ�Ʈ�ʵ带 ��ĭ���� ����
				
				cal[0]=""; //String�� cal[0] �ν��Ͻ� ����
				cal[1]="";//String�� cal[1] �ν��Ͻ� ����
				cal[2]="";//String�� cal[2] �ν��Ͻ� ����
				
				cal_i=0; //cal_i�� 0���� �ʱ�ȭ
			}
			else 
			{
				for(int i=0;i<15;i++) //button �迭 ����ŭ for�� �ݺ�
				{
					if(e.getSource()==button[i]) //button[i]�� Ŭ���� ���
					{
						if(i==3||i==7||i==11||i==13||i==14) //���� button[i]�� �ؽ�Ʈ�� "/","*","-","=","+"�� ���
						{
							if(i==13) //"=" ��ư Ŭ���ϸ�
							{
								int int1=Integer.parseInt(cal[0]); //�� ���� �� ù��° ������ int1�� ����
								int int2=Integer.parseInt(cal[2]); //�� ���� �ߵι�° �� ���� int2�� ����
								if(cal[1].equals("+")) //���� �� �����ڰ� "+"�̸�
								{
									result=int1+int2; //������
								}
								else if(cal[1].equals("-")) //���� �� �����ڰ� "-"�̸�
								{
									result=int1-int2; //����
								}
								else if(cal[1].equals("*")) //���� �� �����ڰ� "*"�̸�
								{
									result=int1*int2; //������
								}
								else if(cal[1].equals("/")) //���� �� �����ڰ� "/"�̸�
								{
									divide_result=(double)int1/int2; //divide_result�� ������ ����(float��)
									field.setText(Double.toString(divide_result)); //�� ����� �ؽ�Ʈ�ʵ忡 ���ڿ��� �ٲ㼭 ������
									break; //for�� ����
								}
								field.setText(Integer.toString(result)); //�������� �ƴ� ��� ������ �ؽ�Ʈ�ʵ忡 ���ڿ��� �ٲ㼭 ������
								break; //for�� ��������
							}
							
							else //"="�� �ƴ� �ٸ� �����ڸ� Ŭ������ ���
							{
						    cal[cal_i]=button[i].getText(); //�� �����ڸ� cal�� cal_i��°�ε������� ����
							cal_i++; 
							break; //for�� ��������
							}
						}
						else//button[i]�� ���ڸ� �����ϸ�
						{
							field.setText(button[i].getText());//�� ����(���ڿ�����)�� cal�� cal_i��°�ε������� ����
							cal[cal_i]=button[i].getText();//�ε��� +1 ����
							cal_i++;
							break;//for�� ��������
						}	
					}
				}
			}
		}
			catch(Exception e1) //������ �־������ ������� Ŭ�� ���ҽ�.
			{
				System.out.println("�߸� Ŭ����");
			}
	}
	}
		
	}
		


