
public class Circle {
	final double PI=3.14159; //PI라는 상수 double형으로 선언
	private double radius; // radius라는 double형 변수 private으로 선언
	
	public void setRadius(double radius) { //double형 radius를 인수로 받으면 (setRadius라는 메서드 선언)
		this.radius=radius; //이 객체의 radius에 저장한다.
	}
	public double getRadius() { //getRadius라는 메서드 선언. 객체의 radius(double형)을 반환한다.
		return radius;
	}
	public double perimeter() { //원둘레 설정
		return PI*2*radius;
	}
	public double area() { //원넓이 설정
		return PI*radius*radius;
	}
	public void circleInfo() { //이 클래스의 메서드인 perimeter()와 area()를 호출한다.
		System.out.printf("원둘레:%.2f",perimeter()); //콘솔 예시에서 소수점이하 둘째자리까지 표시함 -> printf를 해서 %.2f라고 씀
		System.out.println(); //줄넘김
		System.out.printf("원넓이:%.2f"	+ "",area()); //콘솔 예시에서 소수점이하 둘째자리까지 표시함
	}
}
