
public class Dog extends Pet {//Pet의 자식 클래스 Dog
	private boolean boosterShot; //Dog클래스에만 있는 boolean형 인스턴스 변수를 private으로 선언
	
	public Dog(){}; //Dog클래스 디폴트 생성자 만듬
	public Dog(String name,int age, double weight, boolean boosterShot) { //매개변수 name,age,weight,boosterShot가 있는 생성자 만듬
		super(name,age,weight); //부모클래스인 Pet클래스의 생성자(디폴트 생성자가 아닌 매개변수 3개있는) 호출
		this.boosterShot=boosterShot; //자식클래스에서 추가로 만든 인스턴스 변수를 생성함
	}
	public boolean getBoosterShot() { //부모클래스에는 없는 인스턴스변수boosterShot을 private으로 선언하였기 때문에 외부클래스에서 참조할 수 있도록 public 메서드 구현
		return boosterShot;
	}
	public void setBoosterShot(boolean boosterShot) {//외부클래스에서 boosterShot 지정할 수 있도록 public메서드 구현
		this.boosterShot=boosterShot;
	}
	
	public void writeOutput() { //부모클래스에 있는 writeOutput메서드 오버라이딩함
		//System.out.println("Name: "+getName()); //부모클래스의 getName메서드를 상속받았기 때문에 자식클래스에서 사용.
		//System.out.println("Age: "+getAge());//부모클래스의 getAge메서드를 상속받았기 때문에 자식클래스에서 사용
		//System.out.println("Weight: "+getWeight());//부모클래스의 getWeight메서드를 상속받았기 때문에 자식클래스에서 사용
		super.writeOutput();
		if(boosterShot==true) System.out.println("BoosterShot: O"); // boosterShot이 true(예방접종 O)일 때
		else if(boosterShot==false) System.out.println("BoosterShot: X"); //boosterShot이 false(예방접종 X)일 때
	}
	public void move() { //부모클래스에 있는 move메서드 오버라이딩
		System.out.println(getName()+" walks and runs"); //부모클래스에서는 name이라해도되지만 부모클래스에서 name은 private으로 선언하여서 직접적으로 참조할 수 없기 때문에 getName메서드를 활용해서 name을 가져온다.
	}
}
