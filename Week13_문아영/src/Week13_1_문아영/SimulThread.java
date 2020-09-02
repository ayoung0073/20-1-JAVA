package Week13_1_문아영;

public class SimulThread extends Thread { //Thread클래스를 상속받은 SimulThread
	int num; //입력받은 횟수 
	int num_0; //앞면이 나온 개수
	
	SharedArea sharedArea; //sharedArea(공동구역) 선언

	public SimulThread(int num) //num을 인자로 하는 SimulThread 생성자
	{
		this.num=num; 
	}
	
	public void run()
	{
		for (int i=0; i< num; i++) //num번 for문 반복
		{
			int zero_one=(int)Math.round(Math.random()); //random, round를 이용해 zero_one에 0 아니면 1 대입하기
			if(zero_one==0) num_0+=1; //zero_one이 0이면 앞면이 나온 개수 +1
		}
		
		sharedArea.ratio=(double)num_0/num; //num번의 횟수중 앞면이 나온 비율 sharedArea에 저장 
		sharedArea.isReady=true; //sharedArea의 기본값(false)로 저장되어있는 멤버변수 isReady를 true로 바꿈
		
		synchronized(sharedArea)// 동기화
		{
			sharedArea.notify(); //다른 쓰레드에 신호 전달
		}
	}
}
