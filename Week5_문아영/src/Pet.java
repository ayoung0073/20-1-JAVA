
public class Pet { //�θ�Ŭ���� Pet
	private String name;
	private int age;
	private double weight;
	
	public Pet() {} //�Ű������� ���� ����Ʈ ������ ����
	public Pet(String name,int age, double weight) {//�Ű����� name, age, weight�� �޴� �����ڸ� �����.
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public void setPet(String name,int age, double weight) { //�ν��Ͻ� ������ �Ű��������� �����ϴ� �޼��带 �����Ѵ�.
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	public void setName(String name) {//�ν��Ͻ����� name�� private���� �����Ͽ��⶧���� �ٸ� Ŭ�������� name�� ������ �� �ֵ��� public�޼��带 �����Ѵ�.
		this.name=name;
	}
	public void setAge(int age) {//�ν��Ͻ����� age�� private���� �����Ͽ��⶧���� �ٸ� Ŭ�������� age�� ������ �� �ֵ��� public�޼��带 �����Ѵ�.
		this.age=age;
	}
	public void setWeight(double weight) {//�ν��Ͻ����� weight�� private���� �����ؼ� �ٸ� Ŭ�������� weight�� ������ �� �ֵ��� public�޼��� ����
		this.weight=weight;
	}
	public String getName() {//�ٸ� Ŭ�������� name�� ������ �� �ֵ��� public �޼��带 �����Ѵ�.
		return name;
	}
	public int getAge() { //�ܺ� Ŭ�������� age�� ������ �� �ֵ��� public �޼��带 ����
		return age;
	}
	public double getWeight() { //�ܺ� Ŭ�������� weight�� ������ �� �ֵ��� public�޼��� ����
		return weight;
	}
	
	public void writeOutput() { //Pet�� ���� name,age,weight�� ����ϴ� �޼��� ����..�ٸ� �ڽ�Ŭ�������� �������̵��� �޼���
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	public void move() { //�ڽ� Ŭ�������� �������̵��� �޼��� ����.������ ǥ��
		System.out.println(name+" moves");
	}

}
