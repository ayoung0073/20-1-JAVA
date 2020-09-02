package Week13_1_문아영;

import java.util.Scanner;

class SharedArea //SharedArea클래스 생성(두 Thread간 데이터 교환을 위한 공동구역)
{
	double ratio; 
	boolean isReady;
}

public class Week13_1_문아영 {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int n;  //입력받을 횟수
		Scanner kbd=new Scanner(System.in); //스캐너 객체 생성
		SharedArea SA=new SharedArea(); //SharedArea 공동구역 생성(참조변수 : SA)
		SimulThread st; //SimulThread클래스 참조변수 선언
		PrintThread pt; //PrintThread 클래스 참조변수 선언
		
		System.out.println("Input the number of coin toss:");
		n=kbd.nextInt(); //입력받은 정수 n에 저장
		
		st=new SimulThread(n); //n을 인자로 갖는 SimulThread 인스턴스 생성
		pt=new PrintThread(); //PrintThread 인스턴스 생성
		
		
		st.sharedArea=SA; //st, pt에 공동구역(SA) 공유.
		pt.sharedArea=SA;
		
		st.start(); //SimulThread(참조변수:st) 시작시키기
		pt.start(); //PrintThread(참조변수:pt) 시작시키기
	}

}
