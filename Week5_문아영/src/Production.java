
public class Production { //부모클래스 생성
	private String title; //String형 title, director,writer 모두 private으로 선언함
	private String director; 
	private String writer;
	
	public Production() {}
	public Production(String title,String director,String writer) { //매개변수 String형 title,director,writer가 있는 생성자
		this.title=title;
		this.director=director;
		this.writer=writer;
	}
	
	public String getTitle() { //private인 title을 다른 클래스에서 참조할 수 없기 때문에,public메서드인 getTitle 만듬
		return title;
	}
	public String getDirector() { //private인 director을 다른 클래스에서 참조할 수 없기 때문에, public메서드인 getDirector 만듬
		return director;
	}
	public String getWriter() { //private인 writer을 다른 클래스에서 참조할 수 없기 때문에, public메서드인 getWriter 만듬
		return writer;
	}
	public void setTitle(String title) { //private인 title을 다른 클래스에서 지정할 수 있게 public메서드 setTitle를 만듬
		this.title=title;
	}
	public void setDirector(String director) { //private인 director을 다른 클래스에서 지정할 수 있게 public메서드 setDirector을 만듬
		this.director=director;
	}
	public void setWriter(String writer) {//private인 writer을 다른 클래스에서 지정할 수 있게 public메서드 setWriter를 만듬
		this.writer=writer;
	}
	public void display() { //title, director, writer을 출력하는 메서드
		System.out.println("Title:"+title);
		System.out.println("Director:"+director);
		System.out.println("Writer:"+writer);
	}

}
