public class Product { //����Ŭ���� Product
	public int price; //Product�� �ν��Ͻ� ������ public���� ���� 
	public int bonusPoint;

	Product(int price){ //price�� �μ��� ���� ������ ����
		this.price=price;
		bonusPoint=(int)(price/10.0); //price�� ���� bonusPoint�޶���
	}
}
