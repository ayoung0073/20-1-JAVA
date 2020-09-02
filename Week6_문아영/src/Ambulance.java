public class Ambulance extends Car{//Car클래스를 상속받은 클래스
	Ambulance(){ //FireEngine클래스에 있는 설명과 같음
		super("Patient",119,"Ambulance","Doctor");
	}
	public String toString() {
		return getStr();
	}
}
