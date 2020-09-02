public class Buyer {
	private int money; //내는 돈을 money라는 인스턴스변수로 선언. (private으로 선언)
	private int i; //
	int bonusPoint=0;
	Product item[]=new Product[10]; //참조변수 item을 선언해 Product 배열 선언 (최대 10개까지)
	
	public void setMoney(int money) { //private으로 선언한 인스턴스변수 money를 지정하게 할 수 있는 메서드
		this.money=money;
	}
	public int getMoney() { //인스턴스 변수를 다른 클래스가 참조할 수 있도록 하는 메서드
		return money;
	}
	public void buy(Product pd) { //Product클래스(참조변수 pd)가 매개변수인 buy메서드
		if(pd.price>money) { //pd의 price가 money(내는 돈)보다 클 때
			System.out.println("Money is not enough.\n");//내는 돈이 충분하지 않다는 것 출력하고
			summary(); //그 전까지의 정보들을 summary메서드를 호출해서 출력하고
			System.exit(0); //종료
		}
		else { //pd의 price가 money보다 작거나 같을 때
			System.out.println("You bought "+pd+"("+pd.price+")."); //사용자가 산 pd의 price의 정보를 알려줌
			money=money-pd.price; //내는돈에서 pd의 price를 뺸 것을 다시 money에 저장함
			bonusPoint=bonusPoint+pd.bonusPoint; //사용자의 bonusPoint에 pd의 bonusPoint를 더해 다시 사용자의 bonusPoint에 저장
			item[i++]=pd; //item 배열의 i번째 인덱스에 pd 저장.
		}
	}
	public void summary() { //summary라는 메서드 구현
		System.out.print("SHOPPING LIST: ");
		for(int j=0;j<i;j++) System.out.print(item[j]+" "); //쇼핑한 물품이름 나열함.item[j]=item[j].toString()
		System.out.println("\nMONEY LEFT: "+money); //남은 돈 알려줌
		System.out.println("CURRENT BONUS POINT: "+bonusPoint);//현재 보너스포인트 출력
	}
	
	
}
