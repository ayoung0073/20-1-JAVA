package HW2_3_문아영;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	private JButton button_new; //"New" 버튼, inner클래스에서 참조할 수 있도록 선언 먼저 해놓음
    private JButton button[]=new JButton[15]; //JButton클래스형 배열만듬
	private JTextField field; //계산기 텍스트필드 선언
	
	int index=0;
	
	String cal[]=new String[3];

	
	int cal_i=0;//계산순서말함 0,1,2
	
	int result=0; //result값 선언
	double divide_result=0; //나누었을 때(/) 따로 result값 선언
	
	public Calculator()
	{
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 끄면 프로그램 종료되게 하는 메서드
		setSize(300,200); //창 사이즈 설정
	    setResizable(false); //창 크기조정할 수 없게 만듬
		
		JPanel t_panel=new JPanel(); // 다른 component담을 수 있는 container(panel) 생성.
		JPanel panel=new JPanel(); //t_panel가 담을 또 다른 panel->계산기 두드릴 영역
		t_panel.setLayout(new BorderLayout()); //t_panel의 레이아웃을 BorderLayout으로 설정
		panel.setLayout(new GridLayout(0,4)); //panel의 레이아웃을 Grid으로 설정. column을 4로 설정해 row가 자동 조절하게 만들도록 함.
		
		makeButton("7",panel);//String형과 JPanel형을 인자로 받는 makeButton메서드 호출
		makeButton("8",panel);//위와 같이 아래 반복
		makeButton("9",panel);
		makeButton("/",panel);
		makeButton("4",panel);
		makeButton("5",panel);
		makeButton("6",panel);
		makeButton("*",panel);
		makeButton("1",panel);
		makeButton("2",panel);
		makeButton("3",panel);
		makeButton("-",panel);
		makeButton("New",panel);
		makeButton("0",panel);
		makeButton("=",panel);
		makeButton("+",panel);
		
		
		field=new JTextField(); //t_panel의 NORTH부분에 담을 텍스트 영역 인스턴스 생성 참조변수: field
		field.setHorizontalAlignment(JTextField.RIGHT); //데이터 입력 시 오른쪽에 나타나게 함
		
		add(t_panel); //프레임에 t_panel추가
		
		t_panel.add(field,BorderLayout.NORTH); //t_panel의 NORTH부분에 텍스트영역(field)추가(담음)
		t_panel.add(panel,BorderLayout.CENTER); //t_panel의 CENTER부분에 panel 추가 (담음)
		
		setVisible(true); //창을 보이게 함
	}
	
	public void makeButton(String text,JPanel panel)  //String형 text와 JPanel형 panel을 인자로 받음
	{
		if (text.equals("New")) //text가 "New"이면
		{
			button_new=new JButton(text); //텍스트가 "New"인 버튼 button_new 생성
			button_new.addMouseListener(new CalcListener()); //button_new버튼에 이벤트리스너인 CalcListener 등록
			panel.add(button_new); //panel에 button_new담음
		}
		else
		{
			button[index]=new JButton(text); //text문자열과 함께 버튼 생성
			button[index].setAlignmentX(CENTER_ALIGNMENT); //x축(가로)를 가운데 정렬로 함
			button[index].addMouseListener(new CalcListener()); //button[index]버튼에 이벤트리스너인 CalcListener 등록
			panel.add(button[index]); //panel에 button[index] 담음
			index++; //index에 1더하기
		}

	}
	
	private class CalcListener extends MouseAdapter //MouseAdapter클래스를 상속받은 CalcListener
	{
		public void mouseClicked(MouseEvent e) 
		{
			try
			{
			if(e.getSource()==button_new) //button_new버튼을 클릭할 때
			{
				field.setText(""); //텍스트필드를 빈칸으로 설정
				
				cal[0]=""; //String형 cal[0] 인스턴스 생성
				cal[1]="";//String형 cal[1] 인스턴스 생성
				cal[2]="";//String형 cal[2] 인스턴스 생성
				
				cal_i=0; //cal_i도 0으로 초기화
			}
			else 
			{
				for(int i=0;i<15;i++) //button 배열 수만큼 for문 반복
				{
					if(e.getSource()==button[i]) //button[i]를 클릭한 경우
					{
						if(i==3||i==7||i==11||i==13||i==14) //만약 button[i]의 텍스트가 "/","*","-","=","+"인 경우
						{
							if(i==13) //"=" 버튼 클릭하면
							{
								int int1=Integer.parseInt(cal[0]); //고른 숫자 중 첫번째 고른수를 int1에 저장
								int int2=Integer.parseInt(cal[2]); //고른 숫자 중두번째 고른 수를 int2에 저장
								if(cal[1].equals("+")) //만약 고른 연산자가 "+"이면
								{
									result=int1+int2; //더해줌
								}
								else if(cal[1].equals("-")) //만약 고른 연산자가 "-"이면
								{
									result=int1-int2; //빼줌
								}
								else if(cal[1].equals("*")) //만약 고른 연산자가 "*"이면
								{
									result=int1*int2; //곱해줌
								}
								else if(cal[1].equals("/")) //만약 고른 연산자가 "/"이면
								{
									divide_result=(double)int1/int2; //divide_result에 나눈값 저장(float형)
									field.setText(Double.toString(divide_result)); //그 결과를 텍스트필드에 문자열로 바꿔서 지정함
									break; //for문 종료
								}
								field.setText(Integer.toString(result)); //나눗셈이 아닌 경우 정수를 텍스트필드에 문자열로 바꿔서 저장함
								break; //for문 빠져나감
							}
							
							else //"="가 아닌 다른 연산자를 클릭했을 경우
							{
						    cal[cal_i]=button[i].getText(); //그 연산자를 cal의 cal_i번째인덱스값에 저장
							cal_i++; 
							break; //for문 빠져나감
							}
						}
						else//button[i]가 숫자를 선택하면
						{
							field.setText(button[i].getText());//그 숫자(문자열형태)를 cal의 cal_i번째인덱스값에 저장
							cal[cal_i]=button[i].getText();//인덱스 +1 해줌
							cal_i++;
							break;//for문 빠져나감
						}	
					}
				}
			}
		}
			catch(Exception e1) //문제에 주어진대로 순서대로 클릭 안할시.
			{
				System.out.println("잘못 클릭함");
			}
	}
	}
		
	}
		


