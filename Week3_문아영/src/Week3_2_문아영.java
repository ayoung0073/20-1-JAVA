import java.util.Scanner;
public class Week3_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Circle circle=new Circle(); //Circle���� circle ��ü ����
		Scanner kbd=new Scanner(System.in); //Scanner ��ü ����
		
		System.out.print("�������Է�:");
		circle.setRadius(kbd.nextDouble()); //radius�� double���̹Ƿ� double������ �Է¹޴´�.
		System.out.println("������:"+circle.getRadius()); //������ �Է¹ޱ�
		circle.circleInfo(); //������ ���(��ü �޼��� �̿��ؼ�)

	}

}
