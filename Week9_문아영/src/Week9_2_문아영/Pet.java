package Week9_2_���ƿ�;
import java.io.Serializable;

public class Pet implements Serializable { //�������̽� Serializable�� ������ PetŬ����
	private String name; //�̸� private���� ����
	private int age; //���� private���� ����
	private double weight; //������ private���� ����
	
	public Pet(String name,int age, double weight) //3���� �Ű�����(name, age, weight)�� �޴� Pet������ ����
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void setPet(String newName, int newAge, double newWeight)//�ν��Ͻ� ������ �Ű�����(3��)���� �����ϴ� �޼��带 ����
	{
		this.name=newName;
		this.age=newAge;
		this.weight=newWeight;
	}
	public void setName(String newName) //private���� ������ �ν��ϼ����� name�� �ٸ� Ŭ�������� ������ �� �ְ� �ϴ� �޼��� ����
	{
		this.name=newName;
	}
	public void setWeight(int newAge)//private���� ������ �ν��ϼ����� weight�� �ٸ� Ŭ�������� ������ �� �ְ� �ϴ� �޼��� ����
	{
		this.age=newAge;
	}
	public String getName()//�ٸ� Ŭ�������� name�� ������ �� �ֵ��� public �޼��带 ����
	{
		return name;
	}
	public int getAge()//�ٸ� Ŭ�������� age�� ������ �� �ֵ��� public �޼��带 ����
	{
		return age;
	}
	public double getWeight()//�ٸ� Ŭ�������� weight�� ������ �� �ֵ��� public �޼��带 ����
	{
		return weight;
	}
	
}
