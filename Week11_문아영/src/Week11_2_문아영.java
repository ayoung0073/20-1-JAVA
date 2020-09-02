import java.awt.*;
import javax.swing.*;

class StuFrame extends JFrame{ //JFrame클래스를 상속받은 StuFrame클래스
	public StuFrame() //StuFrame 생성자
	{
		setTitle("Student Information"); //제목설정 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 누름과 동시에 프로그램 종료하게 메서드 설정
		setSize(350,200); //창사이즈 설정
		setResizable(false); //창 사이즈조절 가능하지 못하게 하는 메서드
		
		JPanel t_panel=new JPanel(); //다른 component담을 수 있는 container(panel) 생성.
		t_panel.setLayout(new BorderLayout()); //t_panel의 레이아웃을 BorderLayouy으로 설정
		
		JPanel onPanel=new JPanel(); //t_panel가 담을 onPanel (t_panel의 NORTH부분에 담을 패널)
		JLabel titleLB=new JLabel("STUDENT INFORMATION"); //제목Label 생성
		t_panel.add(onPanel,BorderLayout.NORTH); //t_panel의 NORTH부분에 onPanel을 추가(담음)
		onPanel.add(titleLB); //onPanel에 제목레이블(Component) 추가
	
		JPanel panel=new JPanel();//t_panel가 담을 또 다른 panel
		panel.setLayout(new GridLayout(0,2)); //column을 2로 설정해 row가 자동 조절하도록 만듬.
		
		JLabel nameLB=new JLabel("NAME"); //이름Label 생성
		JTextField nameFD=new JTextField(); //이름 텍스트필드 생성
		nameFD.setHorizontalAlignment(JTextField.LEFT); //텍스트필드에 데이터 입력 시 왼쪽에 나타나게 함
		
		JLabel genderLB=new JLabel("GENDER"); //성별레이블 생성
		JRadioButton mButton=new JRadioButton("Male"); //텍스트가 "Male"인 라디오버튼 생성
		JRadioButton fButton=new JRadioButton("Female",true); //텍스트가 "Female"이고 초기상태에 "Female"이 선택되도록 라디오 버튼 생성
		ButtonGroup bg=new ButtonGroup(); 
		bg.add(mButton); //mButton과 fButton을 그룹으로 설정
		bg.add(fButton);
		
		JLabel idLB=new JLabel("ID"); //ID레이블 생성
		JTextField idFD=new JTextField(); //ID 텍스트 필드 생성
		
		JLabel dpmLB=new JLabel("DEPARTMENT"); //부서레이블 생성
		JTextField dpmFD=new JTextField(); //부서 텍스트 필드 생성
		
		panel.add(nameLB); //panel에 이름레이블 추가(담음)
		panel.add(nameFD); //위와같이 아래 반복
		panel.add(genderLB);
		

		JPanel genderPanel=new JPanel(); //genderPanel 생성
		genderPanel.add(mButton); //genderPanel에 mButton 담음(추가)
		genderPanel.add(fButton); //genderPanel에 fButton 담음(추가)
		panel.add(genderPanel); //panel에 genderPanel담음
		
		panel.add(idLB); //panel에 ID레이블 담음
		panel.add(idFD); //위와 같이 아래 반복
		panel.add(dpmLB);
		panel.add(dpmFD);
		
		add(t_panel); //프레임에 t_panel추가
		
	
		t_panel.add(panel); //t_panel에 panel 담음

		JPanel downPanel=new JPanel(); //panel생성(t_panel의 SOUTH부분에 담을 panel)
		
		JButton saveBT=new JButton("Save"); //텍스트가 "Save"인 button 생성
		JButton cancelBT=new JButton("Cancel"); //텍스트가 "Cancel"인   button 생성
		
		t_panel.add(downPanel,BorderLayout.SOUTH); //t_panel의 SOUTH부분에 downPanel 추가 
		
		downPanel.add(saveBT); //downPanel에 저장버튼 추가
		downPanel.add(cancelBT); //downPanel에 취소버튼 추가
		
		pack(); //component를 제외한 여백을 최소화시킴
		setVisible(true); //창을 보이게 함
		
	}
}
public class Week11_2_문아영 {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		StuFrame sf=new StuFrame();//StuFrame을 이용하여 인스턴스 생성
	}

}
