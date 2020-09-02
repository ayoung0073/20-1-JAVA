package Week10_1_문아영;
import java.util.*;
public class Week10_1_문아영 {
	static Scanner kbd=new Scanner(System.in); //Scanner객체 static으로 생성
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		ArrayList<Student> studentList=new ArrayList<Student>(); //Student클래스형 ArrayList 생성
	
		int index=0; //studenList 배열의 index
		int selectNum=1; //입력받을  번호(1~4 중)
		
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");		
		try { //예외가 발생할 수 있는 문장들 넣음
		while(true)
		{
			String name=kbd.next();
			if (name.equals("0")) break; //만약 입력받는 이름이"0"이면 while문 빠져나가서 입력 그만 받음
			else //"0"이 아니면
			{
				studentList.add(index,new Student(name,kbd.next(),kbd.nextInt())); //3개의 인수가 있는 Student생성자를 이용해 입력받고 ArrayList배열의 index위치에 저장
				
				index++; //다음 배열의 index
			}

		}
		System.out.println("NUMBER\tNAME\t\tID\t\t\t\tAGE");
		printResult(studentList); //리스트 보여주는 static 메서드 printResult호출
		
		while(selectNum!=4) //4번(종료)을 입력받지 않으면 반복문 돌기.
		{
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information   2.delete information   3.show list   4.Finish program");
			selectNum=kbd.nextInt();
			if(selectNum==1) //1번 선택할 때
			{
				addStudent(studentList); //student를 추가하는 addStudent메서드 호출
			}
			else if(selectNum==2) //2번 선택할 때
			{
				deleteStudent(studentList); //student를 삭제하는 deleteStudent메서드 호출
			}
			else if(selectNum==3) //3번 선택할 때
			{
				System.out.println("NUMBER\tNAME\t\tID\t\t\t\tAGE");
				printResult(studentList); //printResult 메서드 호출
			}
			else if(selectNum==4); //4번을 선택하면 반복문 종료
			else System.out.println("Wrong input."); //1,2,3,4가 아닌 게 입력되면 "Wrong input"을 출력하고 반복문 다시 돌기
		}
		kbd.close();
	}catch(Exception e) { //Exception발생하면
		System.out.println("Exception\n"); //Exception 출력
	}
	}
	
	public static void printResult(List<Student> studentList) throws Exception //리스트 보여주는 메서드 구현
	{
		for(int i=0;i<studentList.size();i++) //studentList의 배열 개수만큼 for문 반복
		{
			System.out.println((i+1)+"\t\t\t"+studentList.get(i).name+"\t\t"+studentList.get(i).id+"\t\t"+studentList.get(i).age); //인덱스가 i인 List의 element의 name, id, age 출력
		}
	}
	
	public static void deleteStudent(List<Student> studentList) throws Exception //student를 삭제하는 메서드 구현
	{
		System.out.println("Input Student Number to delete.");
		int deleteNum=kbd.nextInt(); //삭제할 학생의 번호 입력하기
		studentList.remove(studentList.get(deleteNum-1)); //인덱스는 0부터 시작하므로 -1해서 studentList의 deleteNum-1 위치의 element 삭제
		printResult(studentList);//삭제 후 student의 리스트를 보여줌
		
	}
	
	public static void addStudent(List<Student> studentList) throws Exception //student를 추가하는 메서드 구현
	{
		System.out.println("Input new Student Name, ID, and age, and the location");
		Student newStudent=new Student(kbd.next(),kbd.next(),kbd.nextInt()); //3개의 인수가 있는 생성자를 이용해 입력받아 Student 인스턴스 생성 (참조변수:newStudent)
		int newIndex=kbd.nextInt()-1; //추가할 위치번호를 입력받음(-1을 하는 이유는 배열의 인덱스는 0부터 시작하기때문이다)
		studentList.add(newIndex,newStudent); //List의 add메서드를 이용해 배열 추가
		printResult(studentList); //리스트를 보여주는 메서드 호출
		
	}
	
}
