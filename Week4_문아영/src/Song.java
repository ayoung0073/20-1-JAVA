
class Song{ //Song�̶�� Ŭ���� ����
	public String title; //�뷡 ����
	public String singer; //�뷡 ������
	public int price; //�뷡 ����
	
	Song(){} //Song�� ����Ʈ ������
	public Song(String title, String singer, int price){ //title,singer,price�� 3���� �Ű������� �ִ� ������
		this.title=title; //�Ű����� title�� ��ü�� title�� �����ϰڴ�.
		this.singer=singer; //�Ű����� singer�� ��ü�� singer�� �����ρٴ�.
		this.price=price; //�Ű����� price�� ��ü��  price�� �����ϰڴ�.
	}
	public Song(String title,int price){ //title, price 2���� �Ű������� �ִ� ������
		this(title,"��",price); //���� Ŭ������ �Ű������� 3�� �ִ� �����ڸ� ȣ���Ͽ�, �� ��ü�� singer�� "��"���� �����ϰڴ�.
	}
	
	public void play() {
		System.out.println(title+" by "+singer); //�뷡���� ����ϴ� �޼���
	}
	
}