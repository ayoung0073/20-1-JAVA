import java.util.Scanner;
public class Week1_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int n1,n2,n3;
		float avg;
		
		Scanner keyboard=new Scanner(System.in); //Scanner ��ü�� �����Ѵ�.
		
		System.out.println("���� �� �� �Է�");
		n1=keyboard.nextInt(); //nextInt �޼ҵ�� �Է� �ް� n1�̶�� �̸��� ������ �����Ѵ�. n2,n3�� ���� ������� �Ѵ�.
		n2=keyboard.nextInt();
		n3=keyboard.nextInt();
		avg=(float)(n1+n2+n3)/3; //n1+n2+n3�� �����̱� ������ (float)(n1+n2+n3)�� �Ἥ float������ ����ȯ�� �Ѵ�. �׸��� 3�� ������ ����� ����.(�� ���� ���)
		
		System.out.printf("���: %.2f",avg);//�������� �Ҽ��� ���� ��°�ڸ����� ����϶��Ͽ����Ƿ� System.out.printf�� %.2f�� �̿��ؼ� �ۼ��ߴ�.
	}

}
