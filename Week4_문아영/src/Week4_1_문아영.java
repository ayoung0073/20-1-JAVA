import java.util.Scanner;
public class Week4_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Song s; //�ν��Ͻ��� �������� �ʰ� SongŬ�������� �������� s�� ���� �Ѵ�.
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		String userTitle=""; //�Է¹��� userTitle ������ ���ڿ��� �ʱ�ȭ�Ѵ�.
		String userSinger=""; //�Է¹��� userSinger ������ ���ڿ��� �ʱ�ȭ�Ѵ�.
		int userPrice; //�Է¹��� userprice ���� ����
		
		int num; //��� ������ �Է¹��� num ������ �����Ѵ�.
		int sumPrice=0; //�� ���� sumPrice��� �̸��� ������ �����Ѵ�.
		
		System.out.println("*Song ����*");

		while(userTitle.equals("")) { //userPrice�� ���ڿ��� �� while���� ����.
			System.out.print("���:");
			userTitle=kbd.nextLine(); //����� �Է¹޴´�
			if(userTitle.equals("")) { //�Է¹��� ����� ���ڿ��� ��
				System.out.println("����� �ݵ�� �ʿ��մϴ�."); //"����� �ݵ�� �ʿ��մϴ�." ���
			}
		}
		System.out.print("������:"); //while���� ���������� ��(��� ���ڿ� �ƴ� ��) ���
		userSinger=kbd.nextLine(); //������(String��) �Է¹޴´� 
		System.out.print("����:"); 
		userPrice=kbd.nextInt(); //����(int��) �Է¹޴´�
		System.out.println("��� �����ðڽ��ϱ�?");
		num=kbd.nextInt(); //��� ������ �Է� �ޱ�
		
		if(userSinger.equals("")) { //�������� ���ڿ��� ��
			s=new Song(userTitle,userPrice); //�Ű������� 2���ִ� �����ڸ� �̿��� �ν��Ͻ� ����
		}
		else { //�������� ���ڿ��� �ƴ� ��
			s=new Song(userTitle, userSinger,userPrice); //�Ű������� 3�� �ִ� �����ڸ� �̿��ؼ� �ν��Ͻ��� ����
		}
		
		for (int i=0;i<num;i++) { 
			s.play(); //num�� play()�޼��� ȣ���Ѵ�(�뷡���� num�� ���)
			sumPrice+=s.price; //num�� for�� �� ���� price ���ϱ�
		}
		
		System.out.println("�� "+sumPrice+"���Դϴ�.");
	}

}
