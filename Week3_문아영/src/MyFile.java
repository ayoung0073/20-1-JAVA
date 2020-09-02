
public class MyFile { //MyFile 클래스형 생성
	private String title; //String형인 title이라는 이름의 변수을 private으로 선언
	private int page; //int형인 page라는 이름의 변수를 private으로 선언
	
	public void setTitle(String title) { //String형 인수를 받는 setTitle 메서드 선언
		this.title=title; //인수를 이 객체의 title로 설정함
	}
	public String getTitle() { 
		return title; //이 객체의 title을 반환하는 메서드 선언
	}
	public void setPage(int page) { //int형 인수를 받으면
		this.page=page; //그 인수를 이 객체의 page로 설정한다.
	}
	public int getPage() {
		return page; //이 객체의 page를 반환하는 메서드 선언
	}
	public void fileCopy(MyFile file) {
		file.title=this.title; //이 객체의 title을 Myfile형인 file의 title로 복사함 
		file.page=this.page; //이 객체의 page를 file의 page로 복사함
	}
	public void fileInfo() { //이 객체의 정보를 출력
		System.out.println("파일제목:"+title); 
		System.out.println("페이지:"+page);
	}
}
