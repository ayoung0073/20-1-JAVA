import java.util.Scanner;
public class Week1_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int base;
		int height;
		float area;
		
		Scanner user=new Scanner(System.in); //Scanner ��ü �����Ѵ�. (user: ����������)
		
		System.out.print("Input base:");//println�� �ƴ� print�� ���� ���� �ٷ� �Ѿ�� �ʴ´�.
		base=user.nextInt(); //nextInt �޼ҵ�� �Է� �ް� base��� �̸��� ������ �����Ѵ�.(�غ�)
		System.out.print("Input height:");
		height=user.nextInt();// �� �ٽ� nextInt�޼ҵ�� �Է� �ް� height��� �̸��� ������ �����Ѵ�.(����)
		area=(float)(base*height)/2; //������ �غ��� ���̸� ���ϸ� �����̹Ƿ� float������ ����ȯ�� �ϰ��� 2�� ������� ����� �� �Ҽ��� ���� ����� �� �� �ִ�.(�ﰢ�� ����)
		System.out.println("The area:"+area);

	}

}
