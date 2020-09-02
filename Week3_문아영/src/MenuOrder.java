import java.util.Scanner;
public class MenuOrder {
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	Scanner kbd=new Scanner(System.in); //Scanner ��ü ����
	
	public void setPrice(String menu, int price) { //�Է¹��� menu�� price�� �̿��ؼ� �������� ����
		if(menu.equalsIgnoreCase("coke")){ //���� menu�� "coke"(�빮�� �������)�̸�
			this.cokePrice=price; //�� ��ü�� cokePrice�� price(����)�� �����Ѵ�.
		}
		else if (menu.equalsIgnoreCase("lemonade")){ //���� menu�� "lemonade"(�빮�� �������)�̸�
			this.lemonadePrice=price;//�� ��ü�� lemonadePrice�� price(����)�� �����Ѵ�.
		}
		else if(menu.equalsIgnoreCase("coffee")){ // menu�� "coffee"(�빮�� �������)�̸�
			this.coffeePrice=price; //�� ��ü�� coffeePrice�� price(����)�� �����Ѵ�.
		}
	}
	
	public void setinputMoney(int inputMoney) { //inputMoney �μ��� �޴� �޼��� ���� (�ִ� �� �ǹ�)
		this.inputMoney=inputMoney; //�� ��ü�� inputMoney�� �μ��� ����.
	}
	
	public void showMenu() { //�޴����� ǥ���ϱ�
		System.out.println("--- ���Ḧ �����ϼ��� ---");
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	
	public void showResult(String drink) { //int���� drinkSelected�μ��� �޴� �޼��� ����
		this.drinkSelected=drink;
		if(drinkSelected.equals("1")) { //���� drinkSelected�� 1�̸�
			System.out.println("Coke�� �����ϼ̽��ϴ�."); //Coke ����
			if(cokePrice>inputMoney) { //���� �ִµ��� ���ݺ��� ������
				int money=cokePrice-inputMoney;
				System.out.println(money+"�� �� �־��ּ���"); // ������ �� ������� ���
			}
			else if(cokePrice<inputMoney) { // �� ũ�� 
				int money=inputMoney-cokePrice;
				System.out.println("�ܵ��� "+money+"���Դϴ�."); //�ܵ� �˷��ֱ�
			}
		}
		else if (drinkSelected=="2") { //2���� �����ϸ�
			System.out.println("Lemonade�� �����ϼ̽��ϴ�."); //�����̵� ����
			if(lemonadePrice>inputMoney) { //���� �ִ� ���� ���ݺ��� ������
				int money=lemonadePrice-inputMoney;
				System.out.println(money+"�� �� �־��ּ���"); //������ �� ����ϰ� ������� ����
			}
			else if(lemonadePrice<inputMoney) { //�� ũ��
				int money=inputMoney-lemonadePrice;
				System.out.println("�ܵ��� "+money+"���Դϴ�."); //�ܵ� �����ֱ�
			}
		}
		else if (drinkSelected=="3") { //3�� �����ϸ� Ŀ�� ����.
			System.out.println("Coffee�� �����ϼ̽��ϴ�.");
			if(coffeePrice>inputMoney) {
				int money=coffeePrice-inputMoney;
				System.out.println(money+"�� �� �־��ּ���");
			}
			else if(coffeePrice<inputMoney) {
				int money=inputMoney-coffeePrice;
				System.out.println("�ܵ��� "+money+"���Դϴ�.");
			}
		}
		else { //1,2,3�� �ƴ� �ٸ� ������ �Է��ϸ�
			System.out.println("���� �޴��� �����ϼ̽��ϴ�."); //���� �޴� �����ߴٰ� ���
		}
	}
}


	