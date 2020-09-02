
public class Cat extends Pet {//Pet의 자식클래스 Cat
	private String color;//Cat클래스형에만 있는 인스턴스 변수 color을 private으로 선언
		
		public Cat(){}; //매개변수 없는 디폴트 생성자 만듬
		public Cat(String name,int age, double weight, String color) { //매개변수 name,age,weight,color가 있는 생성자 만듬
			super(name,age,weight);//부모클래스 생성자(디폴트생성자 말고) 호출
			this.color=color;//Cat클래스에만 있는 인스턴스변수 지정
		}
		public String getColor() {//부모클래스에 없는 color를 private으로 선언했기 때문에 외부클래스에서 참조할 수 있도록 public으로 메서드 구현
			return color;
		}
		public void setColor(String color) { //외부클래스에서 color지정할 수 있도록 public으로 메서드 구현
			this.color=color;
		}
		
		public void writeOutput() { //부모클래스의 writeOutput메서드 오버라이딩
			System.out.println("Name: "+getName());//부모클래스의 getName메서드를 상속받았기 때문에 자식클래스에서 사용.
			System.out.println("Age: "+getAge());//부모클래스의 getName메서드를 상속받았기 때문에 자식클래스에서 사용.
			System.out.println("Weight: "+getWeight());//부모클래스의 getName메서드를 상속받았기 때문에 자식클래스에서 사용.
			System.out.println("Color: "+getColor()); //자식클래스에서 구현한 getColor메서드 호출
		}
		public void move() {//부모클래스의 move메서드 오버라이딩
			System.out.println(getName()+" creeps and jumps");
		}
}
