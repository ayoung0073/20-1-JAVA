
class Song{ //Song이라는 클래스 생성
	public String title; //노래 제목
	public String singer; //노래 가수명
	public int price; //노래 가격
	
	Song(){} //Song의 디폴트 생성자
	public Song(String title, String singer, int price){ //title,singer,price의 3개의 매개변수가 있는 생성자
		this.title=title; //매개변수 title을 객체의 title에 저장하겠다.
		this.singer=singer; //매개변수 singer을 객체의 singer에 저장하곘다.
		this.price=price; //매개변수 price를 객체의  price에 저장하겠다.
	}
	public Song(String title,int price){ //title, price 2개의 매개변수가 있는 생성자
		this(title,"모름",price); //같은 클래스의 매개변수가 3개 있는 생성자를 호출하여, 이 객체의 singer을 "모름"으로 저장하겠다.
	}
	
	public void play() {
		System.out.println(title+" by "+singer); //노래정보 출력하는 메서드
	}
	
}