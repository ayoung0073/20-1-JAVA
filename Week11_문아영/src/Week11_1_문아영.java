import java.awt.*;
import javax.swing.*;

class CalFrame extends JFrame{ //JPrame클래스를 상속받은 CalFrame클래스
	public CalFrame() //CalFrame 생성자
	{
		setTitle("Calculator"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 끄면 프로그램 종료되게 하는 메서드
		setSize(300,200); //창 사이즈 설정
		setResizable(false); //창 크기조정할 수 없게 만듬
		
		JPanel t_panel=new JPanel(); //다른 component담을 수 있는 container(panel) 생성.
		t_panel.setLayout(new BorderLayout()); //t_panel의 레이아웃을 BorderLayout으로 설정
		
		JPanel panel=new JPanel(); //t_panel가 담을 또 다른 panel->계산기 두드릴 영역
		panel.setLayout(new GridLayout(0,4)); //panel의 레이아웃을 Grid으로 설정. column을 4로 설정해 row가 자동 조절하게 만들도록 함.
		makeButton("ON",panel); //String형과 JPanel형을 인수로 받는 makeButton메서드 호출
		makeButton("AC",panel); //위와 같이 아래 반복
		makeButton("C",panel);
		makeButton("OFF",panel);
		makeButton("7",panel);
		makeButton("8",panel);
		makeButton("9",panel);
		makeButton("/",panel);
		makeButton("4",panel);
		makeButton("5",panel);
		makeButton("6",panel);
		makeButton("X",panel);
		makeButton("1",panel);
		makeButton("2",panel);
		makeButton("3",panel);
		makeButton("-",panel);
		makeButton("0",panel);
		makeButton(".",panel);
		makeButton("=",panel);
		makeButton("+",panel);
		
		JTextField field=new JTextField(); //t_panel의 NORTH부분에 담을 텍스트 영역 인스턴스 생성 참조변수: field
		field.setHorizontalAlignment(JTextField.RIGHT); //데이터 입력 시 오른쪽에 나타나게 함
		
		add(t_panel); //프레임에 t_panel추가
		
		t_panel.add(field,BorderLayout.NORTH); //t_panel의 NORTH부분에 텍스트영역(field)추가(담음)
		t_panel.add(panel,BorderLayout.CENTER); //t_panel의 CENTER부분에 panel 추가 (담음)
		
		setVisible(true); //창을 보이게 함
	}
	public void makeButton(String text,JPanel panel)  //String형 text와 JPanel형 panel을 인수로 받음
	{
		JButton button=new JButton(text); //text문자열과 함께 버튼 생성
		button.setAlignmentX(CENTER_ALIGNMENT); //x축(가로)를 가운데 정렬로 함
		panel.add(button); //panel위에 button 추가(담음)
	}
}


public class Week11_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		CalFrame cf=new CalFrame(); //CalFrame을 이용하여 인스턴스 생성

	}
}
