package Week7_2_���ƿ�;

public class Square implements Geometry{//�������̽�Geometry�� ������ SquareŬ����(area,perimeter�޼��� ��� �����ؾ���.)
	public double length; //double�� length(����) �ν��Ͻ� ���� ����
	
	Square(){}; //����Ʈ ������
	public Square(double length) { //double�� �μ��� �ִ� ������
		this.length=length; //�μ��� �ν��Ͻ� ������ ����.
	}
	
	public double area() { //�簢�� ���� : ����*����
		return length*length;
	}
	public double perimeter() { //���� : ����*4
		return 4*length;
	}
}
