package HW1_1_문아영;
import java.util.Scanner;
public class HW1_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		Time time=new Time(); //Time객체 생성(참조변수 time)
		
		int hour,minute; //입력받을 변수 선언
		
		System.out.println("Hour:");
		hour=kbd.nextInt(); //hour입력받기
		System.out.println("Minute:");
		minute=kbd.nextInt(); //minute입력받기
		
		time.setTime(hour, minute); //Time클래스의 setTime메서드 호출해서 time에 인스턴스 변수 저장
		System.out.println(time.getTime('H')+":"+time.getTime('m'));
		//Time클래스의 getTime메서드를 호출해서 hour와 minute 출력

	}

}
