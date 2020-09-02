public class PoliceCar extends Car{//Car클래스를 상속받은 클래스
	PoliceCar(){ //FireEngine클래스에 있는 설명과 같음
		super("Thief",112,"Policecar","PoliceOfficer");
	}
	public String toString() {
		return getStr();
	}
}
