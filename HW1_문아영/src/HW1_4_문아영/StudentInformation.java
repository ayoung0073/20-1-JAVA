package HW1_4_���ƿ�;

public class StudentInformation { //����Ŭ���� StudentInformation
	private String name; //�ν��Ͻ����� name private���� ����(���x)
	private String id; //�ν��Ͻ����� id private���� ����(���x)
	
	public void setName(String name) { //name�� �ܺ�Ŭ�������� ���������� ������ �� ���� ������ setName�޼��带 �̿��ؼ� �ܺ�Ŭ�������� name������ �� �ְ� ��
		this.name=name;
	}
	public void setId(String id) {//id�� �ܺ�Ŭ�������� ���������� ������ �� ���� ������ setId�޼��带 �̿��ؼ� �ܺ�Ŭ�������� id ������ �� �ְ� ��
		this.id=id;
	}
	
	public String getName() { //�ν��Ͻ� ���� name�� �ܺ�Ŭ�������� ������ �� �ֵ��� �޼��� ����
		return name;
	}
	
	public String getId() { //�ν��Ͻ� ���� id�� �ܺ�Ŭ�������� ������ �� �ִ� �޼��� ����.
		return id;
	}
	
	public void display() { //name�� id ���� ������ִ� �޼���
		System.out.print(name+"\t"+id+"\t"); //���������忡 "\t"�� �ϸ� �ڼ�Ŭ�������� �������̵��� �� tab��
	}
}
