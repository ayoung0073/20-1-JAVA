import java.util.Scanner;
public class Week4_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Song s; //인스턴스를 생성하지 않고 Song클래스형인 참조변수 s를 선언만 한다.
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		String userTitle=""; //입력받을 userTitle 변수를 빈문자열로 초기화한다.
		String userSinger=""; //입력받을 userSinger 변수를 빈문자열로 초기화한다.
		int userPrice; //입력받을 userprice 변수 선언
		
		int num; //몇번 들을지 입력받을 num 변수를 선언한다.
		int sumPrice=0; //총 가격 sumPrice라는 이름의 변수를 선언한다.
		
		System.out.println("*Song 정보*");

		while(userTitle.equals("")) { //userPrice가 빈문자열일 때 while문을 돈다.
			System.out.print("곡명:");
			userTitle=kbd.nextLine(); //곡명을 입력받는다
			if(userTitle.equals("")) { //입력받은 곡명이 빈문자열일 때
				System.out.println("곡명은 반드시 필요합니다."); //"곡명은 반드시 필요합니다." 출력
			}
		}
		System.out.print("가수명:"); //while문을 빠져나왔을 때(곡명 빈문자열 아닐 때) 출력
		userSinger=kbd.nextLine(); //가수명(String형) 입력받는다 
		System.out.print("가격:"); 
		userPrice=kbd.nextInt(); //가격(int형) 입력받는다
		System.out.println("몇번 들으시겠습니까?");
		num=kbd.nextInt(); //몇번 들을지 입력 받기
		
		if(userSinger.equals("")) { //가수명이 빈문자열일 때
			s=new Song(userTitle,userPrice); //매개변수가 2개있는 생성자를 이용해 인스턴스 생성
		}
		else { //가수명이 빈문자열이 아닐 때
			s=new Song(userTitle, userSinger,userPrice); //매개변수가 3개 있는 생성자를 이용해서 인스턴스를 생성
		}
		
		for (int i=0;i<num;i++) { 
			s.play(); //num번 play()메서드 호출한다(노래정보 num번 출력)
			sumPrice+=s.price; //num번 for문 돌 동안 price 더하기
		}
		
		System.out.println("총 "+sumPrice+"원입니다.");
	}

}
