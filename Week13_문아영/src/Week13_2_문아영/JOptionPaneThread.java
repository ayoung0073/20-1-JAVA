package Week13_2_���ƿ�;

import javax.swing.JOptionPane;

public class JOptionPaneThread extends Thread{ //ThreadŬ������ ��ӹ��� JOptionPaneThreadŬ����
	SharedArea sharedArea; //�������� ����
	 boolean stop;
	 public void setStop(boolean s) { //boolean���� ���ڷ� �ϴ� setStop�޼���
		 stop=s;//���ڸ� stop�� ����
	 }
	
	public void run()
	{
		while(true) //while�� �ݺ�
		{
				String st=JOptionPane.showInputDialog("���ڿ� �Է�"); //popup dialog window ���� �Է��� ���ڿ��� st�� ����
				if (stop==true) break;//���� stop�� true�̸� while�� ���������� ����
		
				System.out.println("<"+st+">�� �Է��ϼ̽��ϴ�.");
				if(st.equals(sharedArea.randStr))  //���������� randStr�� �Է��� st�� ���ڿ��� ������
				{
					sharedArea.end=2; //sharedArea�� ������� end�� 2�� ����(������ �ǹ�)
					break; //while�� ����������
				}
			}
		}
}

