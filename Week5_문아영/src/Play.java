
public class Play extends Production { //ProductionŬ���� ��ӹ��� �ڽ�Ŭ���� Play
	private int performanceCost; //int�� performanceCost private���� ����
	
	public Play() {}//����Ʈ ������ ������. super()�ڵ�ȣ��
	public Play(String title,String director,String writer,int performanceCost){//�Ű����� String�� title,director,writer,int�� performanceCost�� �ִ� ������
		super(title,director,writer); //�θ�Ŭ���� ������ ȣ��
		this.performanceCost=performanceCost; //�ڽ�Ŭ�������� �߰���
	}
	
	public int getPerformanceCost() { //�ν��Ͻ����� performanceCost�� private���� ����Ǿ��� ������ �ٸ� Ŭ�������� ȣ���� �� �ִ� public �޼��� ����.
		return performanceCost;
	}
	public void setPerformanceCost(int performanceCost) {//�ν��Ͻ����� performanceCost�� private���� ����Ǿ��� ������ �ٸ� Ŭ�������� performanceCost�� ������ �� �ְ� public �޼��� ����.
		this.performanceCost=performanceCost;
	}
	public void display(){ // �������̵�: �θ�Ŭ������ �޼��带 �ٽ� ������.
		System.out.println("Title:"+getTitle());
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("performance cost:"+getPerformanceCost());
	}

}
