
public class Film extends Production { //ProductionŬ���� ��ӹ��� �ڽ�Ŭ���� Film ����
	private int boxOfficeGross; //int�� boxOfficeGross private���� ����
	
	public Film() {} //����Ʈ ������ ������. super()�ڵ�ȣ��
	public Film(String title,String director,String writer,int boxOfficeGross){//�Ű����� String�� title,director,writer,int�� boxOfficeGross�� �ִ� ������
		super(title,director,writer); //�θ�Ŭ���� ������ ȣ��
		this.boxOfficeGross=boxOfficeGross; //�ڽ�Ŭ����Film���� �߰���
	}
	
	public int getBoxOfficeGross() { //�ν��Ͻ����� boxOfficeGross�� private���� ����Ǿ��� ������ �ٸ� Ŭ�������� ȣ���� �� �ִ� public �޼��� ����.
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {//�ν��Ͻ����� boxOfficeGross�� private���� ����Ǿ��� ������ �ٸ� Ŭ�������� boxOfficeGross�� ������ �� �ְ� public �޼��� ����.
		this.boxOfficeGross=boxOfficeGross;
	}
	public void display(){ // �������̵�: �θ�Ŭ������ �޼��带 �ٽ� ������.
		System.out.println("Title:"+getTitle());
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("boxOfficeGross:"+getBoxOfficeGross());
	}

}
