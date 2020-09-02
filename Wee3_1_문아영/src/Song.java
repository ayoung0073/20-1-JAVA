
public class Song { //Song이라는 클래스 생성
	String title; 
	String singer;
	int price;
	
	public void play() { //Song클래스형의 메서드 play()선언. 인수는 없다. void형으로 반환.
		System.out.println("노래들어요: "+"\""+title+"\""+" by "+singer); //큰따옴표"를 표시하려면 앞에 역슬래시(\)를 쓰면 된다. "\""라고 쓰면 된다
	}
	public void price() {//Song클래스형의 메서드 price() 선언. 인수는 없다. void형으로 반환
		System.out.println(price+"원입니다."); //가격정보 출력
	}
}
