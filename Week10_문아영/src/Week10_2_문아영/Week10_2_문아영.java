package Week10_2_문아영;
import java.util.*;
public class Week10_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Map<String,String> students=new HashMap<String,String>(); //HashMap 객체 생성
		Scanner kbd=new Scanner(System.in);//Scanner 객체 생성
		
		String id,name;
		String id_k; //key로 저장할 변수 선언
		int maxLength=0; //가장 긴 이름의 길이를 저장할 변수 선언, 일단 0으로 초기화
		int minLength=0; //가장 짧은 이름의 길이를 저장할 변수 선언,일단 0으로 초기화
		String maxID=null; //가장 긴 이름의 ID 변수 선언
		String minID=null; //가장 짧은 이름의 ID 변수 선언
		int student_cnt=0; //학생 수인 student_cnt 선언 및 0으로 초기화
		
		
		System.out.println("학생의 ID와 이름을 차례로 입력하세요. (종료시 0 0 입력)");
		while(true)
		{
			id=kbd.next();
			name=kbd.next();
			if(id.equals("0") && name.equals("0")) break; // 0 0 입력받으면 반복문 종료
			students.put(id,name);
			maxLength=name.length(); //0 0입력받기 전 마지막으로 넣은id와 name을 maxLength와 minLength로 저장(0이 아닌 실제 입력받은 것으로 저장하기 위해)
			minLength=name.length();
			maxID=id; //maxID와 minID또한 실제 입력받은 것을 저장함(null을 출력하지 않기 위해)
			minID=id;
		}
		System.out.println("<학생명단>");
		System.out.println("[ID]\t\t\t\t\t[NAME]");
		
		Set set=students.keySet(); //key값의 set를 만듬
		Iterator<String> it=set.iterator(); //iterator 인스턴스를 생성
		
		while(it.hasNext()) 
		{
			student_cnt++; //while문이 반복되면 학생수 +1씩
			id_k=it.next(); //id_k는 key이다(즉, 아이디를 말함)
			if(students.get(id_k).length()>maxLength) //maxLength보다 값(이름)의 길이가 크면
			{
				maxLength=students.get(id_k).length(); //maxLength를 그 값(이름)의 길이로 저장, get메서드를 이용해 키의 값 반환, length메서드는 String형의 길이를 반환
				maxID=id_k; //그때의 key를 maxID로 저장
			}
			else if(students.get(id_k).length()<minLength)//minLength보다 값(이름)의 길이가 작으면
			{
				minLength=students.get(id_k).length(); //minLength를 그 값(이름)의 길이로 저장
				minID=id_k; //그때의 key를 minID로 저장
			}
			System.out.println(id_k+"\t\t\t\t\t"+students.get(id_k)); //키와 값을 출력
		}
		System.out.print("\n전체 학생수:");
		System.out.println(student_cnt); //전체학생수 출력
		
		System.out.println("<가장 긴 이름을 가진 학생>");
		System.out.println("ID:"+maxID+"   Name:"+students.get(maxID)+"   길이:"+maxLength); 
		System.out.println("<가장 짧은 이름을 가진 학생>");
		System.out.println("ID:"+minID+"   Name:"+students.get(minID)+"   길이:"+minLength);

		kbd.close(); //kbd 닫음
	}
	

}
