import java.util.Scanner;
public class Week1_3_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int f;
		float c;
		
		Scanner keyboard=new Scanner(System.in); //Scanner ��ü�� �����Ѵ�.
		
		System.out.print("ȭ���µ� �Է�:"); //���� �ٷ� �Ѿ�� �ʰ� �Է� �ޱ� ���� println�� �ƴ� print�� ��
		f=keyboard.nextInt();
		System.out.println(); //�� �� �ǳʶٱ�
		c=(float)5/9*(f-32); //5,9,f,32�� ��� �����̱� ������ float������ ��ȯ�ϱ� ���� 5�� (float)5�� ����ȯ�ϸ� ����� ����� float���� �ȴ�.
		System.out.println("ȭ���µ�:"+f); //+f�� �����ϸ� ���� ���ڿ��� ����ż� ���ڿ��� ���δ�.
		System.out.printf("�����µ�:%.1f",c);//System.out.printf�� %.1f�� �̿��ؼ� �Ҽ��� ���� 1�ڸ��� ǥ���ϰ� ��.
		
	}

}
