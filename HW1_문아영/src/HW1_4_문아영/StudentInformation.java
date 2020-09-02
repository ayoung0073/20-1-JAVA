package HW1_4_문아영;

public class StudentInformation { //조상클래스 StudentInformation
	private String name; //인스턴스변수 name private으로 선언(상속x)
	private String id; //인스턴스변수 id private으로 선언(상속x)
	
	public void setName(String name) { //name이 외부클래스에서 직접적으로 접근할 수 없기 때문에 setName메서드를 이용해서 외부클래스에서 name지정할 수 있게 함
		this.name=name;
	}
	public void setId(String id) {//id가 외부클래스에서 직접적으로 접근할 수 없기 때문에 setId메서드를 이용해서 외부클래스에서 id 지정할 수 있게 함
		this.id=id;
	}
	
	public String getName() { //인스턴스 변수 name을 외부클래스에서 참조할 수 있도록 메서드 만듬
		return name;
	}
	
	public String getId() { //인스턴스 변수 id를 외부클래스에서 참조할 수 있는 메서드 구현.
		return id;
	}
	
	public void display() { //name과 id 정보 출력해주는 메서드
		System.out.print(name+"\t"+id+"\t"); //마지막문장에 "\t"를 하면 자손클래스에서 오버라이딩할 때 tab됨
	}
}
