package Week7_2_문아영;

public class Circle implements Geometry { //인터페이스Geometry를 구현한 Circle클래스(area,perimeter메서드 모두 구현해야함.)
	public double radius; //double형 radius(반지름) 선언
	
	Circle(){}; //디폴트 생성자
	public Circle(double radius){ //인수가 있는 생성자
		this.radius=radius; //인수를 인스턴스 변수에 저장
	}
	
	public double area() { //원의 넓이 : 반지름*반지름*PI
		return radius*radius*PI;
	}
	public double perimeter() { //원의 지름 : 2*반지름*PI
		return 2*PI*radius; 
	}
}
