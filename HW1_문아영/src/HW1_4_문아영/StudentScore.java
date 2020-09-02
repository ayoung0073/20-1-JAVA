package HW1_4_문아영;

public class StudentScore extends StudentInformation {//StudentInformation클래스 상속받은 자손클래스
	private int korean; //국어점수
	private int math; //수학점수
	private int english; //영어점수
	
	public void setKorean(int korean) { //인스턴수변수 korean 지정하는 메서드 (외부클래스에서 지정 가능)
		this.korean=korean;
	}
	public void setMath(int math) {//인스턴수변수 math 지정하는 메서드 (외부클래스에서 지정 가능)
		this.math=math;
	}
	public void setEnglish(int english) {//인스턴수변수 english 지정하는 메서드 (외부클래스에서 지정 가능)
		this.english=english;
	}
	
	public int getKorean() { //인스턴스 변수 korean 반환하는 메서드 (외부클래스에서 참조 가능)
		return korean;
	}
	public int getMath() { //인스턴스 변수 math 반환하는 메서드 (외부클래스에서 참조 가능)
		return math;
	}
	public int getEnglish() {//인스턴스 변수 english 반환하는 메서드 (외부클래스에서 참조 가능)
		return english;
	}
	public void display() { //display 메서드 오버라이딩함
		super.display(); //조상 메서드 호출
		System.out.print(korean+"\t"+math+"\t"+english+"\t");  //한줄로 출력해야되기때문에 print를 붙인다.
		
		int sum=korean+math+english; //국어,영어,수학 점수합
		double avg=sum/3.0; //double형이기 때문에 3이 아닌 3.0으로 나눈다.
		
		System.out.print(sum+"\t");
		System.out.printf("%.2f",avg); //소수점아래 둘째자리까지 나타내기위해 printf씀
		System.out.println(); //한줄 띄우기
	}
}
