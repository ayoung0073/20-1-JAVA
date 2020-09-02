import java.util.Scanner;
public class Week5_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Play play=new Play(); //Play형인 play객체 생성
		Film film=new Film(); //Film형인 film객체 생성
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		System.out.println("Input Title for Play");
		play.setTitle(kbd.nextLine()); //title입력받고 play의 setTitle메서드에 대입해 인스턴스변수 title에 저장
		
		System.out.println("Input Director for Play");
		play.setDirector(kbd.nextLine()); //director입력받고 play의 setDirector메서드에 대입해 인스턴스 변수 director에 저장.
		
		System.out.println("Input Writer for Play");
		play.setWriter(kbd.nextLine()); //writer입력받고 play의 setWriter메서드에 대입해서 인스턴스변수 writer에 저장.

		System.out.println("Input Title for Film");
		film.setTitle(kbd.nextLine()); //title입력받고 film의 setTitle메서드에 대입해 인스턴스변수 title에 저장

		System.out.println("Input Director for Film");//director입력받고 film의 setDirector메서드에 대입해 인스턴스변수 director에 저장
		film.setDirector(kbd.nextLine());

		System.out.println("Input Writer for Film");
		film.setWriter(kbd.nextLine());//writer입력받고 film의 setWriter메서드에 대입해서 인스턴스변수 writer에 저장.
	
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(kbd.nextInt());//정수 입력받아서 play의 setPerformance메서드의 매개변수로 지정해 play의 인스턴스 변수 performaceCost에 저장
		
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(kbd.nextInt());//정수 입력받아서 film의 setBoxOfficeGross메서드의 매개변수로 지정해 film의 인스턴스 변수 boxOfficeGross에 저장
		
		play.display(); //Production의 display메서드 오버라이딩한 Play클래스의 display메서드 구현
		System.out.println();//한줄건너뛰기
		film.display();//Production의 display메서드 오버라이딩한 Film클래스의 display메서드 구현
		
		
		

	}

}
