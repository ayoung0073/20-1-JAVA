package Week13_2_���ƿ�;

class SharedArea{ //SharedAreaŬ���� ����
	String randStr; 
	int end;
}
		
public class Week13_2_���ƿ� {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		

		SharedArea SA=new SharedArea();//SharedArea �������� ����(�������� : SA)
		RandomThread rt=new RandomThread();//RandomThreadŬ������ �ν��Ͻ� ����
		JOptionPaneThread jt=new JOptionPaneThread(); //JOptionPaneThreadŬ������ �ν��Ͻ�����
		
		rt.sharedArea=SA; //rt, jt�� ��������(SA) ����.
		jt.sharedArea=SA;
	
		rt.start();//rt ���۽�Ű��
		jt.start(); //jt ���۽�Ű��
		 
		while(true) //while�� �ݺ�
		{
				if(SA.end ==1) //SA�� ������� end�� 1�̸� 
				{
					jt.setStop(true); //jt �����Ű��
					System.out.println("\n����!"); //"\n����!" ���
					break;//while�� ����������
				}
				else if(SA.end==2) //SA�� ������� end�� 2�̸�
				{
					rt.setStop(true); //rt �����Ű��
					System.out.println("����!"); 
					System.out.println("Timer is stopped.");
					break;//while�� ����������
				}

				try{ // sleep�Լ��̿��ϱ� ���� try~catch�� ���
					Thread.sleep(5); //�ѹ� �ݺ��ϰ� 0.005�� ����
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
	}
}

}
	
