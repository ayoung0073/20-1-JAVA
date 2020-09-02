import java.util.Scanner;
public class Week1_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int base;
		int height;
		float area;
		
		Scanner user=new Scanner(System.in); //Scanner 객체 생성한다. (user: 참조형변수)
		
		System.out.print("Input base:");//println이 아닌 print를 쓰면 다음 줄로 넘어가지 않는다.
		base=user.nextInt(); //nextInt 메소드로 입력 받고 base라는 이름의 변수에 대입한다.(밑변)
		System.out.print("Input height:");
		height=user.nextInt();// 또 다시 nextInt메소드로 입력 받고 height라는 이름의 변수에 대입한다.(높이)
		area=(float)(base*height)/2; //정수인 밑변과 높이를 곱하면 정수이므로 float형으로 형변환을 하고나서 2를 나누어야 제대로 된 소수점 이하 계산을 할 수 있다.(삼각형 넓이)
		System.out.println("The area:"+area);

	}

}
