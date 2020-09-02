public class FireEngine extends Car{ //Car클래스를 상속받은 클래스
	FireEngine(){ //조상클래스를 호출한 생성자 만듬
		super("Fire",119,"FireEngine","FireFighter"); //조상클래스에서 인수가 4개인 생성자뿐이므로 4개의 인수를 대입해야함
	}
	public String toString() { //Object클래스에 있는 toString()메서드 오버라이딩한 메서드
		return getStr(); //Car클래스 메서드 호출.
	}
}
