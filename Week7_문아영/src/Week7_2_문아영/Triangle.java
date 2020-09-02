package Week7_2_문아영;

public class Triangle implements Geometry{//인터페이스Geometry를 구현한 Triangle클래스(area,perimeter메서드 모두 구현해야함.)
	double a, b, c; //삼각형 세 변(a,b,c) 인스턴스변수 선언
	
	Triangle() {}; //디폴트 생성자
	public Triangle(double a, double b,double c) { //세 개의 double형 인수가 있는 생성자
		this.a=a; //각 인수를 인스턴스 변수에 저장
		this.b=b;
		this.c=c;
	}
	
	public double area() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double perimeter() { //세변의 길이 합
		return a+b+c;
	}
}
