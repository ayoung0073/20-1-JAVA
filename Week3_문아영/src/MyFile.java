
public class MyFile { //MyFile Ŭ������ ����
	private String title; //String���� title�̶�� �̸��� ������ private���� ����
	private int page; //int���� page��� �̸��� ������ private���� ����
	
	public void setTitle(String title) { //String�� �μ��� �޴� setTitle �޼��� ����
		this.title=title; //�μ��� �� ��ü�� title�� ������
	}
	public String getTitle() { 
		return title; //�� ��ü�� title�� ��ȯ�ϴ� �޼��� ����
	}
	public void setPage(int page) { //int�� �μ��� ������
		this.page=page; //�� �μ��� �� ��ü�� page�� �����Ѵ�.
	}
	public int getPage() {
		return page; //�� ��ü�� page�� ��ȯ�ϴ� �޼��� ����
	}
	public void fileCopy(MyFile file) {
		file.title=this.title; //�� ��ü�� title�� Myfile���� file�� title�� ������ 
		file.page=this.page; //�� ��ü�� page�� file�� page�� ������
	}
	public void fileInfo() { //�� ��ü�� ������ ���
		System.out.println("��������:"+title); 
		System.out.println("������:"+page);
	}
}
