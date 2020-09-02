import java.util.Scanner;
public class Week3_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int num; //선택할 노래 번호를 num이라는 int형으로 변수 선언.
		
		Song song1= new Song(); //Song클래스형인 song1이라는 이름의 객체 형성
		Song song2=new Song();//Song클래스형인 song2이라는 이름의 객체 형성
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		System.out.println("*Song 1*"); //Song1 정보 입력하기
		System.out.print("곡명입력:"); //줄넘김 안하고 입력받기위해 println이 아닌 print로 쓴다.
		song1.title=kbd.nextLine(); //title은 String형이므로 nextLine으로 입력받는다.
		System.out.print("가수명입력:");
		song1.singer=kbd.nextLine();//singer은 String형이므로 nextLine으로 입력받는다.
		System.out.print("가격입력:");
		song1.price=kbd.nextInt(); //price는 int형이므로 nextInt로 입력받는다.
		kbd.nextLine(); //get carriage return(엔터 가져옴)
		
		System.out.println(); //한 줄 건너 뛰기
		
		System.out.println("*Song 2*");//Song2에 대한 정보 입력하기
		System.out.print("곡명입력:");
		song2.title=kbd.nextLine();
		System.out.print("가수명입력:");
		song2.singer=kbd.nextLine();
		System.out.print("가격입력:");
		song2.price=kbd.nextInt();
		kbd.nextLine();//get carriage return(엔터 가져옴)
		
		System.out.println();//줄넘김한다.
		
		System.out.println("노래를 고르세요");
		System.out.println("1:"+song1.title+" 2:"+song2.title); //1번은 객체이름인 song1의 제목을 뜻하고, 2번은 객체이름인 song2의 제목을 뜻한다.
		num=kbd.nextInt(); //선택할 번호를 입력한다.
		
		if(num==1) { //num이 1이면 song1의 정보를 출력
			song1.play();
			song1.price();
		}
		
		else if (num==2) { //num이 2이면 song2의 정보를 출력
			song2.play();
			song2.price();
		}
		
		else {
			System.out.println("입력한 번호가 없습니다."); //1,2가 아닌 다른 번호를 출력하면 "입력한 번호가 없습니다." 출력
		}
		System.out.println("감사합니다."); //마지막엔 "감사합니다."로 출력하고 종료한다.
	}

}
