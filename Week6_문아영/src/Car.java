
public class Car { //���� Ŭ���� Car
	private String emgType; //�ν��Ͻ� ���� ����. 
	private int number; //private���� �����ؼ� �ٸ� Ŭ�������� ���� ���� �Ұ���.
	private String carType; 
	private String reqPerson; 
	
	Car(String emgType,int number,String carType,String reqPerson){ //�μ��� 4���� ������ ����. ����Ʈ������ x
		this.emgType=emgType; //�μ��� ��ü�� �ν��Ͻ� ������ ����
		this.number=number; //���� ���� �ݺ�
		this.carType=carType;
		this.reqPerson=reqPerson;
	}
	
	public void setEmgType(String emgType) { //�ν��Ͻ����� emgType�� private���� �����߱� ������ �ܺ� Ŭ�������� ����(����)�� �� �ִ� �޼��� ����
		this.emgType=emgType;
	}
	public void setNumber(int number) { //�Ʒ��� ���� ���� �ݺ�
		this.number=number;
	}
	public void setCarType(String carType) {
		this.carType=carType;
	}
	public void setReqPerson(String reqPerson) {
		this.reqPerson=reqPerson;
	}
	
	public String getEmgType() { //private���� ������ �ν��Ͻ����� emgType�� �ܺ� Ŭ�������� ������ �� �ְ� �ϴ� �޼��� ����
		return emgType;
	}
	public int getNumber() { //�Ʒ��� ���� ���� �ݺ�
		return number;
	}
	public String getCarType() {
		return carType;
	}
	public String getReqPerson() {
		return reqPerson;
	}
	public String getStr() { //getter�Լ��� �̿��ؼ� emgType, number, carType, reqPerson �Ѳ����� �� �ٷ� ����ϴ� �޼��� (\t�� ���ĸ����� ���� ��) 
		return getEmgType()+"\t\t"+getNumber()+"\t\t"+getCarType()+"\t"+getReqPerson();
	}
}
