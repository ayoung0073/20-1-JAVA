package Week7_2_���ƿ�;

public class Circle implements Geometry { //�������̽�Geometry�� ������ CircleŬ����(area,perimeter�޼��� ��� �����ؾ���.)
	public double radius; //double�� radius(������) ����
	
	Circle(){}; //����Ʈ ������
	public Circle(double radius){ //�μ��� �ִ� ������
		this.radius=radius; //�μ��� �ν��Ͻ� ������ ����
	}
	
	public double area() { //���� ���� : ������*������*PI
		return radius*radius*PI;
	}
	public double perimeter() { //���� ���� : 2*������*PI
		return 2*PI*radius; 
	}
}
