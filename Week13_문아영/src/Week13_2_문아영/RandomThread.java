package Week13_2_문아영;


public class RandomThread extends Thread{ //Thread클래스 상속받은 RandomThread
	 SharedArea sharedArea;//공동구역 선언
	 boolean stop; //디폴트:false
	 public void setStop(boolean s) { //boolean형을 인자로 받는 메서드
		 stop=s; //그 boolean형을 stop에 대입
	 }
	 
	 String[] str= {"moon","ayo","dog","cat","water","air","pod","ipad","cream","cyber","boan","ewha","java","python","cake","happy","money","main","css","html"}; //String형 배열 str에 저장
	public  void run()
	 {
		 for(int i=0;i<20;i++) 
		 {
			 if(stop==true) break; //stop이 true이면 for문 빠져나가기
			 
			 int randnum=(int)(Math.random()*20);  //randnum에 0~19의 랜덤숫자 대입
			 sharedArea.randStr=str[randnum]; //sharedArea의 멤버변수 randStr에 str배열의 randnum번째 인덱스값 대입
			 System.out.println(str[randnum]); //str배열의 randnum인덱스 값 출력
			 try { //sleep함수이용하기 위해 try~catch문 이용
				 Thread.sleep(1000); //1초동안 쉬기
			 }
			 catch(InterruptedException e) {
				 System.out.println(e.getMessage());
			 }
		  }
	 sharedArea.end=1; //for문 모두 반복하면 sharedArea의 멤버변수 end에 1대입(실패를 말해줌)
	 }
}
