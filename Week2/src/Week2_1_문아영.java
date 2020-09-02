import java.util.Scanner;
public class Week2_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int money;
		int num_50000=0,num_10000=0,num_5000=0,num_1000=0,num_500=0,num_100=0,num_50=0,num_10=0,remainder=0;
		
		Scanner keyboard=new Scanner(System.in); //Scanner 객체 생성
		
		System.out.print("Input the amount of money(0~100000): ");
		money=keyboard.nextInt(); //금액 입력받아서 money라는 변수에 저장.
	
		if(money<=0||money>=100000) { //0원과 100000원사이 금액이 아니라면 
			System.out.println("잘못된 입력"); //"잘못된 입력" 출력시키고 종료시킴
		}
		else { //0원과 100000사이 금액일 때
		while(money>0) { //money가 0이 되면 while문 벗어남.
				if(money>=50000) {
					num_50000=money/50000; //money에 50000을 나눈 몫이 최대 50000원권 지폐 개수가 됨
					money=money%50000; //money에 50000을 나눈 나머지가 (money-50000*num_50000)원이 됨 money로 대입
				}
				else if( money>=10000) {
					num_10000=money/10000; //money에 10000을 나눈 몫이 최대 10000원권 지폐 개수가 됨
					money=money%10000; //money에 10000을 나눈 나머지가 (money-10000*num_10000)원이 됨  money로 대입
			
				}
				else if (money>=5000) { 
					num_5000=money/5000; //money에 5000을 나눈 몫이 최대 5000원권 지폐 개수가 됨
					money=money%5000; //money에 5000을 나눈 나머지가 (money-5000*num_5000)원이 됨  money로 대입
				}
				else if (money>=1000) {
					num_1000=money/1000; //money에 1000을 나눈 몫이 최대 1000원권 지폐 개수가 됨
					money=money%1000; //money에 1000을 나눈 나머지가 (money-1000*num_1000)원이 됨  money로 대입
				}
				else if (money>=500) { 
					num_500=money/500; //money에 500을 나눈 몫이 최대 500원 동전 개수가 됨
					money=money%500; //money에 500을 나눈 나머지가 (money-500*num_500)원이 됨  money로 대입
				}
				else if (money>=100) { 
					num_100=money/100; //money에 100을 나눈 몫이 최대 100원 동전 개수가 됨
					money=money%100; //money에 100을 나눈 나머지가 (money-100*num_100)원이 됨  money로 대입
				}
				else if (money>=50) { 
					num_50=money/50; //money에 50을 나눈 몫이 최대 50원 동전 개수가 됨
					money=money%50; //money에 50을 나눈 나머지가 (money-50*num_50)원이 됨  money로 대입
				}
				else if (money>=10) { 
					num_10=money/10; //money에 10을 나눈 몫이 최대 10원 동전 개수가 됨
					money=money%10; //money에 10을 나눈 나머지가 (money-10*num_10)원이 됨  money로 대입
				}
				else {
					remainder=money; //일의 자리수 의미
					money=money/10; //money에 10을 나눈 나머지가 0이 되므로 다시 반복문을 돌 때 조건에 맞지 않아서 while문이 종료된다
				}
				}
			
			
		System.out.println("The output will be");
		System.out.println("50000 won: "+num_50000);
		System.out.println("10000 won: "+num_10000);
		System.out.println("5000 won: "+num_5000);
		System.out.println("1000 won: "+num_1000);
		System.out.println("500 won: "+num_500);
		System.out.println("100 won: "+num_100);
		System.out.println("50 won: "+num_50);
		System.out.println("10 won: "+num_10);
		System.out.println("Remainder: "+remainder);

	}
	}

}
