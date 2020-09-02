public class Tv extends Product { //Product클래스 상속받은 Tv클래스
	Tv(){
		super(100); //조상클래스의 생성자 호출 (생성자는 상속받지 않음), 100은 Tv의 price
	}
	public String toString() { //Object클래스의 toString메서드 오버라이딩
		return "TV"; //객체의 참조변수를 출력하면 "TV"출력됨
	}
}
