package Week13_2_���ƿ�;


public class RandomThread extends Thread{ //ThreadŬ���� ��ӹ��� RandomThread
	 SharedArea sharedArea;//�������� ����
	 boolean stop; //����Ʈ:false
	 public void setStop(boolean s) { //boolean���� ���ڷ� �޴� �޼���
		 stop=s; //�� boolean���� stop�� ����
	 }
	 
	 String[] str= {"moon","ayo","dog","cat","water","air","pod","ipad","cream","cyber","boan","ewha","java","python","cake","happy","money","main","css","html"}; //String�� �迭 str�� ����
	public  void run()
	 {
		 for(int i=0;i<20;i++) 
		 {
			 if(stop==true) break; //stop�� true�̸� for�� ����������
			 
			 int randnum=(int)(Math.random()*20);  //randnum�� 0~19�� �������� ����
			 sharedArea.randStr=str[randnum]; //sharedArea�� ������� randStr�� str�迭�� randnum��° �ε����� ����
			 System.out.println(str[randnum]); //str�迭�� randnum�ε��� �� ���
			 try { //sleep�Լ��̿��ϱ� ���� try~catch�� �̿�
				 Thread.sleep(1000); //1�ʵ��� ����
			 }
			 catch(InterruptedException e) {
				 System.out.println(e.getMessage());
			 }
		  }
	 sharedArea.end=1; //for�� ��� �ݺ��ϸ� sharedArea�� ������� end�� 1����(���и� ������)
	 }
}
