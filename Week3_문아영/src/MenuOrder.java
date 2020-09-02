import java.util.Scanner;
public class MenuOrder {
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	Scanner kbd=new Scanner(System.in); //Scanner 객체 생성
	
	public void setPrice(String menu, int price) { //입력받은 menu와 price를 이용해서 가격정보 설정
		if(menu.equalsIgnoreCase("coke")){ //만약 menu가 "coke"(대문자 상관없이)이면
			this.cokePrice=price; //이 객체의 cokePrice에 price(가격)를 저장한다.
		}
		else if (menu.equalsIgnoreCase("lemonade")){ //만약 menu가 "lemonade"(대문자 상관없이)이면
			this.lemonadePrice=price;//이 객체의 lemonadePrice에 price(가격)을 저장한다.
		}
		else if(menu.equalsIgnoreCase("coffee")){ // menu가 "coffee"(대문자 상관없이)이면
			this.coffeePrice=price; //이 객체의 coffeePrice에 price(가격)을 저장한다.
		}
	}
	
	public void setinputMoney(int inputMoney) { //inputMoney 인수를 받는 메서드 생성 (넣는 돈 의미)
		this.inputMoney=inputMoney; //이 객체의 inputMoney에 인수를 대입.
	}
	
	public void showMenu() { //메뉴정보 표시하기
		System.out.println("--- 음료를 선택하세요 ---");
		System.out.println("1. Coke: "+cokePrice);
		System.out.println("2. Lemonade: "+lemonadePrice);
		System.out.println("3. Coffee: "+coffeePrice);
	}
	
	public void showResult(String drink) { //int형인 drinkSelected인수로 받는 메서드 생성
		this.drinkSelected=drink;
		if(drinkSelected.equals("1")) { //만약 drinkSelected가 1이면
			System.out.println("Coke를 선택하셨습니다."); //Coke 선택
			if(cokePrice>inputMoney) { //만약 넣는돈이 가격보다 작으면
				int money=cokePrice-inputMoney;
				System.out.println(money+"원 더 넣어주세요"); // 부족한 돈 넣으라고 출력
			}
			else if(cokePrice<inputMoney) { // 더 크면 
				int money=inputMoney-cokePrice;
				System.out.println("잔돈은 "+money+"원입니다."); //잔돈 알려주기
			}
		}
		else if (drinkSelected=="2") { //2번을 선택하면
			System.out.println("Lemonade를 선택하셨습니다."); //레몬에이드 선택
			if(lemonadePrice>inputMoney) { //만약 넣는 돈이 가격보다 작으면
				int money=lemonadePrice-inputMoney;
				System.out.println(money+"원 더 넣어주세요"); //부족한 돈 출력하고 넣으라고 말함
			}
			else if(lemonadePrice<inputMoney) { //더 크면
				int money=inputMoney-lemonadePrice;
				System.out.println("잔돈은 "+money+"원입니다."); //잔돈 말해주기
			}
		}
		else if (drinkSelected=="3") { //3을 선택하면 커피 선택.
			System.out.println("Coffee를 선택하셨습니다.");
			if(coffeePrice>inputMoney) {
				int money=coffeePrice-inputMoney;
				System.out.println(money+"원 더 넣어주세요");
			}
			else if(coffeePrice<inputMoney) {
				int money=inputMoney-coffeePrice;
				System.out.println("잔돈은 "+money+"원입니다.");
			}
		}
		else { //1,2,3이 아닌 다른 정수를 입력하면
			System.out.println("없는 메뉴를 선택하셨습니다."); //없는 메뉴 선택했다고 출력
		}
	}
}


	