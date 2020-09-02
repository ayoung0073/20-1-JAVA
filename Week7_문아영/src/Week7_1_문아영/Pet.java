package Week7_1_문아영;

public abstract class Pet { //조상클래스 Pet. 추상메서드를 포함하고 있기 때문에 abstract class.
	public String species; //종
	public String name; //이름
	public int age; //나이
	
	public abstract void move(); //추상메서드 move. 자식 클래스에서 구현할 것임
}
