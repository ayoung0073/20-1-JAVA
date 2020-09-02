package HW1_2_���ƿ�;
import java.util.Scanner;
public class DiceGame { 
	private int diceFace; //������(1~6), private���� ����
	private int userGuess; //����ڰ� ����(�Է�)�� ��, private���� ����
	
	Scanner kbd=new Scanner(System.in); //Scanner��ü ����
	
	private int rollDice() { //private���� rollDice�޼��� ����(���� Ŭ���������� ȣ�Ⱑ��)
		diceFace=(int)(Math.random()*6)+1; //MathŬ������ random�޼��带 �̿��ؼ� 1~6�� �������� diceFace�� ����
		return diceFace; //diceFace ��ȯ
	}
	private int getUserInput() { //private���� �����߱� ������ ���� Ŭ���� ������ �޼��� ȣ�� ����
		userGuess=0; //main�޼��尡 ���Ե� Ŭ�������� ������ ��������� �� ����� userGuess�� �����ֱ� ������ ���⿡�� 0���� �ʱ�ȭ ���ش�.�׷����� while���� ������ �����ؼ� ���� �Է¹��� �� �ִ�.
		while(userGuess<1 || userGuess>6) {
			userGuess=kbd.nextInt();
			if(userGuess<1 || userGuess>6) System.out.println("Input number between 1~6"); //userGuess�� ������ ���� ������ �ٽ� �Է��϶�� ������ ��µǰ� �ٽ� while���� �ݺ��Ѵ�.
		}
		return userGuess; //������ �����ϴ� userGuess�� �Է��ϸ� while���� �������� userGuess��ȯ��.
	}
	private void checkUserGuess(int userGuess) { //������(diceFace)�� userGuess�� ���ϴ� �޼���. private���� �����߱� ������ ���� Ŭ���� ������ �޼��� ȣ�Ⱑ��
		if(diceFace==userGuess) System.out.println("Bingo!"); //�������� userGuess�� ������ "Bingo!"���
		else System.out.println("Wrong!\nThe face was "+diceFace);//�ٸ��� diceFace �˷��ִ� ���� ���
	}
	public void startPlaying() { //private�޼���� ȣ���ϴ� �޼���
		rollDice();
		checkUserGuess(getUserInput()); //private���� getUserInput()�޼��带 ȣ���ؼ� �μ��� ����
	}
}
