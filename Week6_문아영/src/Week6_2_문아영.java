import java.util.Scanner;
public class Week6_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
			
		int num=1; //선택할 번호를 입력받을 변수 저장. while문의 조건에 충족하기 위해 5가 아닌 정수 대입.
		
		Emergency eg=new Emergency(); //Emergency객체 생성 참조변수를 eg라고 둠.
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		while(num!=5) { //num이 5가 아니면 while문 반복.
			System.out.println("What kind of Emergency?");
			System.out.println("1.Fire   2.Patient   3.Thief   4.Record   5.End");
			num=kbd.nextInt();//입력받은 정수 num에 저장
			
			switch(num) { 
			case 1: //num이 1일 때
				FireEngine fe=new FireEngine(); //참조 변수를 fe로 한 FireEngine 객체 생성한다 
				eg.EM_Call(fe);//Emergency클래스의 EM_Call 메서드 호출
				break;
			case 2:
				Ambulance ab=new Ambulance();//case1과 같이 아래 반복.
				eg.EM_Call(ab);
				break;
			case 3:
				PoliceCar pc=new PoliceCar(); 
				eg.EM_Call(pc);
				break;
			case 4: //num이 4일 때, 반복해서 선택한 리스트를 나열.
				eg.EM_record(); //Emergency클래스의 EM_record메서드 호출
				break;
			case 5: //num이 5이면 밑의 문장 수행하고 while문 빠져나감
				System.out.println("Finished");
				break;
			default: //num이 1~5가 아닌 다른 정수이면 
				System.out.println("Wrong Input"); 
				break;
			}
   }

}
}