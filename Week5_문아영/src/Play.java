
public class Play extends Production { //Production클래스 상속받은 자식클래스 Play
	private int performanceCost; //int형 performanceCost private으로 선언
	
	public Play() {}//디폴트 생성자 생성함. super()자동호출
	public Play(String title,String director,String writer,int performanceCost){//매개변수 String형 title,director,writer,int형 performanceCost가 있는 생성자
		super(title,director,writer); //부모클래스 생성자 호출
		this.performanceCost=performanceCost; //자식클래스에서 추가됨
	}
	
	public int getPerformanceCost() { //인스턴스변수 performanceCost가 private으로 선언되었기 때문에 다른 클래스에서 호출할 수 있는 public 메서드 구현.
		return performanceCost;
	}
	public void setPerformanceCost(int performanceCost) {//인스턴스변수 performanceCost가 private으로 선언되었기 때문에 다른 클래스에서 performanceCost를 지정할 수 있게 public 메서드 구현.
		this.performanceCost=performanceCost;
	}
	public void display(){ // 오버라이딩: 부모클래스의 메서드를 다시 구현함.
		System.out.println("Title:"+getTitle());
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
		System.out.println("performance cost:"+getPerformanceCost());
	}

}
