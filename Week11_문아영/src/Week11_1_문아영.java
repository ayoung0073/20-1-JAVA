import java.awt.*;
import javax.swing.*;

class CalFrame extends JFrame{ //JPrameŬ������ ��ӹ��� CalFrameŬ����
	public CalFrame() //CalFrame ������
	{
		setTitle("Calculator"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�ݱ� ���� ���α׷� ����ǰ� �ϴ� �޼���
		setSize(300,200); //â ������ ����
		setResizable(false); //â ũ�������� �� ���� ����
		
		JPanel t_panel=new JPanel(); //�ٸ� component���� �� �ִ� container(panel) ����.
		t_panel.setLayout(new BorderLayout()); //t_panel�� ���̾ƿ��� BorderLayout���� ����
		
		JPanel panel=new JPanel(); //t_panel�� ���� �� �ٸ� panel->���� �ε帱 ����
		panel.setLayout(new GridLayout(0,4)); //panel�� ���̾ƿ��� Grid���� ����. column�� 4�� ������ row�� �ڵ� �����ϰ� ���鵵�� ��.
		makeButton("ON",panel); //String���� JPanel���� �μ��� �޴� makeButton�޼��� ȣ��
		makeButton("AC",panel); //���� ���� �Ʒ� �ݺ�
		makeButton("C",panel);
		makeButton("OFF",panel);
		makeButton("7",panel);
		makeButton("8",panel);
		makeButton("9",panel);
		makeButton("/",panel);
		makeButton("4",panel);
		makeButton("5",panel);
		makeButton("6",panel);
		makeButton("X",panel);
		makeButton("1",panel);
		makeButton("2",panel);
		makeButton("3",panel);
		makeButton("-",panel);
		makeButton("0",panel);
		makeButton(".",panel);
		makeButton("=",panel);
		makeButton("+",panel);
		
		JTextField field=new JTextField(); //t_panel�� NORTH�κп� ���� �ؽ�Ʈ ���� �ν��Ͻ� ���� ��������: field
		field.setHorizontalAlignment(JTextField.RIGHT); //������ �Է� �� �����ʿ� ��Ÿ���� ��
		
		add(t_panel); //�����ӿ� t_panel�߰�
		
		t_panel.add(field,BorderLayout.NORTH); //t_panel�� NORTH�κп� �ؽ�Ʈ����(field)�߰�(����)
		t_panel.add(panel,BorderLayout.CENTER); //t_panel�� CENTER�κп� panel �߰� (����)
		
		setVisible(true); //â�� ���̰� ��
	}
	public void makeButton(String text,JPanel panel)  //String�� text�� JPanel�� panel�� �μ��� ����
	{
		JButton button=new JButton(text); //text���ڿ��� �Բ� ��ư ����
		button.setAlignmentX(CENTER_ALIGNMENT); //x��(����)�� ��� ���ķ� ��
		panel.add(button); //panel���� button �߰�(����)
	}
}


public class Week11_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		CalFrame cf=new CalFrame(); //CalFrame�� �̿��Ͽ� �ν��Ͻ� ����

	}
}
