package Week10_1_���ƿ�;
import java.util.Scanner;

public class Student { 
	public String name;
	public String id;
	public int age;
	
	Scanner kbd=new Scanner(System.in); //Scanner ��ü ����
	
	public Student() {}; //����Ʈ ������
	public Student(String name, String id, int age) //�μ��� 3�� �ִ� ������
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
}
