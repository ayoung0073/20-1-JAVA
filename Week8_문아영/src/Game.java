import java.util.Scanner;
public class Game {
	public int userWin=0;  //user가 이긴 횟수
	public int computerWin=0; //컴퓨터가 이긴 횟수
	public int userInput=0; //가위(1),바위(2),보(3) 중  user가 고를 번호
	public int computerRand=0; //랜덤수(1~3사이)
	String[] str= {"가위","바위","보"}; //String형 가위, 바위, 보를 저장한 배열 선언 및 초기화
	
	Scanner kbd=new Scanner(System.in); //Scanner 객체 생성
	public void play() {
		System.out.println("가위바위보 게임을 시작합니다.");
		input(); //input메서드 호출
		System.out.printf("You(%d)\tCom(%d)",userWin,computerWin); //input메서드 후 user가 이긴 횟수와 컴퓨터가 이긴 횟수 알려줌
		System.out.println(); // 한줄띄우기
		
		if(userWin==3) System.out.println("당신이 이겼습니다.");  //이긴횟수가 3인 사람(or computer)이 이김.
		else System.out.println("컴퓨터가 이겼습니다.");
		
		System.out.println("게임을 종료합니다.");
	}
	
	public void input(){ //play메서드가 호출한 메서드
		System.out.println();
		while(userWin!=3 && computerWin!=3) { //user나 computer의 이긴횟수가 3이 되기 전까지 while문 반복. 
			try { //예외 발생할 가능성 있는 문장들을 넣음
			System.out.printf("당신의 선택은?(You(%d) - Com(%d))\n",userWin,computerWin);
			System.out.println("가위(1)	바위(2)	보(3)");
			userInput=kbd.nextInt(); //번호 입력받기
				if(userInput!=1&&userInput!=2&&userInput!=3) throw new Exception("범위가 잘못되었습니다."); //번호가 1,2,3 이 아니면 일치하는 catch블럭 찾아서 catch블럭 내의 문장들 수행.
			computerRand=(int)(Math.random()*3)+1; //예외 발생하지 않으면 게속 진행. computer의 번호 랜덤으로 지정(1~3사이)
			
			System.out.println("<You>\t<Com>");
			if(userInput==3) System.out.print(str[userInput-1]+"\t\t"); //3번은 "보"인데 보는 따로 탭을 두번처리해야 정렬맞춤이 된다 번호가 n이면 str배열에선 인덱스가 n-1이므로 -1을 해준다
			else System.out.print(str[userInput-1]+"\t");
			System.out.println(str[computerRand-1]); //str배열에서 인덱스가 (컴퓨터의 번호-1)에 해당되는 값 출력
			writeOutput(); //writeOutput메서드 호출
		}//예외가 생기면 그 이 블럭전까지 다 건너뛰고 catch문으로 감
			catch(Exception e){ //예외가 발생했을 때 catch문 수행
				System.out.println(e.getMessage()); //"범위가 잘못되었습니다." 출력
				System.out.println();//한줄 건너뛰기
			} //catch문이 while문 안에 있으므로 다시 while문으로 돌아가서 while문 반복함.
	}
	}
	public void writeOutput() { //input메서드가 호출한 메서드
		if(userInput==computerRand) { //번호가 같으면 비김
			System.out.println("비김");
		}
		else if(userInput-computerRand>0) { //user번호에서 컴퓨터번호를 뻈을 때 0보다 크고
			if((userInput-computerRand)%3==1) { //나머지가 1이면
				System.out.println("당신 승"); //user승 ex1)user:2(바위) computer:1(가위) ex2) user:3(보) computer:2(바위) 
				userWin++; //user가 승리한 횟수 1추가하기
			}
			else {//나머지가 2이면
				System.out.println("컴퓨터 승"); // ex1)user:3(보) computer:1(가위)
				computerWin++; //컴퓨터가 승리한 횟수 1추가
			}
		}
		else{//user번호에서 컴퓨터 번호 뻈을 때 0보다 작고
			if((computerRand-userInput)%3==1) { //자바에선 나머지연산은 부호를 무시하고 계산되기 때문에 컴퓨터에서 user번호를 빼는 것으로 한다.
				System.out.println("컴퓨터 승"); //ex1) user:1(가위) computer:2(바위) ex2)user:2(바위) computer:3(보)
				computerWin++; //컴퓨터가 승리한 횟수 1추가
			}
			else { // 나머지 2
				System.out.println("당신 승"); //ex1)user:1(가위) computer:3(보) 
				userWin++;//user가 승리한 횟수 1추가하기
		}
		}
		System.out.println();
	}
}
