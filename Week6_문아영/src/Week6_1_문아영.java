import java.util.Scanner;
public class Week6_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int num=1; //선택할 번호를 정수형 num으로 선언. while문 조건 충족하기 위해 0이 아닌 정수 대입
		
		Buyer buyer=new Buyer(); //참조변수 buyer를 이용해 Buyer객체 생성
		Scanner kbd=new Scanner(System.in);//Scanner객체 생성
		
		System.out.println("How much do you have?");
		buyer.setMoney(kbd.nextInt()); //Buyer클래스의 setMoney메서드를 이용해서 buyer의 money로 사용자로부터 입력받은 값 저장.
		while(num!=0) { //선택한 번호가 0이 아닐 때 while문 반복
			System.out.println("What do you want to buy? Input 0 to quit");
			System.out.println("1. Tv(100)   2. Computer(200)   3. Video(110)   4. Audio(50)   5. NoteBook(300)");
			num=kbd.nextInt(); //nextInt메서드를 이용해 num에 사용자로부터 입력받은 값 저장
			
			switch(num) { //num이(조건이)
			case 1: //1일 때 수행할 문장
				buyer.buy(new Tv());
				break;
			case 2: //1일 때와 같이 아래 같은 내용 반복
				buyer.buy(new Computer());
				break;
			case 3:
				buyer.buy(new Video());
				break;
			case 4:
				buyer.buy(new Audio());
				break;
			case 5:
				buyer.buy(new NoteBook());
				break;
			case 0: //num(선택한 번호)가 0일 때는 
				System.out.println(); //한줄 띄우고 
				break; //switch문을 빠져나가 다시 while으로 가는데 조건에 맞지 않아 while문 빠져나가 47번 문장 수행.
			default: //0~5가 아닌 다른 정수일 때
				System.out.println("No such item."); //"No such item."출력
				break;
			}
		}
		buyer.summary(); //Buyer클래스에 있는 summary메서드 호출
		
		

	}

}
