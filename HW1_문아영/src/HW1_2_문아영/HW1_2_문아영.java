package HW1_2_���ƿ�;

import java.util.Scanner;
public class HW1_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		DiceGame game=new DiceGame(); //DiceGame ��ü ����(��������: game)
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		char yOrN='y'; //������ �ݺ����� ���� �Է¹��� ����, while�� ���Ǹ����ϱ� ���� 'y'�� �ʱ�ȭ.
		
		while(yOrN=='y') { 
			System.out.println("<< GAME START >>");
			System.out.println("Dice is rolled!!!");
			System.out.println("Guess the number! What do you think?");
			
			game.startPlaying(); //GameŬ������ startPlaying�޼��� ȣ��
			
			System.out.println("Try again?(y/n)"); 
			String yesOrNo=kbd.next(); //String�� yesOrNo �����ؼ� ���ڿ��� �Է¹޴´�.
			if(yesOrNo.equalsIgnoreCase("y")) yOrN='y'; //�Է¹������� "y"�� "Y"�̸� yOrN������ 'y'����(while��  ��������)
			else if(yesOrNo.equalsIgnoreCase("n")) { //�Է¹��� ���ڿ��� "n"�̳� "N"�̸�
				System.out.println("Game finished."); //������ ����ƴٰ� ����ϰ�
				yOrN='n';//yOrN�� 'n'�� �����ؼ� while���� ���������� �ϰ� ������.
			}
			
			System.out.println();
		}

	}

}
