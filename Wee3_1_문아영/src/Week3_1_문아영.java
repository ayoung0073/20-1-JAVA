import java.util.Scanner;
public class Week3_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int num; //������ �뷡 ��ȣ�� num�̶�� int������ ���� ����.
		
		Song song1= new Song(); //SongŬ�������� song1�̶�� �̸��� ��ü ����
		Song song2=new Song();//SongŬ�������� song2�̶�� �̸��� ��ü ����
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		System.out.println("*Song 1*"); //Song1 ���� �Է��ϱ�
		System.out.print("����Է�:"); //�ٳѱ� ���ϰ� �Է¹ޱ����� println�� �ƴ� print�� ����.
		song1.title=kbd.nextLine(); //title�� String���̹Ƿ� nextLine���� �Է¹޴´�.
		System.out.print("�������Է�:");
		song1.singer=kbd.nextLine();//singer�� String���̹Ƿ� nextLine���� �Է¹޴´�.
		System.out.print("�����Է�:");
		song1.price=kbd.nextInt(); //price�� int���̹Ƿ� nextInt�� �Է¹޴´�.
		kbd.nextLine(); //get carriage return(���� ������)
		
		System.out.println(); //�� �� �ǳ� �ٱ�
		
		System.out.println("*Song 2*");//Song2�� ���� ���� �Է��ϱ�
		System.out.print("����Է�:");
		song2.title=kbd.nextLine();
		System.out.print("�������Է�:");
		song2.singer=kbd.nextLine();
		System.out.print("�����Է�:");
		song2.price=kbd.nextInt();
		kbd.nextLine();//get carriage return(���� ������)
		
		System.out.println();//�ٳѱ��Ѵ�.
		
		System.out.println("�뷡�� ������");
		System.out.println("1:"+song1.title+" 2:"+song2.title); //1���� ��ü�̸��� song1�� ������ ���ϰ�, 2���� ��ü�̸��� song2�� ������ ���Ѵ�.
		num=kbd.nextInt(); //������ ��ȣ�� �Է��Ѵ�.
		
		if(num==1) { //num�� 1�̸� song1�� ������ ���
			song1.play();
			song1.price();
		}
		
		else if (num==2) { //num�� 2�̸� song2�� ������ ���
			song2.play();
			song2.price();
		}
		
		else {
			System.out.println("�Է��� ��ȣ�� �����ϴ�."); //1,2�� �ƴ� �ٸ� ��ȣ�� ����ϸ� "�Է��� ��ȣ�� �����ϴ�." ���
		}
		System.out.println("�����մϴ�."); //�������� "�����մϴ�."�� ����ϰ� �����Ѵ�.
	}

}
