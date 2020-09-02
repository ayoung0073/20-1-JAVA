package HW1_2_문아영;
import java.util.Scanner;
public class DiceGame { 
	private int diceFace; //랜덤수(1~6), private으로 선언
	private int userGuess; //사용자가 추측(입력)한 수, private으로 선언
	
	Scanner kbd=new Scanner(System.in); //Scanner객체 생성
	
	private int rollDice() { //private으로 rollDice메서드 선언(같은 클래스에서는 호출가능)
		diceFace=(int)(Math.random()*6)+1; //Math클래스의 random메서드를 이용해서 1~6중 랜덤수를 diceFace에 저장
		return diceFace; //diceFace 반환
	}
	private int getUserInput() { //private으로 선언했기 때문에 같은 클래스 내에서 메서드 호출 가능
		userGuess=0; //main메서드가 포함된 클래스에서 게임을 계속진행할 때 저장된 userGuess가 남아있기 때문에 여기에서 0으로 초기화 해준다.그래야지 while문의 조건을 만족해서 수를 입력받을 수 있다.
		while(userGuess<1 || userGuess>6) {
			userGuess=kbd.nextInt();
			if(userGuess<1 || userGuess>6) System.out.println("Input number between 1~6"); //userGuess가 범위에 맞지 않으면 다시 입력하라는 내용이 출력되고 다시 while문을 반복한다.
		}
		return userGuess; //범위에 만족하는 userGuess를 입력하면 while문을 빠져나가 userGuess반환함.
	}
	private void checkUserGuess(int userGuess) { //랜덤수(diceFace)와 userGuess를 비교하는 메서드. private으로 선언했기 때문에 같은 클래스 내에서 메서드 호출가능
		if(diceFace==userGuess) System.out.println("Bingo!"); //랜덤수와 userGuess가 같으면 "Bingo!"출력
		else System.out.println("Wrong!\nThe face was "+diceFace);//다르면 diceFace 알려주는 내용 출력
	}
	public void startPlaying() { //private메서드들 호출하는 메서드
		rollDice();
		checkUserGuess(getUserInput()); //private형인 getUserInput()메서드를 호출해서 인수로 받음
	}
}
