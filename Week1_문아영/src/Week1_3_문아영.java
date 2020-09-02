import java.util.Scanner;
public class Week1_3_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int f;
		float c;
		
		Scanner keyboard=new Scanner(System.in); //Scanner 객체를 생성한다.
		
		System.out.print("화씨온도 입력:"); //다음 줄로 넘어가지 않고 입력 받기 위해 println이 아닌 print를 씀
		f=keyboard.nextInt();
		System.out.println(); //한 줄 건너뛰기
		c=(float)5/9*(f-32); //5,9,f,32가 모두 정수이기 때문에 float형으로 변환하기 위해 5를 (float)5로 형변환하면 계산한 결과도 float형이 된다.
		System.out.println("화씨온도:"+f); //+f를 직성하면 앞의 문자열과 연결돼서 문자열로 쓰인다.
		System.out.printf("섭씨온도:%.1f",c);//System.out.printf와 %.1f를 이용해서 소수점 이하 1자리로 표시하게 함.
		
	}

}
