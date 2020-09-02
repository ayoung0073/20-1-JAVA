package Week13_1_���ƿ�;

public class SimulThread extends Thread { //ThreadŬ������ ��ӹ��� SimulThread
	int num; //�Է¹��� Ƚ�� 
	int num_0; //�ո��� ���� ����
	
	SharedArea sharedArea; //sharedArea(��������) ����

	public SimulThread(int num) //num�� ���ڷ� �ϴ� SimulThread ������
	{
		this.num=num; 
	}
	
	public void run()
	{
		for (int i=0; i< num; i++) //num�� for�� �ݺ�
		{
			int zero_one=(int)Math.round(Math.random()); //random, round�� �̿��� zero_one�� 0 �ƴϸ� 1 �����ϱ�
			if(zero_one==0) num_0+=1; //zero_one�� 0�̸� �ո��� ���� ���� +1
		}
		
		sharedArea.ratio=(double)num_0/num; //num���� Ƚ���� �ո��� ���� ���� sharedArea�� ���� 
		sharedArea.isReady=true; //sharedArea�� �⺻��(false)�� ����Ǿ��ִ� ������� isReady�� true�� �ٲ�
		
		synchronized(sharedArea)// ����ȭ
		{
			sharedArea.notify(); //�ٸ� �����忡 ��ȣ ����
		}
	}
}
