package Week9_2_���ƿ�;
import java.io.Serializable;

public class Dog extends Pet implements Serializable{ //�������̽� Serializable�� �����ϰ� PetŬ������ ��ӹ��� �ڼ�Ŭ����
	private String breed; //�� private���� ����
	private boolean boosterShot; //�������� ���� private���� ����
	
	public Dog(String name,int age, double weight,String breed, boolean boosterShot) //5���� �μ��� �޴� ������
	{
		super(name,age,weight); //������ ������ ȣ��
		this.breed=breed; 
		this.boosterShot=boosterShot;
	}
	
	public void setBreed(String breed) //�ν��Ͻ� ������ �ٸ� Ŭ�������� ������ �� �ֵ��� public �޼��� ����
	{
		this.breed=breed;
	}
	public void setBoosterShot(boolean boosterShot) //���� ����
	{
		this.boosterShot=boosterShot;
	}
	public String getBreed() //�ܺ� Ŭ�������� ������ �� �ֵ��� public �޼��� ����
	{
		return breed;
	}
	public boolean getBoosterShot() //���� ����
	{
		return boosterShot;
	}
	public String toString() //Object�� �޼��� �������̵�
	{
		char oOrX;
		if(boosterShot==true) oOrX='O';  //�������� ������ oOrX='O'
		else oOrX='X'; //�������� oOrX='X'
		return getName()+"\t\t"+getAge()+"\t\t"+getWeight()+"\t\t"+getBreed()+"\t\t"+oOrX; 
	}
}
