package Week9_2_문아영;
import java.io.Serializable;

public class Dog extends Pet implements Serializable{ //인터페이스 Serializable를 구현하고 Pet클래스를 상속받은 자손클래스
	private String breed; //종 private으로 선언
	private boolean boosterShot; //예방접종 유뮤 private으로 선언
	
	public Dog(String name,int age, double weight,String breed, boolean boosterShot) //5개의 인수를 받는 생성자
	{
		super(name,age,weight); //조상의 생성자 호출
		this.breed=breed; 
		this.boosterShot=boosterShot;
	}
	
	public void setBreed(String breed) //인스턴스 변수를 다른 클래스에서 지정할 수 있도록 public 메서드 구현
	{
		this.breed=breed;
	}
	public void setBoosterShot(boolean boosterShot) //위와 같음
	{
		this.boosterShot=boosterShot;
	}
	public String getBreed() //외부 클래스에서 참조할 수 있도록 public 메서드 구현
	{
		return breed;
	}
	public boolean getBoosterShot() //위와 같음
	{
		return boosterShot;
	}
	public String toString() //Object의 메서드 오버라이딩
	{
		char oOrX;
		if(boosterShot==true) oOrX='O';  //예방접종 했으면 oOrX='O'
		else oOrX='X'; //안했으면 oOrX='X'
		return getName()+"\t\t"+getAge()+"\t\t"+getWeight()+"\t\t"+getBreed()+"\t\t"+oOrX; 
	}
}
