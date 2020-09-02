import java.util.Scanner;
public class Week3_4_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		String YesOrNo="y"; //나중에 반복할 것인지 확인하는 String형 변수 선언 일단 "y"로 대입해서 while문의 조건에 맞게 한다.
		
		MenuOrder order=new MenuOrder(); //MenuOrder형인 order라는 이름의 객체 생성
		Scanner kbd=new Scanner(System.in); //Scanner형 객체 생성
		
		System.out.println("--- 음료가격 설정 ---"); //음료가격 설정하기
		System.out.print("Coke가격:");
		order.setPrice("coke", kbd.nextInt()); //MenuOrder클래스 형의 메서드를 이용해서 coke가격 설정하기
		System.out.print("Lemonade가격:");
		order.setPrice("lemonade", kbd.nextInt()); //MenuOrder클래스형의 메서드를 이용해서 lemonade가격 설정하기
		System.out.print("Coffee가격:");
		order.setPrice("coffee", kbd.nextInt()); //MenuOrder클래스형의 메서드를 이용해서 coffee가격 설정하기
		
		System.out.println(); //줄넘김
		
		while(YesOrNo.equalsIgnoreCase("y")) { //만약
			System.out.println("--- 돈을 넣으세요 ---");
			order.setinputMoney(kbd.nextInt()); //넣을 돈 입력받기
			kbd.nextLine();
			order.showMenu(); //메뉴 정보들 출력
			String drink=kbd.nextLine();
			//System.out.println(drink);
			order.showResult(drink); //선택할 메뉴번호를 입력받으면 가격이랑 넣은 돈 비교해서 잔액 or 부족한 돈 말해주기
			//kbd.nextLine(); //Enter넘김
	
			System.out.println("계속 하시겠습니까?(y/n)"); 
			YesOrNo=kbd.nextLine(); //YesOrNo에 y(대/소문자 상관없이)이면 반복, 아니면 while문 돌지 않기
			System.out.println(); //줄넘김
		}
		

	}

}
