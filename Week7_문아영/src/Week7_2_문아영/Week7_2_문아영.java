package Week7_2_���ƿ�;
import java.util.Scanner;
public class Week7_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		double a,b,c; //�Է¹��� �ﰢ�� ������ ������ ����
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		Circle circle; //Circle�� ��������circle ����(�ν��Ͻ��� �Է¹��� �� ����)(�μ��� �ִ� ������ �̿��ϱ� ����)
		Square square; //Square�� ��������square ����(�ν��Ͻ��� �Է¹��� �� ����)
		Triangle triangle; //Triangle�� �������� triangle ����(�ν��Ͻ��� �Է¹��� �Ŀ� ����)
		
		System.out.println("Input radius for a circle");
		circle=new Circle(kbd.nextDouble()); //�Է¹��� ���� Circle�� ������ �μ��� �����ؼ� �ν��Ͻ� ����
		
		System.out.println("Input length for a square");
		square= new Square(kbd.nextDouble());//�Է¹��� ���� Square�� ������ �μ��� �����ؼ� �ν��Ͻ� ����
		
		System.out.println("Input a for a triangle");
		a=kbd.nextDouble();//�Է¹����� �������� a�� �ϴ� ����
		System.out.println("Input b for a triangle");
		b=kbd.nextDouble(); //���� ���� �Ʒ� �ݺ�
		System.out.println("Input c for a triangle");
		c=kbd.nextDouble();
		
		triangle=new Triangle(a,b,c); //������ ���̰� ����� a,b,c�� Triangle �����ڸ� �̿��� �ν��Ͻ� ����
		
		System.out.println("<Circle>\nArea: "+circle.area()); //�������̽��� ������ CircleŬ������ area�޼��� ȣ��
		System.out.println("Circumference: "+circle.perimeter());//�������̽��� ������ CircleŬ������ perimeter�޼��� ȣ��

		System.out.println("<Square>\nArea: "+square.area()); //���� ���� �Ʒ� �ݺ�
		System.out.println("Circumference: "+square.perimeter());

		System.out.println("<Triangle>\nArea: "+triangle.area());
		System.out.println("Circumference: "+triangle.perimeter());
	}

}
