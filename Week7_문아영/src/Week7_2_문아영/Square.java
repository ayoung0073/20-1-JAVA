package Week7_2_문아영;

public class Square implements Geometry{//인터페이스Geometry를 구현한 Square클래스(area,perimeter메서드 모두 구현해야함.)
	public double length; //double형 length(길이) 인스턴스 변수 선언
	
	Square(){}; //디폴트 생성자
	public Square(double length) { //double형 인수가 있는 생성자
		this.length=length; //인수를 인스턴스 변수에 저장.
	}
	
	public double area() { //사각형 넓이 : 길이*길이
		return length*length;
	}
	public double perimeter() { //지름 : 길이*4
		return 4*length;
	}
}
