import java.awt.*;
import javax.swing.*;

class StuFrame extends JFrame{ //JFrameŬ������ ��ӹ��� StuFrameŬ����
	public StuFrame() //StuFrame ������
	{
		setTitle("Student Information"); //������ 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�ݱ� ������ ���ÿ� ���α׷� �����ϰ� �޼��� ����
		setSize(350,200); //â������ ����
		setResizable(false); //â ���������� �������� ���ϰ� �ϴ� �޼���
		
		JPanel t_panel=new JPanel(); //�ٸ� component���� �� �ִ� container(panel) ����.
		t_panel.setLayout(new BorderLayout()); //t_panel�� ���̾ƿ��� BorderLayouy���� ����
		
		JPanel onPanel=new JPanel(); //t_panel�� ���� onPanel (t_panel�� NORTH�κп� ���� �г�)
		JLabel titleLB=new JLabel("STUDENT INFORMATION"); //����Label ����
		t_panel.add(onPanel,BorderLayout.NORTH); //t_panel�� NORTH�κп� onPanel�� �߰�(����)
		onPanel.add(titleLB); //onPanel�� �����̺�(Component) �߰�
	
		JPanel panel=new JPanel();//t_panel�� ���� �� �ٸ� panel
		panel.setLayout(new GridLayout(0,2)); //column�� 2�� ������ row�� �ڵ� �����ϵ��� ����.
		
		JLabel nameLB=new JLabel("NAME"); //�̸�Label ����
		JTextField nameFD=new JTextField(); //�̸� �ؽ�Ʈ�ʵ� ����
		nameFD.setHorizontalAlignment(JTextField.LEFT); //�ؽ�Ʈ�ʵ忡 ������ �Է� �� ���ʿ� ��Ÿ���� ��
		
		JLabel genderLB=new JLabel("GENDER"); //�������̺� ����
		JRadioButton mButton=new JRadioButton("Male"); //�ؽ�Ʈ�� "Male"�� ������ư ����
		JRadioButton fButton=new JRadioButton("Female",true); //�ؽ�Ʈ�� "Female"�̰� �ʱ���¿� "Female"�� ���õǵ��� ���� ��ư ����
		ButtonGroup bg=new ButtonGroup(); 
		bg.add(mButton); //mButton�� fButton�� �׷����� ����
		bg.add(fButton);
		
		JLabel idLB=new JLabel("ID"); //ID���̺� ����
		JTextField idFD=new JTextField(); //ID �ؽ�Ʈ �ʵ� ����
		
		JLabel dpmLB=new JLabel("DEPARTMENT"); //�μ����̺� ����
		JTextField dpmFD=new JTextField(); //�μ� �ؽ�Ʈ �ʵ� ����
		
		panel.add(nameLB); //panel�� �̸����̺� �߰�(����)
		panel.add(nameFD); //���Ͱ��� �Ʒ� �ݺ�
		panel.add(genderLB);
		

		JPanel genderPanel=new JPanel(); //genderPanel ����
		genderPanel.add(mButton); //genderPanel�� mButton ����(�߰�)
		genderPanel.add(fButton); //genderPanel�� fButton ����(�߰�)
		panel.add(genderPanel); //panel�� genderPanel����
		
		panel.add(idLB); //panel�� ID���̺� ����
		panel.add(idFD); //���� ���� �Ʒ� �ݺ�
		panel.add(dpmLB);
		panel.add(dpmFD);
		
		add(t_panel); //�����ӿ� t_panel�߰�
		
	
		t_panel.add(panel); //t_panel�� panel ����

		JPanel downPanel=new JPanel(); //panel����(t_panel�� SOUTH�κп� ���� panel)
		
		JButton saveBT=new JButton("Save"); //�ؽ�Ʈ�� "Save"�� button ����
		JButton cancelBT=new JButton("Cancel"); //�ؽ�Ʈ�� "Cancel"��   button ����
		
		t_panel.add(downPanel,BorderLayout.SOUTH); //t_panel�� SOUTH�κп� downPanel �߰� 
		
		downPanel.add(saveBT); //downPanel�� �����ư �߰�
		downPanel.add(cancelBT); //downPanel�� ��ҹ�ư �߰�
		
		pack(); //component�� ������ ������ �ּ�ȭ��Ŵ
		setVisible(true); //â�� ���̰� ��
		
	}
}
public class Week11_2_���ƿ� {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		StuFrame sf=new StuFrame();//StuFrame�� �̿��Ͽ� �ν��Ͻ� ����
	}

}
