public class Product { //조상클래스 Product
	public int price; //Product의 인스턴스 변수는 public으로 선언 
	public int bonusPoint;

	Product(int price){ //price를 인수로 갖는 생성자 만듬
		this.price=price;
		bonusPoint=(int)(price/10.0); //price에 따라 bonusPoint달라짐
	}
}
