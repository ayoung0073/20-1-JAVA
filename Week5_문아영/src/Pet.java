
public class Pet { //부모클래스 Pet
	private String name;
	private int age;
	private double weight;
	
	public Pet() {} //매개변수가 없는 디폴트 생성자 만듬
	public Pet(String name,int age, double weight) {//매개변수 name, age, weight를 받는 생성자를 만든다.
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void setPet(String name,int age, double weight) { //인스턴스 변수에 매개변수들을 저장하는 메서드를 구현한다.
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	public void setName(String name) {//인스턴스변수 name을 private으로 선언하였기때문에 다른 클래스에서 name을 지정할 수 있도록 public메서드를 구현한다.
		this.name=name;
	}
	public void setAge(int age) {//인스턴스변수 age을 private으로 선언하였기때문에 다른 클래스에서 age을 지정할 수 있도록 public메서드를 구현한다.
		this.age=age;
	}
	public void setWeight(double weight) {//인스턴스변수 weight를 private으로 선언해서 다른 클래스에서 weight를 지정할 수 있도록 public메서드 구현
		this.weight=weight;
	}
	public String getName() {//다른 클래스에서 name을 참조할 수 있도록 public 메서드를 구현한다.
		return name;
	}
	public int getAge() { //외부 클래스에서 age를 참조할 수 있도록 public 메서드를 구현
		return age;
	}
	public double getWeight() { //외부 클래스에서 weight를 참조할 수 있도록 public메서드 구현
		return weight;
	}
	
	public void writeOutput() { //Pet의 정보 name,age,weight를 출력하는 메서드 구현..다른 자식클래스에서 오버라이딩할 메서드
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	public void move() { //자식 클래스에서 오버라이딩할 메서드 구현.움직임 표현
		System.out.println(name+" moves");
	}

}
