package HW1_1_���ƿ�;
import java.util.Scanner;
public class HW1_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		Time time=new Time(); //Time��ü ����(�������� time)
		
		int hour,minute; //�Է¹��� ���� ����
		
		System.out.println("Hour:");
		hour=kbd.nextInt(); //hour�Է¹ޱ�
		System.out.println("Minute:");
		minute=kbd.nextInt(); //minute�Է¹ޱ�
		
		time.setTime(hour, minute); //TimeŬ������ setTime�޼��� ȣ���ؼ� time�� �ν��Ͻ� ���� ����
		System.out.println(time.getTime('H')+":"+time.getTime('m'));
		//TimeŬ������ getTime�޼��带 ȣ���ؼ� hour�� minute ���

	}

}
