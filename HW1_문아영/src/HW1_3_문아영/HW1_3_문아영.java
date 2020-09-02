package HW1_3_문아영;
import java.util.Scanner;
public class HW1_3_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		String yOrN="y"; //String형 yOrN변수 선언, while문 조건에 충족하기위해 "y"대입
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		while(yOrN.equals("y")) { 
			System.out.println("Input a word");
			String str=kbd.next(); //String형 str선언해서 word 입력받음
			char Arr[]=new char[100]; //문자배열 Arr선언. 크기는 100으로 해놓음.
			Arr=str.toCharArray(); //String형인 str을 문자배열로 변환
			
			if(check(Arr)==true) System.out.println("symmetry"); //호출한 check메서드가 true를 반환하면 "symmetry" 출력
			else System.out.println("Asymmetry"); //false반환하면 "Asymmetry" 출력
			
			System.out.println(); //한줄 띄우기
			
			System.out.print("Try again?(y/n)");
			yOrN=kbd.next();//반복할지말지 입력받음
			System.out.println(); //한줄 띄우기
			
			}
		}

	
	public static boolean check(char[] Arr) { //문자배열을 인수로 한 check메서드(boolean형 반환하는 메서드)
		int num=Arr.length/2; //int형 num선언해서 Arr의 길이가 홀수여도 중간 제외한 인덱스값들이 대칭인지 비교
		for(int i=0;i<num;i++) { 
			if(Arr[i]!=Arr[Arr.length-1-i]) return false; //처음배열에서 다음 i번째의 값과 마지막 배열에서 이전 i번째의 값이 다르면 false반환하면서 종료. 하나라도 다르면 비대칭(Asymmetry)
		}
		return true; //for문에서 false를 반환하면서 종료가 안되었으면 true반환.(대칭)

	}
}
