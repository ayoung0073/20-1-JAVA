package Week12_1_문아영;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CatchFrame extends JFrame{ //JFrame을 상속받은 CatchFrame
	private JButton button; //inner 클래스에서 button을 참조하므로 생성자밖에서 선언을 해놓는다.
	
	public CatchFrame() //CatchFrame 생성자
	{
	this.setTitle("나 잡아봐~라! - 문아영"); 
	
	this.setSize(300,300);
	this.setResizable(false); //크기 조절 x
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫으면 프로그램도 함께 종료
	JPanel panel=new JPanel(); //패널 생성
	button=new JButton("Click!"); //텍스트가 "Click!"인 버튼 생성
	button.addMouseListener(new CatchListener()); //버튼에 이벤트 리스너 CatchListener 등록
	panel.add(button); //패널에 버튼 담음
	this.add(panel); //프레임에 패널 담음
	this.setVisible(true); //창 보이게 함
	}
	
	private class CatchListener extends MouseAdapter{ //MouseAdapter을 상속받은 CatchListener 클래스
		public void mouseEntered(MouseEvent e) 
		{
			if (e.getSource()==button) //마우스가 버튼영역안에 들어오면
			{
				int x=(int)(Math.random()*200); //x,y를 0~199의 랜덤 정수를 대입
				int y=(int)(Math.random()*200);
				button.setLocation(x,y); //버튼을(x,y)좌표로 위치하게 함.
				System.out.println("x="+x+",\ty="+y); //그 (x,y)좌표 정보를 콘솔창에 출력
			}
		}
		public void mouseClicked(MouseEvent e) 
		{
			if (e.getSource()==button) //마우스가 버튼영역을 클릭하면
			{
				System.out.println("윽,,,잡혔다ㅠㅠ"); //콘솔창에 "윽,,,잡혔다ㅠㅠ"출력
			}
		}
	}
}