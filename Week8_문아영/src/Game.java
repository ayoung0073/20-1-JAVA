import java.util.Scanner;
public class Game {
	public int userWin=0;  //user�� �̱� Ƚ��
	public int computerWin=0; //��ǻ�Ͱ� �̱� Ƚ��
	public int userInput=0; //����(1),����(2),��(3) ��  user�� �� ��ȣ
	public int computerRand=0; //������(1~3����)
	String[] str= {"����","����","��"}; //String�� ����, ����, ���� ������ �迭 ���� �� �ʱ�ȭ
	
	Scanner kbd=new Scanner(System.in); //Scanner ��ü ����
	public void play() {
		System.out.println("���������� ������ �����մϴ�.");
		input(); //input�޼��� ȣ��
		System.out.printf("You(%d)\tCom(%d)",userWin,computerWin); //input�޼��� �� user�� �̱� Ƚ���� ��ǻ�Ͱ� �̱� Ƚ�� �˷���
		System.out.println(); // ���ٶ���
		
		if(userWin==3) System.out.println("����� �̰���ϴ�.");  //�̱�Ƚ���� 3�� ���(or computer)�� �̱�.
		else System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		
		System.out.println("������ �����մϴ�.");
	}
	
	public void input(){ //play�޼��尡 ȣ���� �޼���
		System.out.println();
		while(userWin!=3 && computerWin!=3) { //user�� computer�� �̱�Ƚ���� 3�� �Ǳ� ������ while�� �ݺ�. 
			try { //���� �߻��� ���ɼ� �ִ� ������� ����
			System.out.printf("����� ������?(You(%d) - Com(%d))\n",userWin,computerWin);
			System.out.println("����(1)	����(2)	��(3)");
			userInput=kbd.nextInt(); //��ȣ �Է¹ޱ�
				if(userInput!=1&&userInput!=2&&userInput!=3) throw new Exception("������ �߸��Ǿ����ϴ�."); //��ȣ�� 1,2,3 �� �ƴϸ� ��ġ�ϴ� catch�� ã�Ƽ� catch�� ���� ����� ����.
			computerRand=(int)(Math.random()*3)+1; //���� �߻����� ������ �Լ� ����. computer�� ��ȣ �������� ����(1~3����)
			
			System.out.println("<You>\t<Com>");
			if(userInput==3) System.out.print(str[userInput-1]+"\t\t"); //3���� "��"�ε� ���� ���� ���� �ι�ó���ؾ� ���ĸ����� �ȴ� ��ȣ�� n�̸� str�迭���� �ε����� n-1�̹Ƿ� -1�� ���ش�
			else System.out.print(str[userInput-1]+"\t");
			System.out.println(str[computerRand-1]); //str�迭���� �ε����� (��ǻ���� ��ȣ-1)�� �ش�Ǵ� �� ���
			writeOutput(); //writeOutput�޼��� ȣ��
		}//���ܰ� ����� �� �� �������� �� �ǳʶٰ� catch������ ��
			catch(Exception e){ //���ܰ� �߻����� �� catch�� ����
				System.out.println(e.getMessage()); //"������ �߸��Ǿ����ϴ�." ���
				System.out.println();//���� �ǳʶٱ�
			} //catch���� while�� �ȿ� �����Ƿ� �ٽ� while������ ���ư��� while�� �ݺ���.
	}
	}
	public void writeOutput() { //input�޼��尡 ȣ���� �޼���
		if(userInput==computerRand) { //��ȣ�� ������ ���
			System.out.println("���");
		}
		else if(userInput-computerRand>0) { //user��ȣ���� ��ǻ�͹�ȣ�� �Q�� �� 0���� ũ��
			if((userInput-computerRand)%3==1) { //�������� 1�̸�
				System.out.println("��� ��"); //user�� ex1)user:2(����) computer:1(����) ex2) user:3(��) computer:2(����) 
				userWin++; //user�� �¸��� Ƚ�� 1�߰��ϱ�
			}
			else {//�������� 2�̸�
				System.out.println("��ǻ�� ��"); // ex1)user:3(��) computer:1(����)
				computerWin++; //��ǻ�Ͱ� �¸��� Ƚ�� 1�߰�
			}
		}
		else{//user��ȣ���� ��ǻ�� ��ȣ �Q�� �� 0���� �۰�
			if((computerRand-userInput)%3==1) { //�ڹٿ��� ������������ ��ȣ�� �����ϰ� ���Ǳ� ������ ��ǻ�Ϳ��� user��ȣ�� ���� ������ �Ѵ�.
				System.out.println("��ǻ�� ��"); //ex1) user:1(����) computer:2(����) ex2)user:2(����) computer:3(��)
				computerWin++; //��ǻ�Ͱ� �¸��� Ƚ�� 1�߰�
			}
			else { // ������ 2
				System.out.println("��� ��"); //ex1)user:1(����) computer:3(��) 
				userWin++;//user�� �¸��� Ƚ�� 1�߰��ϱ�
		}
		}
		System.out.println();
	}
}
