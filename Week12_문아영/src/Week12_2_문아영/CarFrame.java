package Week12_2_문아영;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CarFrame extends JFrame { //JFrame을 상속받은 CarFrame
	Color wc=Color.red; //자동차윗부분색깔(바꿔질색깔), inner클래스에서 참조해야함. 기본값: red
	private JButton button; //inner클래스에서 참조해야하기때문에 선언해놓음
	private JRadioButton red; //위와 같이 아래반복
	private JRadioButton green;
	private JRadioButton blue;
	
	public CarFrame() //CarFrame생성자
	{
		Toolkit tk=getToolkit(); //Component에 정의된 getToolkit()메서드 호출
		Dimension d=tk.getScreenSize(); //screen의 가로 세로 크기를 얻어옴
		int screenHeight=d.height;
		int screenWidth=d.width;
		setSize(500,350);
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame이 화면의 정중앙에 위치하게 함
		setResizable(false); //창크기 조절x
		setTitle("MyCar -  문아영");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫으면 프로그램함께 종료
		
		JPanel bottom_Panel=new JPanel(); //프레임의 South부분에 패널 생성 
		
		red=new JRadioButton("RED",true); //텍스트가 "RED"인 라디오버튼생성(기본값)
		green=new JRadioButton("GREEN");//텍스트가 "GREEN""인 라디오버튼생성
		blue=new JRadioButton("BLUE");//텍스트가 "BLUE"인 라디오버튼생성
		ButtonGroup bg=new ButtonGroup();
		bg.add(red);
		bg.add(green);
		bg.add(blue); //라디오버튼은 하나만 택해야하므로 그룹으로 묶음
		
		button=new JButton("Paint"); //텍스트가 "Paint"인 버튼 생성
		button.addActionListener(new PaintListener()); //버튼에 이벤트리스너(이너클래스에있음)인 PaintListener등록
		
		CarPanel cp=new CarPanel(); //이너클래스인 CarPanel생성
		
		bottom_Panel.add(red);   //아래패널에 라디오버튼과 버튼 담음
		bottom_Panel.add(green);
		bottom_Panel.add(blue);
		bottom_Panel.add(button);
		
		add(cp,"Center"); //CarPanel을 프레임의 Center부분에 담음
		add(bottom_Panel,"South"); //아래패널을 프레임의 South부분에 담음
		
		
		this.setVisible(true); // 창이 보이게 함
	}
	
	private class CarPanel extends JPanel{ //JPanel을 상속받은 CarPanel
		public void paint(Graphics g) //paint메서드 정의하기(오버라이딩)
		{
			g.setColor(wc); //펜의 색깔을 wc로 설정
			g.fillRect(180, 55, 140, 60); //펜으로 색깔로 자동차 상단 사각형 채우기
			g.fillRect(110, 115,280, 100);//펜으로 자동차 하단 사각형 채우기
			g.setColor(Color.lightGray); //펜의 색깔을 lightGray로 설정
			g.fillOval(140, 175, 80, 80); //펜으로 첫번째 바퀴 채움
			g.fillOval(280, 175, 80, 80); //펜으로 두번째 바퀴 채움
			g.setColor(Color.black); //펜의 색깔을 검정으로 설정
			g.drawArc(280,70,39,50,0,180); //웃는 눈(호)그리기
		}
	}
	private class PaintListener implements ActionListener{ //ActionListener을 구현한 PaintListener클래스
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button) //텍스트가 "Paint"인 버튼 클릭할 때
			{
				if(red.isSelected()) wc=Color.red; //red라디오버튼이 선택되었으면 wc를 빨간색으로 설정
				else if(green.isSelected()) wc=Color.green; //green라디오버튼이 선택되었으면 wc를 초록색으로 설정
				else if(blue.isSelected()) wc=Color.blue; //blue 라디오버튼이 선택되었으면 wc를 파란색으로 설정
			}
			repaint(); //변화를 주기위해 repaint()호출 
		}
	}
}
