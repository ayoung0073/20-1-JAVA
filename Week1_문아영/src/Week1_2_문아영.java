import java.util.Scanner;
public class Week1_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int n1,n2,n3;
		float avg;
		
		Scanner keyboard=new Scanner(System.in); //Scanner 객체를 생성한다.
		
		System.out.println("정수 세 개 입력");
		n1=keyboard.nextInt(); //nextInt 메소드로 입력 받고 n1이라는 이름의 변수에 대입한다. n2,n3도 같은 방식으로 한다.
		n2=keyboard.nextInt();
		n3=keyboard.nextInt();
		avg=(float)(n1+n2+n3)/3; //n1+n2+n3는 정수이기 때문에 (float)(n1+n2+n3)을 써서 float형으로 형변환을 한다. 그리고 3을 나누어 평균을 낸다.(세 개의 평균)
		
		System.out.printf("평균: %.2f",avg);//문제에서 소수점 이하 둘째자리까지 출력하라하였으므로 System.out.printf와 %.2f를 이용해서 작성했다.
	}

}
