package HW2_5_문아영;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Name extends JFrame{
	private JButton button; //inner클래스에서 참조하기 위해 선언해놓음
	private int num_k,num_l,num_p,num_etc; //위와 같은 이유
	private JTextField fid_k,fid_l,fid_p,fid_etc;
	String wrong_text="";
	
	public Name()
	{	
		Toolkit tk=getToolkit(); //Component에 정의된 getToolkit()메서드 호출
		Dimension d=tk.getScreenSize(); //screen의 가로 세로 크기를 얻어옴
		int screenHeight=d.height;
		int screenWidth=d.width;
		setSize(600,500);
		setLocation(screenWidth/2-this.getWidth()/2,screenHeight/2-this.getHeight()/2); //frame이 화면의 정중앙에 위치하게 함
		setResizable(false); //창크기 조절x
		setTitle("Pie Chart of Student names - 문아영");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫으면 프로그램 함께 종료
		
		JPanel center_panel=new JPanel(); //차트와 오류메시지를 그릴 center_panel생성
		center_panel.setLayout(new BorderLayout()); //center_panel을 BorderLayout으로 레이아웃 설정
		JPanel south_panel=new JPanel(); //레이아웃 기본값 flowLayout으로 south_panel 생성
		
		Chart c=new Chart(); //Chart 인스턴스 생성
		
		JLabel lbl_k=new JLabel("Kim"); //Kim 라벨 생성
		fid_k=new JTextField(5); //Kim의 수를 입력할 텍스트필드 생성
		JLabel lbl_l=new JLabel("Lee"); //위와 같이 아래 반복 //Lee
		fid_l=new JTextField(5);
		JLabel lbl_p=new JLabel("Park"); //Park
		fid_p=new JTextField(5);
		JLabel lbl_etc=new JLabel("Etc"); //나머지(Etc)
		fid_etc=new JTextField(5);
		
		button=new JButton("Graph"); //"Graph"를 이름으로 하는 버튼 생성
		button.addActionListener(new ChartListener());
		
		center_panel.add(c); //center_panel에 Chart 담기
		
		south_panel.add(lbl_k); //south_panel에 Kim 라벨 담기
		south_panel.add(fid_k); //south_panel에 Kim 텍스트필드 담기
		south_panel.add(lbl_l);  //위와 같이 아래 반복
		south_panel.add(fid_l); 
		south_panel.add(lbl_p); 
		south_panel.add(fid_p);
		south_panel.add(lbl_etc); 
		south_panel.add(fid_etc);
		south_panel.add(button); //south_panel에 버튼 담기
		
		add(center_panel,BorderLayout.CENTER); //프레임의 CENTER에 center_panel 담기
		add(south_panel,BorderLayout.SOUTH); //프레임의 SOUTH에 south_panel 담기
		
		setVisible(true); //창이 보이게 함

	}
	private class Chart extends JComponent{ //center_panel에 담을 차트
		public void paint(Graphics g)
		{
			g.setColor(Color.WHITE);//펜의 색깔 화이트로
			g.fillRect(0, 0, 600, 500); //Center panel 흰색으로 칠함
			
			g.setColor(Color.BLACK); //펜의 색깔 블랙으로
			g.drawString(wrong_text, 200, 400); //입력값이 틀렸을 경우 문자열(오류 메세지) 그림
			g.setColor(Color.YELLOW); //펜의 색깔 yellow로
			g.fillArc(170, 150, 150,150, 0, (int)(num_k*3.6)); //Kim 수비율을 호로 채워그림.
			g.drawString("YELLOW: KIMs", 380, 200); // 차트의 오른쪽에 Kim에 대한 문자열 그림
			g.setColor(Color.RED); //위와 같이 아래 반복
			g.fillArc(170, 150,150,150, (int)(num_k*3.6), (int)(num_l*3.6)); //그려진 Kim 호를 이어서 Lee 수비율 호로 채워 그림.
			g.drawString("RED: LEEs", 380, 220);
			g.setColor(Color.BLUE);
			g.fillArc(170, 150, 150,150,  (int)(num_k*3.6)+(int)(num_l*3.6), (int)(num_p*3.6));
			g.drawString("BLUE: PARKs", 380, 240);
			g.setColor(Color.GREEN);
			g.fillArc(170, 150, 150,150, (int)(num_k*3.6)+(int)(num_l*3.6)+(int)(num_p*3.6), (int)(num_etc*3.6));
			g.drawString("GREEN: Etc.", 380, 260);
		}
	}
	
	private class ChartListener implements ActionListener{ //ActionListener을 구현한 ChartListener클래스
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button) //버튼 클릭할 때
			{
				try //예외상황 발생할 수 있는 문장들을 넣음
				{
					num_k=Integer.parseInt(fid_k.getText()); //텍스트필드의 값을 정수로 바꿔서 num_k에 저장 // 못바꾸는 경우NumberFormatException 발생
					num_l=Integer.parseInt(fid_l.getText()); //위와 같이 아래 반복
					num_p=Integer.parseInt(fid_p.getText());
					
					if(num_k+num_l+num_p<=100&&num_k+num_l+num_p>=0) //세값의 합이 100이하 0이상인경우
					{
						num_etc=100-(num_k+num_l+num_p);
						fid_etc.setText(Integer.toString(num_etc));
						repaint();
						
					}
					else if(num_k+num_l+num_p>100) throw new Exception("Number of students is 100."); //세값의 합이100초과한경우 예외상황 발생시킴
					else throw new Exception("Input numbers of student names"); //음수인 경우 예외상황 발생시킴
				}
				catch(NumberFormatException e1) //입력값이 숫자 형태가 아닌 경우
				{
					wrong_text="Input numbers of student names";
					num_k=0; //성별의 수들을 0으로 
					num_l=0;
					num_p=0;
					num_etc=0;
					fid_k.setText(Integer.toString(0)); //텍스트필드도 다 0으로 수정
					fid_l.setText(Integer.toString(0));
					fid_p.setText(Integer.toString(0));
					fid_etc.setText(Integer.toString(0));
					repaint();
				}
				catch(Exception e2) //세 값의 합이 100을 초과한 경우나, 음수를 입력한 경우
				{
					wrong_text=e2.getMessage(); 
					num_k=0; //성별의 개수들을 0으로 다시 설정
					num_l=0;
					num_p=0;
					num_etc=0;
					fid_k.setText(Integer.toString(0)); //텍스트 필드로 다 0으로 수정
					fid_l.setText(Integer.toString(0));
					fid_p.setText(Integer.toString(0));
					fid_etc.setText(Integer.toString(0));
					repaint(); //변화를 주기 위해 repaint()호출
				}
				
			}
		}
	}
}
