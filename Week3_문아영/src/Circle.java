
public class Circle {
	final double PI=3.14159; //PI��� ��� double������ ����
	private double radius; // radius��� double�� ���� private���� ����
	
	public void setRadius(double radius) { //double�� radius�� �μ��� ������ (setRadius��� �޼��� ����)
		this.radius=radius; //�� ��ü�� radius�� �����Ѵ�.
	}
	public double getRadius() { //getRadius��� �޼��� ����. ��ü�� radius(double��)�� ��ȯ�Ѵ�.
		return radius;
	}
	public double perimeter() { //���ѷ� ����
		return PI*2*radius;
	}
	public double area() { //������ ����
		return PI*radius*radius;
	}
	public void circleInfo() { //�� Ŭ������ �޼����� perimeter()�� area()�� ȣ���Ѵ�.
		System.out.printf("���ѷ�:%.2f",perimeter()); //�ܼ� ���ÿ��� �Ҽ������� ��°�ڸ����� ǥ���� -> printf�� �ؼ� %.2f��� ��
		System.out.println(); //�ٳѱ�
		System.out.printf("������:%.2f"	+ "",area()); //�ܼ� ���ÿ��� �Ҽ������� ��°�ڸ����� ǥ����
	}
}
