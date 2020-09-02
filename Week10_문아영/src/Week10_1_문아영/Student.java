package Week10_1_문아영;
import java.util.Scanner;

public class Student { 
	public String name;
	public String id;
	public int age;
	
	Scanner kbd=new Scanner(System.in); //Scanner 객체 생성
	
	public Student() {}; //디폴트 생성자
	public Student(String name, String id, int age) //인수가 3개 있는 생성자
	{
		this.name=name;
		this.id=id;
		this.age=age;
	}
}
