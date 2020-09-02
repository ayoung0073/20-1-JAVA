import java.util.Scanner;
public class Week4_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
	
		int num1; //첫번째 입력 받을 원소 변수 선언
		int num2;//두번째 입력 받을 원소 변수 선언
		
		System.out.print("첫번째 원소 입력:");
		num1=kbd.nextInt(); //첫번째 원소 입력받기
		System.out.print("두번째 원소 입력:");
		num2=kbd.nextInt(); //두번째 원소 입력받기
		System.out.print("Factorial("+num1+") - Factorial("+num2+") = ");
		System.out.println(Facto.factoVal(num1)-Facto.factoVal(num2)); //factoVal메서드는 static메서드이기 때문에 인스턴스를 생성하지 않고 클래스명으로 메서드를  호출할 수 있다.
		
	}

}
