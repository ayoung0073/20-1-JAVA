package HW1_4_문아영;
import java.util.Scanner;
public class HW1_4_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		int num; //입력받을 학생 수 num선언
		int koreanSum=0;  //전체 학생의 국어 점수 합
		int mathSum=0;//전체 학생의 수학 점수 합
		int englishSum=0; //전체 학생의 영어 점수 합
		double koreanAvg,mathAvg,englishAvg; //각 과목의 평균
		
		
		System.out.println("How many students are there?");
		num=kbd.nextInt(); //학생 수 입력받기
		kbd.nextLine(); //엔터키 가져오기
		System.out.println("Input the information.");
		System.out.println(); //한줄띄우기
		StudentScore student[]=new StudentScore[num]; //크기가 num인 StudentScore형 배열 선언 
		
		for(int i=0;i<num;i++) { //num번 for문 반복
			student[i]=new StudentScore(); //student배열 i번째 객체 생성
			
			System.out.print("ID:");
			student[i].setId(kbd.nextLine()); //조상클래스 StudentInformation의 setId메서드 호출
			System.out.print("Name:");
			student[i].setName(kbd.nextLine());//조상클래스  StudentInformation의 setName메서드 호출
			System.out.print("Korean:");
			student[i].setKorean(kbd.nextInt()); //자손클래스 StudentScore의 setKorean메서드 호출
			System.out.print("Math:");
			student[i].setMath(kbd.nextInt()); //위와같이 아래 반복
			System.out.print("English:");
			student[i].setEnglish(kbd.nextInt());
			kbd.nextLine(); //엔터키 가져오기
			
			System.out.println(); //한줄건너뛰기
		}
		System.out.println("Name\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG"); //머리글 출력
		
		for(int i=0;i<num;i++) {  //num번 for문 반복
			student[i].display(); //오버라이딩된 display메서드 호출
			
			koreanSum+=student[i].getKorean(); //i번째 학생의 국어점수 koreanSum에 더하기
			mathSum+=student[i].getMath(); //위와 같이 아래 반복
			englishSum+=student[i].getEnglish();
		}
		koreanAvg=koreanSum/3.0; //for문에서 더해서 나온 총점수에 3을 나눠서 각 과목의 평균 구하기
		mathAvg=mathSum/3.0; //위와 같이 아래 반복
		englishAvg=englishSum/3.0;
		
		System.out.print("Subject Avg\t\t");
		System.out.printf("%.2f\t%.2f\t%.2f",koreanAvg,mathAvg,englishAvg); //소수점 2자리수까지 나타내기 위해 printf씀
		System.out.println();
		System.out.println();
		
		System.out.println("<Students over the average>"); //총평균을 넘은 학생 출력
		System.out.println();
		
		System.out.println("Korean:");
		for(int i=0;i<num;i++) { 
			if(koreanAvg<student[i].getKorean()) System.out.print(student[i].getName()+"\t"); //국어점수평균보다 높은 학생 이름 나열(조상클래스의 getName메서드 호출)
		}
		System.out.println(); //한줄 건너뛰기
		
		System.out.println("Math:"); //위와 같이 아래 반복
		for(int i=0;i<num;i++) {
			if(mathAvg<student[i].getMath()) System.out.print(student[i].getName()+"\t");
		}
		System.out.println();
		
		System.out.println("English:");
		for(int i=0;i<num;i++) {
			if(englishAvg<student[i].getEnglish()) System.out.print(student[i].getName()+"\t");
		}
		System.out.println();
	}

}
