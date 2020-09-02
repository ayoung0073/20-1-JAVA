package Week13_1_문아영;

public class PrintThread extends Thread{ //Thread클래스를 상속받은 PrintThread클래스
	 SharedArea sharedArea; //공동구역 선언
	 public void run()
	 {
		 if(sharedArea.isReady!=true) //sharedArea(공동구역)의 멤버변수 isReady가 false이면
		 {
			 try{ //wait함수를 쓰기 위해 try~catch문 이용
					 synchronized(sharedArea){ //동기화
						 sharedArea.wait(); //다른 thread의 신호를 기다림
					 	}
			 }
			 catch(InterruptedException e){
				 System.out.println(e.getMessage());
			 }
		 }
		 System.out.printf("%.2f",sharedArea.ratio*100); //소수점 둘째자리까지 퍼센트구함 
		 System.out.println("%");//%붙임
	 }
}
