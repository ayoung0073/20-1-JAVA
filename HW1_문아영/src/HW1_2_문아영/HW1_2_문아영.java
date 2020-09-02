package HW1_2_문아영;

import java.util.Scanner;
public class HW1_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		DiceGame game=new DiceGame(); //DiceGame 객체 생성(참조변수: game)
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		char yOrN='y'; //게임을 반복할지 말지 입력받을 변수, while문 조건만족하기 위해 'y'로 초기화.
		
		while(yOrN=='y') { 
			System.out.println("<< GAME START >>");
			System.out.println("Dice is rolled!!!");
			System.out.println("Guess the number! What do you think?");
			
			game.startPlaying(); //Game클래스의 startPlaying메서드 호출
			
			System.out.println("Try again?(y/n)"); 
			String yesOrNo=kbd.next(); //String형 yesOrNo 선언해서 문자열을 입력받는다.
			if(yesOrNo.equalsIgnoreCase("y")) yOrN='y'; //입력받은것이 "y"나 "Y"이면 yOrN변수에 'y'대입(while문  조건충족)
			else if(yesOrNo.equalsIgnoreCase("n")) { //입력받은 문자열이 "n"이나 "N"이면
				System.out.println("Game finished."); //게임이 종료됐다고 출력하고
				yOrN='n';//yOrN에 'n'을 대입해서 while문을 빠져나가게 하고 종료함.
			}
			
			System.out.println();
		}

	}

}
