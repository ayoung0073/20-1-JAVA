package HW1_1_���ƿ�;

public class Time { //Time Ŭ���� ����
	private int hour; //�ν��Ͻ����� hour(�ð�) private���� ����
	private int minute; //�ν��Ͻ����� minute(��) private���� ����
	
	private boolean isValid(int hour,int minute) { //�μ� hour�� minute�� ����� �� hour�� minute���� boolean������ ��ȯ�ϴ� �޼���
												   //private���� ������ �޼����̱� ������ ���� Ŭ���������� ȣ�Ⱑ����(���⿡���� setTime�޼��忡�� ȣ�����)
		if (hour>=0 && hour<=23 && minute>=0 && minute<=59) return true;//hour�� 0�̻��̰� 23�����̰�, minute�� 0�̻��̰� 59�����̸� true��ȯ
		else return false; //�� �ܴ� false��ȯ
	}
	public void setTime(int hour,int minute) { //�˸��� �μ� hour�� minute�̸� �ν��Ͻ����� �����ϴ� setTime�޼���
		if (isValid(hour,minute)) { //isValid�޼��尡 true�� ��ȯ�ϸ�
			this.hour=hour; //�ν��Ͻ����� ������
			this.minute=minute;
		}
		else System.out.println("Wrong Input"); //isValid�޼��尡 false�� ��ȯ�ϸ� "Wrong Input"���
	}
	public int getTime(char ch) { //�μ��� ���� �ν��Ͻ����� hour�̳� minute ��ȯ�ϴ� �޼���
		if (ch=='H' || ch=='h') return hour; //�μ��� 'h'�� 'H'�̸� hour��ȯ
		else if (ch=='M' || ch=='m') return minute; //�μ��� 'm'�̳� 'M'�̸� minute��ȯ
		else return 0; //�׿ܴ� 0�� ��ȯ
	}
}
