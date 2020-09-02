package Week9_2_문아영;
import java.io.Serializable;

public class Pet implements Serializable { //인터페이스 Serializable를 구현한 Pet클래스
	private String name; //이름 private으로 선언
	private int age; //나이 private으로 선언
	private double weight; //몸무게 private으로 선언
	
	public Pet(String name,int age, double weight) //3개의 매개변수(name, age, weight)를 받는 Pet생성자 만듬
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void setPet(String newName, int newAge, double newWeight)//인스턴스 변수에 매개변수(3개)들을 저장하는 메서드를 구현
	{
		this.name=newName;
		this.age=newAge;
		this.weight=newWeight;
	}
	public void setName(String newName) //private으로 선언한 인스턴수변수 name를 다른 클래스에서 지정할 수 있게 하는 메서드 구현
	{
		this.name=newName;
	}
	public void setWeight(int newAge)//private으로 선언한 인스턴수변수 weight를 다른 클래스에서 지정할 수 있게 하는 메서드 구현
	{
		this.age=newAge;
	}
	public String getName()//다른 클래스에서 name을 참조할 수 있도록 public 메서드를 구현
	{
		return name;
	}
	public int getAge()//다른 클래스에서 age를 참조할 수 있도록 public 메서드를 구현
	{
		return age;
	}
	public double getWeight()//다른 클래스에서 weight을 참조할 수 있도록 public 메서드를 구현
	{
		return weight;
	}
	
}
