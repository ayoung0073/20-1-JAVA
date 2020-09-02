import java.util.Scanner;
public class Week3_3_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		String title; 
		int page;
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		MyFile fOld=new MyFile(); //MyFile클래스형인 fOld라는 이름의 객체 생성 
		MyFile fNew=new MyFile(); //MyFile클래스형인 fNew라는 이름의 객체 생성
		
		System.out.println("--File정보입력(제목,페이지수)--");
		fOld.setTitle(kbd.nextLine()); //MyFile클래스의 메서드를 이용해서 입력받은 String(문자열)을 fOld의 title로 설정
		fOld.setPage(kbd.nextInt());//MyFile클래스의 메서드를 이용해서 입력받은 int(정수)을 fOld의 page로 설정
		fOld.fileCopy(fNew); //fOld의 정보들을 fNew에 복사
		System.out.println("<원래 File>");
		fOld.fileInfo(); //fOld의 정보 출력
		System.out.println("<복사된 File>");
		fNew.fileInfo(); //fNew의 정보를 출력
	}

}
