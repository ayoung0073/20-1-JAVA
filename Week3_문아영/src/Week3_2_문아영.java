import java.util.Scanner;
public class Week3_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Circle circle=new Circle(); //Circle형인 circle 객체 생성
		Scanner kbd=new Scanner(System.in); //Scanner 객체 생성
		
		System.out.print("반지름입력:");
		circle.setRadius(kbd.nextDouble()); //radius가 double형이므로 double형으로 입력받는다.
		System.out.println("반지름:"+circle.getRadius()); //반지름 입력받기
		circle.circleInfo(); //원정보 출력(객체 메서드 이용해서)

	}

}
