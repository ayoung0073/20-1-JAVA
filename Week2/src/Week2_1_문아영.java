import java.util.Scanner;
public class Week2_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int money;
		int num_50000=0,num_10000=0,num_5000=0,num_1000=0,num_500=0,num_100=0,num_50=0,num_10=0,remainder=0;
		
		Scanner keyboard=new Scanner(System.in); //Scanner ��ü ����
		
		System.out.print("Input the amount of money(0~100000): ");
		money=keyboard.nextInt(); //�ݾ� �Է¹޾Ƽ� money��� ������ ����.
	
		if(money<=0||money>=100000) { //0���� 100000������ �ݾ��� �ƴ϶�� 
			System.out.println("�߸��� �Է�"); //"�߸��� �Է�" ��½�Ű�� �����Ŵ
		}
		else { //0���� 100000���� �ݾ��� ��
		while(money>0) { //money�� 0�� �Ǹ� while�� ���.
				if(money>=50000) {
					num_50000=money/50000; //money�� 50000�� ���� ���� �ִ� 50000���� ���� ������ ��
					money=money%50000; //money�� 50000�� ���� �������� (money-50000*num_50000)���� �� money�� ����
				}
				else if( money>=10000) {
					num_10000=money/10000; //money�� 10000�� ���� ���� �ִ� 10000���� ���� ������ ��
					money=money%10000; //money�� 10000�� ���� �������� (money-10000*num_10000)���� ��  money�� ����
			
				}
				else if (money>=5000) { 
					num_5000=money/5000; //money�� 5000�� ���� ���� �ִ� 5000���� ���� ������ ��
					money=money%5000; //money�� 5000�� ���� �������� (money-5000*num_5000)���� ��  money�� ����
				}
				else if (money>=1000) {
					num_1000=money/1000; //money�� 1000�� ���� ���� �ִ� 1000���� ���� ������ ��
					money=money%1000; //money�� 1000�� ���� �������� (money-1000*num_1000)���� ��  money�� ����
				}
				else if (money>=500) { 
					num_500=money/500; //money�� 500�� ���� ���� �ִ� 500�� ���� ������ ��
					money=money%500; //money�� 500�� ���� �������� (money-500*num_500)���� ��  money�� ����
				}
				else if (money>=100) { 
					num_100=money/100; //money�� 100�� ���� ���� �ִ� 100�� ���� ������ ��
					money=money%100; //money�� 100�� ���� �������� (money-100*num_100)���� ��  money�� ����
				}
				else if (money>=50) { 
					num_50=money/50; //money�� 50�� ���� ���� �ִ� 50�� ���� ������ ��
					money=money%50; //money�� 50�� ���� �������� (money-50*num_50)���� ��  money�� ����
				}
				else if (money>=10) { 
					num_10=money/10; //money�� 10�� ���� ���� �ִ� 10�� ���� ������ ��
					money=money%10; //money�� 10�� ���� �������� (money-10*num_10)���� ��  money�� ����
				}
				else {
					remainder=money; //���� �ڸ��� �ǹ�
					money=money/10; //money�� 10�� ���� �������� 0�� �ǹǷ� �ٽ� �ݺ����� �� �� ���ǿ� ���� �ʾƼ� while���� ����ȴ�
				}
				}
			
			
		System.out.println("The output will be");
		System.out.println("50000 won: "+num_50000);
		System.out.println("10000 won: "+num_10000);
		System.out.println("5000 won: "+num_5000);
		System.out.println("1000 won: "+num_1000);
		System.out.println("500 won: "+num_500);
		System.out.println("100 won: "+num_100);
		System.out.println("50 won: "+num_50);
		System.out.println("10 won: "+num_10);
		System.out.println("Remainder: "+remainder);

	}
	}

}
