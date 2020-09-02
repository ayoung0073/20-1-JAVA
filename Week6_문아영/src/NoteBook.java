public class NoteBook extends Product { //Product클래스 상속받은 클래스
	NoteBook(){ 
		super(300); //300은 NoteBook의 price
	}
	public String toString() {//Tv클래스에서 설명
		return "NoteBook";
	}
}
