public class Computer extends Product { //Product클래스 상속받은 클래스
	Computer(){
		super(200); //Computer의 price: 200
	}
	public String toString() {//Tv클래스에서 설명
		return "Computer";
	}

}
