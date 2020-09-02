package Week7_2_문아영;
import java.util.Scanner;
public class Week7_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		double a,b,c; //입력받을 삼각형 세변을 저장할 변수
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		Circle circle; //Circle형 참조변수circle 만듬(인스턴스는 입력받을 때 생성)(인수가 있는 생성자 이용하기 위해)
		Square square; //Square형 참조변수square 만듬(인스턴스는 입력받을 때 생성)
		Triangle triangle; //Triangle형 참조변수 triangle 만듬(인스턴스는 입력받은 후에 생성)
		
		System.out.println("Input radius for a circle");
		circle=new Circle(kbd.nextDouble()); //입력받은 것을 Circle의 생성자 인수에 대입해서 인스턴스 생성
		
		System.out.println("Input length for a square");
		square= new Square(kbd.nextDouble());//입력받은 것을 Square의 생성자 인수에 대입해서 인스턴스 생성
		
		System.out.println("Input a for a triangle");
		a=kbd.nextDouble();//입력받으면 지역변수 a에 일단 저장
		System.out.println("Input b for a triangle");
		b=kbd.nextDouble(); //위와 같이 아래 반복
		System.out.println("Input c for a triangle");
		c=kbd.nextDouble();
		
		triangle=new Triangle(a,b,c); //세변의 길이가 저장된 a,b,c룰 Triangle 생성자를 이용해 인스턴스 생성
		
		System.out.println("<Circle>\nArea: "+circle.area()); //인터페이스를 구현한 Circle클래스의 area메서드 호출
		System.out.println("Circumference: "+circle.perimeter());//인터페이스를 구현한 Circle클래스의 perimeter메서드 호출

		System.out.println("<Square>\nArea: "+square.area()); //위와 같이 아래 반복
		System.out.println("Circumference: "+square.perimeter());

		System.out.println("<Triangle>\nArea: "+triangle.area());
		System.out.println("Circumference: "+triangle.perimeter());
	}

}
