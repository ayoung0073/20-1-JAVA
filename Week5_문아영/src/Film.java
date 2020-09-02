
public class Film extends Production { //Production클래스 상속받은 자식클래스 Film 생성
	private int boxOfficeGross; //int형 boxOfficeGross private으로 선언
	
	public Film() {} //디폴트 생성자 생성함. super()자동호출
	public Film(String title,String director,String writer,int boxOfficeGross){//매개변수 String형 title,director,writer,int형 boxOfficeGross가 있는 생성자
		super(title,director,writer); //부모클래스 생성자 호출
		this.boxOfficeGross=boxOfficeGross; //자식클래스Film에서 추가됨
	}
	
	public int getBoxOfficeGross() { //인스턴스변수 boxOfficeGross가 private으로 선언되었기 때문에 다른 클래스에서 호출할 수 있는 public 메서드 구현.
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {//인스턴스변수 boxOfficeGross가 private으로 선언되었기 때문에 다른 클래스에서 boxOfficeGross를 지정할 수 있게 public 메서드 구현.
		this.boxOfficeGross=boxOfficeGross;
	}
	public void display(){ // 오버라이딩: 부모클래스의 메서드를 다시 구현함.
		System.out.println("Title:"+getTitle());
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("boxOfficeGross:"+getBoxOfficeGross());
	}

}
