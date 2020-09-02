
public class Production { //�θ�Ŭ���� ����
	private String title; //String�� title, director,writer ��� private���� ������
	private String director; 
	private String writer;
	
	public Production() {}
	public Production(String title,String director,String writer) { //�Ű����� String�� title,director,writer�� �ִ� ������
		this.title=title;
		this.director=director;
		this.writer=writer;
	}
	
	public String getTitle() { //private�� title�� �ٸ� Ŭ�������� ������ �� ���� ������,public�޼����� getTitle ����
		return title;
	}
	public String getDirector() { //private�� director�� �ٸ� Ŭ�������� ������ �� ���� ������, public�޼����� getDirector ����
		return director;
	}
	public String getWriter() { //private�� writer�� �ٸ� Ŭ�������� ������ �� ���� ������, public�޼����� getWriter ����
		return writer;
	}
	public void setTitle(String title) { //private�� title�� �ٸ� Ŭ�������� ������ �� �ְ� public�޼��� setTitle�� ����
		this.title=title;
	}
	public void setDirector(String director) { //private�� director�� �ٸ� Ŭ�������� ������ �� �ְ� public�޼��� setDirector�� ����
		this.director=director;
	}
	public void setWriter(String writer) {//private�� writer�� �ٸ� Ŭ�������� ������ �� �ְ� public�޼��� setWriter�� ����
		this.writer=writer;
	}
	public void display() { //title, director, writer�� ����ϴ� �޼���
		System.out.println("Title:"+title);
		System.out.println("Director:"+director);
		System.out.println("Writer:"+writer);
	}

}
