import java.util.Scanner;
public class Week3_4_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		String YesOrNo="y"; //���߿� �ݺ��� ������ Ȯ���ϴ� String�� ���� ���� �ϴ� "y"�� �����ؼ� while���� ���ǿ� �°� �Ѵ�.
		
		MenuOrder order=new MenuOrder(); //MenuOrder���� order��� �̸��� ��ü ����
		Scanner kbd=new Scanner(System.in); //Scanner�� ��ü ����
		
		System.out.println("--- ���ᰡ�� ���� ---"); //���ᰡ�� �����ϱ�
		System.out.print("Coke����:");
		order.setPrice("coke", kbd.nextInt()); //MenuOrderŬ���� ���� �޼��带 �̿��ؼ� coke���� �����ϱ�
		System.out.print("Lemonade����:");
		order.setPrice("lemonade", kbd.nextInt()); //MenuOrderŬ�������� �޼��带 �̿��ؼ� lemonade���� �����ϱ�
		System.out.print("Coffee����:");
		order.setPrice("coffee", kbd.nextInt()); //MenuOrderŬ�������� �޼��带 �̿��ؼ� coffee���� �����ϱ�
		
		System.out.println(); //�ٳѱ�
		
		while(YesOrNo.equalsIgnoreCase("y")) { //����
			System.out.println("--- ���� �������� ---");
			order.setinputMoney(kbd.nextInt()); //���� �� �Է¹ޱ�
			kbd.nextLine();
			order.showMenu(); //�޴� ������ ���
			String drink=kbd.nextLine();
			//System.out.println(drink);
			order.showResult(drink); //������ �޴���ȣ�� �Է¹����� �����̶� ���� �� ���ؼ� �ܾ� or ������ �� �����ֱ�
			//kbd.nextLine(); //Enter�ѱ�
	
			System.out.println("��� �Ͻðڽ��ϱ�?(y/n)"); 
			YesOrNo=kbd.nextLine(); //YesOrNo�� y(��/�ҹ��� �������)�̸� �ݺ�, �ƴϸ� while�� ���� �ʱ�
			System.out.println(); //�ٳѱ�
		}
		

	}

}
