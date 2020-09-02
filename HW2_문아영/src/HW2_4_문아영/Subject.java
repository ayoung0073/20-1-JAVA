package HW2_4_문아영;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Subject extends JFrame{ //JFrame을 상속받은 Subject
	private JButton button; //inner클래스에서 참조하기 때문에 선언해놓음
	private int kor_scr,eng_scr,math_scr;
	JTextField kor_fid,eng_fid,math_fid;
	String wrong_text=""; //잘못 입력했을때 나타낼 문자열 선언

	public Subject() //Subject클래스 생성자
	{
		Toolkit tk=getToolkit(); //Component에 정의된 getToolkit()메서드 호출
		Dimension d=tk.getScreenSize(); //screen의 가로 세로 크기를 얻어옴
		int screenHeight=d.height;
		int screenWidth=d.width;
		setSize(600,500); //창 사이즈 설정
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame이 화면의 정중앙에 위치하게 함
		setTitle("Score Graph");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 끄면 프로그램 종료되게 하는 메서드
	    setResizable(false); //창 크기조정할 수 없게 만듬
	    
		JPanel t_panel=new JPanel(); // 다른 component담을 수 있는 container(panel) 생성.
		JPanel graph_panel=new JPanel(); //그래프를 담을 panel 생성
		JPanel score_panel=new JPanel(); //점수를 입력하는 panel 생성 레이아웃기본값(FlowLayout)
		
		t_panel.setLayout(new BorderLayout()); //t_panel의 레이아웃을 BorderLayout으로 설정
		graph_panel.setLayout(new BorderLayout()); //graph_panel의 레이아웃을 BorderLayout으로 설정
		
		JLabel kor_lbl=new JLabel("Kor"); //텍스트가 "Kor"인 라벨 생성
		JLabel eng_lbl=new JLabel("Eng"); //텍스트가 "Eng"인 라벨 생성
		JLabel math_lbl=new JLabel("Math"); //텍스트가 "Math"인 라벨 생성
		
		kor_fid=new JTextField(4); //국어 점수 입력할 텍스트 필드 생성
		eng_fid=new JTextField(4); //영어 점수 입력할 텍스트 필드 생성
		math_fid=new JTextField(4); //수학 점수 입력할 텍스트 필드 생성
		
		button=new JButton("Show Graph"); //텍스트가 "Show Graph"인 버튼 생성
		button.addActionListener(new GraphListener()); //버튼에 이벤트리스너(이너클래스)인 GraphListener등록
		
		Graph g=new Graph(); //Graph 클래스 인스턴스 생성
		graph_panel.add(g); //graph_panel에 g(그래프클래스 참조변수)담음
		
		score_panel.add(kor_lbl);//score_panel에 국어 라벨 담음
		score_panel.add(kor_fid); //scor_panel에 국어텍스트 필드 담음
		score_panel.add(eng_lbl); //위와 같이 아래 반복
		score_panel.add(eng_fid);
		score_panel.add(math_lbl);
		score_panel.add(math_fid);
		score_panel.add(button); //score_panel에 button담음
		
		t_panel.add(graph_panel,BorderLayout.CENTER); //t_panel의 CENTER에 graph_panel담음
		t_panel.add(score_panel,BorderLayout.SOUTH); //t_panel의 밑에 score_panel 담음
		
		add(t_panel); //프레임에 t_panel담음
		
		setVisible(true); //창이 보이게 함
	}
	
	private class Graph extends JPanel{
		private static final int x=100;
		private static final int y=380;
		
		public void paint(Graphics g)
		{
			g.setColor(Color.WHITE); //펜의 색깔 흰색으로 지정
			g.fillRect(0, 0, 600, 500); //graph_panel전체 흰색으로 칠함
			
			g.setColor(Color.black); //펜의 색깔 검정색으로 지정
			
			g.drawString(wrong_text,280 , 50); //wrong_text 문자열그림
			g.drawString("KOR",195,400); //"KOR"문자열 그림
			g.drawString("ENG",295,400); //위와 같이 아래 반복
			g.drawString("MATH",395,400);
			
			for(int i=0;i<11;i++) //그래프 가로선(11개) 그리기
			{
				g.drawLine(x,y-i*30,x+400,y-i*30);	//가로선끼리의 너비 30으로 맞춤
			}
			g.drawLine(x,y,x,y-310); //y축 그리기
			for(int i=1;i<=10;i++) //y축 기준점(10,20,30, ..., 100) 그리기
			{
				int temp=10*i;
				g.drawString(Integer.toString(temp),x-22,y-i*30);
			}
			

			g.setColor(Color.RED); //펜의 색깔 빨간색으로 지정
			g.fillRect(204,80+3*(100-kor_scr),6,300-3*(100-kor_scr)); //국어점수 그래프 그림
		    g.fillRect(304,80+3*(100-eng_scr),6,300-3*(100-eng_scr)); //영어 점수 그래프 그림
		    g.fillRect(407,80+3*(100-math_scr),6,300-3*(100-math_scr)); //수학점수 그래프 그림
		}
	}
	
	private class GraphListener implements ActionListener{  //ActionListener을 구현한 GraphListener클래스
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button) //버튼 클릭하면
			{
				try //예외상황 발생할 수 있는 문장들을 넣음
				{
					kor_scr=Integer.parseInt(kor_fid.getText());
					eng_scr=Integer.parseInt(eng_fid.getText());
					math_scr=Integer.parseInt(math_fid.getText());
					
					if(!(kor_scr>=0 && kor_scr<=100)||!(eng_scr>=0&&eng_scr<=100)||!(math_scr>=0&&math_scr<=100))
					{//각 점수들이 0이상 100이하가 아닌 경우 예외상황 발생시킴
						throw new Exception();
					}
					else //0이상 100이하인 경우
					{
						repaint(); //변화를 주기 위해 repaint()호출
						wrong_text=""; //wrong_text는 빈칸으로 설정
					}
				}
				catch(Exception e1) //입력값이 숫자형태가 아니거나 각 점수들이 0이상 100이하가 아닌 경우
				{
					wrong_text="Wrong Input"; //worng_text에 "Wrong Input"저장
					kor_scr=0; //각 점수들 0으로 초기화
					eng_scr=0;
					math_scr=0;
					repaint(); //변화를 주기 위해 repaint호출

				}					
			}
			}
		}
	}

