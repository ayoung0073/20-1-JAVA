package HW1_4_���ƿ�;

public class StudentScore extends StudentInformation {//StudentInformationŬ���� ��ӹ��� �ڼ�Ŭ����
	private int korean; //��������
	private int math; //��������
	private int english; //��������
	
	public void setKorean(int korean) { //�ν��ϼ����� korean �����ϴ� �޼��� (�ܺ�Ŭ�������� ���� ����)
		this.korean=korean;
	}
	public void setMath(int math) {//�ν��ϼ����� math �����ϴ� �޼��� (�ܺ�Ŭ�������� ���� ����)
		this.math=math;
	}
	public void setEnglish(int english) {//�ν��ϼ����� english �����ϴ� �޼��� (�ܺ�Ŭ�������� ���� ����)
		this.english=english;
	}
	
	public int getKorean() { //�ν��Ͻ� ���� korean ��ȯ�ϴ� �޼��� (�ܺ�Ŭ�������� ���� ����)
		return korean;
	}
	public int getMath() { //�ν��Ͻ� ���� math ��ȯ�ϴ� �޼��� (�ܺ�Ŭ�������� ���� ����)
		return math;
	}
	public int getEnglish() {//�ν��Ͻ� ���� english ��ȯ�ϴ� �޼��� (�ܺ�Ŭ�������� ���� ����)
		return english;
	}
	public void display() { //display �޼��� �������̵���
		super.display(); //���� �޼��� ȣ��
		System.out.print(korean+"\t"+math+"\t"+english+"\t");  //���ٷ� ����ؾߵǱ⶧���� print�� ���δ�.
		
		int sum=korean+math+english; //����,����,���� ������
		double avg=sum/3.0; //double���̱� ������ 3�� �ƴ� 3.0���� ������.
		
		System.out.print(sum+"\t");
		System.out.printf("%.2f",avg); //�Ҽ����Ʒ� ��°�ڸ����� ��Ÿ�������� printf��
		System.out.println(); //���� ����
	}
}
