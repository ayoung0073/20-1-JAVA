
public class Cat extends Pet {//Pet�� �ڽ�Ŭ���� Cat
	private String color;//CatŬ���������� �ִ� �ν��Ͻ� ���� color�� private���� ����
		
		public Cat(){}; //�Ű����� ���� ����Ʈ ������ ����
		public Cat(String name,int age, double weight, String color) { //�Ű����� name,age,weight,color�� �ִ� ������ ����
			super(name,age,weight);//�θ�Ŭ���� ������(����Ʈ������ ����) ȣ��
			this.color=color;//CatŬ�������� �ִ� �ν��Ͻ����� ����
		}
		public String getColor() {//�θ�Ŭ������ ���� color�� private���� �����߱� ������ �ܺ�Ŭ�������� ������ �� �ֵ��� public���� �޼��� ����
			return color;
		}
		public void setColor(String color) { //�ܺ�Ŭ�������� color������ �� �ֵ��� public���� �޼��� ����
			this.color=color;
		}
		
		public void writeOutput() { //�θ�Ŭ������ writeOutput�޼��� �������̵�
			System.out.println("Name: "+getName());//�θ�Ŭ������ getName�޼��带 ��ӹ޾ұ� ������ �ڽ�Ŭ�������� ���.
			System.out.println("Age: "+getAge());//�θ�Ŭ������ getName�޼��带 ��ӹ޾ұ� ������ �ڽ�Ŭ�������� ���.
			System.out.println("Weight: "+getWeight());//�θ�Ŭ������ getName�޼��带 ��ӹ޾ұ� ������ �ڽ�Ŭ�������� ���.
			System.out.println("Color: "+getColor()); //�ڽ�Ŭ�������� ������ getColor�޼��� ȣ��
		}
		public void move() {//�θ�Ŭ������ move�޼��� �������̵�
			System.out.println(getName()+" creeps and jumps");
		}
}
