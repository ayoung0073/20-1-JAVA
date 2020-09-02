
public class Car { //조상 클래스 Car
	private String emgType; //인스턴스 변수 선언. 
	private int number; //private으로 선언해서 다른 클래스에서 직접 참조 불가능.
	private String carType; 
	private String reqPerson; 
	
	Car(String emgType,int number,String carType,String reqPerson){ //인수가 4개인 생성자 만듬. 디폴트생성자 x
		this.emgType=emgType; //인수를 객체의 인스턴스 변수에 저장
		this.number=number; //같은 내용 반복
		this.carType=carType;
		this.reqPerson=reqPerson;
	}
	
	public void setEmgType(String emgType) { //인스턴스변수 emgType은 private으로 선언했기 때문에 외부 클래스에서 접근(지정)할 수 있는 메서드 구현
		this.emgType=emgType;
	}
	public void setNumber(int number) { //아래는 같은 내용 반복
		this.number=number;
	}
	public void setCarType(String carType) {
		this.carType=carType;
	}
	public void setReqPerson(String reqPerson) {
		this.reqPerson=reqPerson;
	}
	
	public String getEmgType() { //private으로 선언한 인스턴스변수 emgType을 외부 클래스에서 참조할 수 있게 하는 메서드 구현
		return emgType;
	}
	public int getNumber() { //아래는 같은 내용 반복
		return number;
	}
	public String getCarType() {
		return carType;
	}
	public String getReqPerson() {
		return reqPerson;
	}
	public String getStr() { //getter함수를 이용해서 emgType, number, carType, reqPerson 한꺼번에 한 줄로 출력하는 메서드 (\t은 정렬맞춤을 위해 씀) 
		return getEmgType()+"\t\t"+getNumber()+"\t\t"+getCarType()+"\t"+getReqPerson();
	}
}
