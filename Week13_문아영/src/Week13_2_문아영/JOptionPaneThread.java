package Week13_2_문아영;

import javax.swing.JOptionPane;

public class JOptionPaneThread extends Thread{ //Thread클래스를 상속받은 JOptionPaneThread클래스
	SharedArea sharedArea; //공동구역 선언
	 boolean stop;
	 public void setStop(boolean s) { //boolean형을 인자로 하는 setStop메서드
		 stop=s;//인자를 stop에 대입
	 }
	
	public void run()
	{
		while(true) //while문 반복
		{
				String st=JOptionPane.showInputDialog("문자열 입력"); //popup dialog window 띄우고 입력한 문자열을 st에 대입
				if (stop==true) break;//만약 stop이 true이면 while문 빠져나가서 종료
		
				System.out.println("<"+st+">을 입력하셨습니다.");
				if(st.equals(sharedArea.randStr))  //공동구역의 randStr과 입력한 st의 문자열이 같으면
				{
					sharedArea.end=2; //sharedArea의 멤버변수 end에 2를 대입(성공을 의미)
					break; //while문 빠져나가기
				}
			}
		}
}

