
public class Dog extends Pet {//Pet�� �ڽ� Ŭ���� Dog
	private boolean boosterShot; //DogŬ�������� �ִ� boolean�� �ν��Ͻ� ������ private���� ����
	
	public Dog(){}; //DogŬ���� ����Ʈ ������ ����
	public Dog(String name,int age, double weight, boolean boosterShot) { //�Ű����� name,age,weight,boosterShot�� �ִ� ������ ����
		super(name,age,weight); //�θ�Ŭ������ PetŬ������ ������(����Ʈ �����ڰ� �ƴ� �Ű����� 3���ִ�) ȣ��
		this.boosterShot=boosterShot; //�ڽ�Ŭ�������� �߰��� ���� �ν��Ͻ� ������ ������
	}
	public boolean getBoosterShot() { //�θ�Ŭ�������� ���� �ν��Ͻ�����boosterShot�� private���� �����Ͽ��� ������ �ܺ�Ŭ�������� ������ �� �ֵ��� public �޼��� ����
		return boosterShot;
	}
	public void setBoosterShot(boolean boosterShot) {//�ܺ�Ŭ�������� boosterShot ������ �� �ֵ��� public�޼��� ����
		this.boosterShot=boosterShot;
	}
	
	public void writeOutput() { //�θ�Ŭ������ �ִ� writeOutput�޼��� �������̵���
		//System.out.println("Name: "+getName()); //�θ�Ŭ������ getName�޼��带 ��ӹ޾ұ� ������ �ڽ�Ŭ�������� ���.
		//System.out.println("Age: "+getAge());//�θ�Ŭ������ getAge�޼��带 ��ӹ޾ұ� ������ �ڽ�Ŭ�������� ���
		//System.out.println("Weight: "+getWeight());//�θ�Ŭ������ getWeight�޼��带 ��ӹ޾ұ� ������ �ڽ�Ŭ�������� ���
		super.writeOutput();
		if(boosterShot==true) System.out.println("BoosterShot: O"); // boosterShot�� true(�������� O)�� ��
		else if(boosterShot==false) System.out.println("BoosterShot: X"); //boosterShot�� false(�������� X)�� ��
	}
	public void move() { //�θ�Ŭ������ �ִ� move�޼��� �������̵�
		System.out.println(getName()+" walks and runs"); //�θ�Ŭ���������� name�̶��ص������� �θ�Ŭ�������� name�� private���� �����Ͽ��� ���������� ������ �� ���� ������ getName�޼��带 Ȱ���ؼ� name�� �����´�.
	}
}
