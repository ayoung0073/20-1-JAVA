import java.util.Scanner;
public class Week6_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int num=1; //������ ��ȣ�� ������ num���� ����. while�� ���� �����ϱ� ���� 0�� �ƴ� ���� ����
		
		Buyer buyer=new Buyer(); //�������� buyer�� �̿��� Buyer��ü ����
		Scanner kbd=new Scanner(System.in);//Scanner��ü ����
		
		System.out.println("How much do you have?");
		buyer.setMoney(kbd.nextInt()); //BuyerŬ������ setMoney�޼��带 �̿��ؼ� buyer�� money�� ����ڷκ��� �Է¹��� �� ����.
		while(num!=0) { //������ ��ȣ�� 0�� �ƴ� �� while�� �ݺ�
			System.out.println("What do you want to buy? Input 0 to quit");
			System.out.println("1. Tv(100)   2. Computer(200)   3. Video(110)   4. Audio(50)   5. NoteBook(300)");
			num=kbd.nextInt(); //nextInt�޼��带 �̿��� num�� ����ڷκ��� �Է¹��� �� ����
			
			switch(num) { //num��(������)
			case 1: //1�� �� ������ ����
				buyer.buy(new Tv());
				break;
			case 2: //1�� ���� ���� �Ʒ� ���� ���� �ݺ�
				buyer.buy(new Computer());
				break;
			case 3:
				buyer.buy(new Video());
				break;
			case 4:
				buyer.buy(new Audio());
				break;
			case 5:
				buyer.buy(new NoteBook());
				break;
			case 0: //num(������ ��ȣ)�� 0�� ���� 
				System.out.println(); //���� ���� 
				break; //switch���� �������� �ٽ� while���� ���µ� ���ǿ� ���� �ʾ� while�� �������� 47�� ���� ����.
			default: //0~5�� �ƴ� �ٸ� ������ ��
				System.out.println("No such item."); //"No such item."���
				break;
			}
		}
		buyer.summary(); //BuyerŬ������ �ִ� summary�޼��� ȣ��
		
		

	}

}
