package Week13_1_���ƿ�;

public class PrintThread extends Thread{ //ThreadŬ������ ��ӹ��� PrintThreadŬ����
	 SharedArea sharedArea; //�������� ����
	 public void run()
	 {
		 if(sharedArea.isReady!=true) //sharedArea(��������)�� ������� isReady�� false�̸�
		 {
			 try{ //wait�Լ��� ���� ���� try~catch�� �̿�
					 synchronized(sharedArea){ //����ȭ
						 sharedArea.wait(); //�ٸ� thread�� ��ȣ�� ��ٸ�
					 	}
			 }
			 catch(InterruptedException e){
				 System.out.println(e.getMessage());
			 }
		 }
		 System.out.printf("%.2f",sharedArea.ratio*100); //�Ҽ��� ��°�ڸ����� �ۼ�Ʈ���� 
		 System.out.println("%");//%����
	 }
}
