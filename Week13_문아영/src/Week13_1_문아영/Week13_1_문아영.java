package Week13_1_���ƿ�;

import java.util.Scanner;

class SharedArea //SharedAreaŬ���� ����(�� Thread�� ������ ��ȯ�� ���� ��������)
{
	double ratio; 
	boolean isReady;
}

public class Week13_1_���ƿ� {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int n;  //�Է¹��� Ƚ��
		Scanner kbd=new Scanner(System.in); //��ĳ�� ��ü ����
		SharedArea SA=new SharedArea(); //SharedArea �������� ����(�������� : SA)
		SimulThread st; //SimulThreadŬ���� �������� ����
		PrintThread pt; //PrintThread Ŭ���� �������� ����
		
		System.out.println("Input the number of coin toss:");
		n=kbd.nextInt(); //�Է¹��� ���� n�� ����
		
		st=new SimulThread(n); //n�� ���ڷ� ���� SimulThread �ν��Ͻ� ����
		pt=new PrintThread(); //PrintThread �ν��Ͻ� ����
		
		
		st.sharedArea=SA; //st, pt�� ��������(SA) ����.
		pt.sharedArea=SA;
		
		st.start(); //SimulThread(��������:st) ���۽�Ű��
		pt.start(); //PrintThread(��������:pt) ���۽�Ű��
	}

}
