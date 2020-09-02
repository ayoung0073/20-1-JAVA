package Week13_2_문아영;

class SharedArea{ //SharedArea클래스 생성
	String randStr; 
	int end;
}
		
public class Week13_2_문아영 {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		

		SharedArea SA=new SharedArea();//SharedArea 공동구역 생성(참조변수 : SA)
		RandomThread rt=new RandomThread();//RandomThread클래스형 인스턴스 생성
		JOptionPaneThread jt=new JOptionPaneThread(); //JOptionPaneThread클래스형 인스턴스생성
		
		rt.sharedArea=SA; //rt, jt에 공동구역(SA) 공유.
		jt.sharedArea=SA;
	
		rt.start();//rt 시작시키기
		jt.start(); //jt 시작시키기
		 
		while(true) //while문 반복
		{
				if(SA.end ==1) //SA의 멤버변수 end가 1이면 
				{
					jt.setStop(true); //jt 종료시키기
					System.out.println("\n실패!"); //"\n실패!" 출력
					break;//while문 빠져나가기
				}
				else if(SA.end==2) //SA의 멤버변수 end가 2이면
				{
					rt.setStop(true); //rt 종료시키기
					System.out.println("성공!"); 
					System.out.println("Timer is stopped.");
					break;//while문 빠져나가기
				}

				try{ // sleep함수이용하기 위해 try~catch문 사용
					Thread.sleep(5); //한번 반복하고 0.005초 쉬기
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
	}
}

}
	
