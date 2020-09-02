public class Audio extends Product { //Product클래스 상속받은 클래스
	Audio(){
		super(50); //Audio의 price: 50
	}
	public String toString() { //Tv클래스에서 설명
		return "Audio";
	}
}
