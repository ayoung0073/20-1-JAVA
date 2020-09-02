import java.util.Scanner;
public class Week5_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Dog[] dog=new Dog[3]; //클래스를 이용한 배열 선언
		Cat[] cat=new Cat[3];
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		
		for (int i=0;i<dog.length;i++) { //dog배열 개수(3)만큼 for문 반복
			dog[i]=new Dog();//dog i번째 인덱스에 Dog객체 생성
			int j=i+1; //인덱스는 0부터 시작하기 때문에 int형 j를 i+1로 초기화함 ex)i=0이면 <<Dog 1>>를 출력하게 함
			System.out.println("<<Dog "+j+">>");
			System.out.print("Name :"); //건너뛰지않고 입력받기 위해 print로 씀
			dog[i].setName(kbd.nextLine()); //입력받은 문자열을 Pet클래스(부모클래스)의 setName메서드를 이용해서 dog[i]의 name을 지정
			System.out.print("Age :");
			dog[i].setAge(kbd.nextInt()); //입력받을 정수를 Pet클래스의 setAge메서드를 이용해서 age지정.
			System.out.print("Weight :");
			dog[i].setWeight(kbd.nextDouble());//입력받은 double형실수를 Pet클래스의 setWeight메서드를 이용해서 weight지정
			System.out.print("BoosterShot(y/n) :"); 
			String yesOrNo=kbd.next(); //String형 참조변수 yesOrNo를 선언과 동시에 입력받을 문자열("y"or"n")를 입력받음
			if(yesOrNo.equals("y")) { //만약 yesOrNo가 "y"이면 dog[i]의 인스턴스 변수 boosterShot에 true저장
				dog[i].setBoosterShot(true);
			}
			else if(yesOrNo.equals("n")){//만약 yesOrNo가 "n"이면 dog[i]의 인스턴스 변수 boosterShot에 false저장
				dog[i].setBoosterShot(false);
			}
			kbd.nextLine(); //Enter키 가져오기
			System.out.println(); //한줄 건너뛰어서 다음 정보 입력 받기
		}
		
		for (int i=0;i<cat.length;i++) { //cat배열개수(3)만큼 for문 반복
			cat[i]=new Cat(); //cat i번째 인덱스에 Cat객체 생성
			int j=i+1;
			System.out.println("<<Cat "+j+">>"); 
			System.out.print("Name :"); //한줄 띄어쓰기 안하고 입력받기 위해 println이 아닌 print씀
			cat[i].setName(kbd.nextLine());//입력받은 문자열을 Pet클래스(부모클래스)의 setName메서드를 이용해서 cat[i]의 name을 지정
			System.out.print("Age :");
			cat[i].setAge(kbd.nextInt());//입력받은 문자열을 Pet클래스(부모클래스)의 setAge메서드를 이용해서 cat[i]의 age를 지정
			System.out.print("Weight :");
			cat[i].setWeight(kbd.nextDouble());//입력받은 문자열을 Pet클래스(부모클래스)의 setWeight메서드를 이용해서 cat[i]의 weight을 지정
			System.out.print("Color:");
			cat[i].setColor(kbd.next()); //입력받은 문자열을 Cat클래스의 setColor메서드를 이용해서 인스턴스변수 color저장
			kbd.nextLine(); //Enter키가져오기
			System.out.println();//한줄건너뛰기
		}
		
		System.out.println("<<Dog List>>"); //dog배열 정보들 출력
		for (int i=0;i<dog.length;i++) { //dog배열개수만큼 for문 반복
			dog[i].writeOutput(); //Pet클래스의 writeOutput 메서드를 오버라이딩한 Dog클래스의 writeOutput메서드 호출헤 정보 출력
			dog[i].move(); //Pet클래스의 move메서드를 오버라이딩한 Dog클래스의 move메서드 호출
			System.out.println(); //다음 정보 출력하기 전 한줄 건너뛰기
		}
		
		System.out.println(); //cat배열정보 출력하기 전 한줄 띄우기 (총 두줄 띄어짐 앞에 for문안에도 한줄 띄우는 거 있기 때문이다)
		
		System.out.println("<<Cat List>>"); //cat배열 정보들 출력
		for(int i=0;i<cat.length;i++) { //cat배열개수만큼 for문 반복
			cat[i].writeOutput();//Pet클래스의 writeOutput메서드를 오버라이딩한 메서드 호출
			cat[i].move();//Pet클래스의 move메서드를 오버라이딩한 메서드 호출
			System.out.println();//한줄 건너뛰기
		}
		System.out.println(); 
		
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for(int i=0;i<dog.length;i++) { //dog배열 개수만큼 for문 반복
			if(dog[i].getAge()>2 && dog[i].getBoosterShot()==false) {//만약 dog[i]의 age가 2보다 크고, boosterShot이 false(예방접종 x)라면
				System.out.print(dog[i].getName()+" ");//name을 출력하고 한칸 건너뛴다.print이기 때문에 한줄로 출력됨
			}
		}
		System.out.println();
		System.out.println("* Black cats weighs more than 3Kg are...");
		for(int i=0;i<cat.length;i++) {//cat배열 개수만큼 for문 반복
			if(cat[i].getColor().equalsIgnoreCase("black") && cat[i].getWeight()>=3.0) {//만약 cat의 color가 black이고(대소문자 구분x), weight가 3.0이상이면
				System.out.print(cat[i].getName()+" ");//name출력하고 한칸 띄움. print이기 때문에 한줄로 출력됨
			}
		}
		
	}

}
