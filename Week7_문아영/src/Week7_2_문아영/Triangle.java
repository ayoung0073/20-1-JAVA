package Week7_2_���ƿ�;

public class Triangle implements Geometry{//�������̽�Geometry�� ������ TriangleŬ����(area,perimeter�޼��� ��� �����ؾ���.)
	double a, b, c; //�ﰢ�� �� ��(a,b,c) �ν��Ͻ����� ����
	
	Triangle() {}; //����Ʈ ������
	public Triangle(double a, double b,double c) { //�� ���� double�� �μ��� �ִ� ������
		this.a=a; //�� �μ��� �ν��Ͻ� ������ ����
		this.b=b;
		this.c=c;
	}
	
	public double area() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double perimeter() { //������ ���� ��
		return a+b+c;
	}
}
