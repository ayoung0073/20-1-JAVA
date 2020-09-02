package Week7_1_문아영;
import java.util.Scanner;
public class Week7_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");

		Scanner kbd=new Scanner(System.in); //Scanner 객체 생성
		Pet pet[]=new Pet[10]; //참조변수 pet을 선언해 Pet형의 배열 선언 (최대 10개까지)
		
		int i=0; //pet배열의 index, 0부터 시작하므로 0으로 초기화
		int doNum=1;  //원하는 작업 번호. while문의 조건에 충족하기 위해 1로 초기화해둠
		int petNum;  //종을 선택할 때 고를 번호. 
		
		while(doNum!=3) {
			System.out.println("원하는 작업은 무엇입니까?");
			System.out.println("1. New input   2. Output   3. Exit");
			doNum=kbd.nextInt(); //작업할 번호 입력받음
			if(doNum==1) { //New input 선택할 때
				petNum=0; //petNum을 0으로 초기화.(이때 초기화 한 이유는 실행 후 다시 New input작업을 할 때 petNum을 초기화해야되기 때문에, while의 조건이 petNum==0이기 때문에 0으로 초기화함)
				while(petNum==0) {
					System.out.println("종은 무엇입니까?");
					System.out.println("1. Dog   2. Cat   3. Snake   4. Bird");
					petNum=kbd.nextInt();
					switch(petNum){ 
					case 1: //1을 선택하면
						pet[i]=new Dog(); //Dog 인스턴스를 가리키는 pet[i]를 생성
						pet[i].species="Dog"; //pet[i]의 인스턴스 변수 species 저장.
						break;
					case 2: //위와 같이 아래 반복
						pet[i]=new Cat();
						pet[i].species="Cat\t"; //"\t"한 이유는 "Cat"으로 하면 정렬이 안되고, "Cat\t"를 하니까 정렬맞춤이 됨.
						break;
					case 3:
						pet[i]=new Snake();
						pet[i].species="Snake";
						break;
					case 4:
						pet[i]=new Bird();
						pet[i].species="Bird";
						break;
					default: //1~4가 아닌 번호를 입력하면
						System.out.println("잘못된 입력");
						System.out.println(); //한줄 띄우기
						petNum=0; //break;를 하지 않아야 while문으로 돌아갈 수 있다. while문의 조건에 충족하기 위해 petNum에 0 대입.
					}
				}
					kbd.nextLine(); //Enter키 가져오기
					System.out.print("Name:");
					pet[i].name=kbd.nextLine(); //pet[i]의 name입력받기
					System.out.print("Age:");
					pet[i].age=kbd.nextInt(); //pet[i]의 age입력받기
					System.out.println(); //한줄 띄우기
					
					i++; //pet[i]의 입력을 모두 받았으므로 i++를 함.
			}//while문으로 돌아감
			
			else if(doNum==2) { //Output 선택할 때 (input한 모든 정보 출력함)
				System.out.println("\nSpecies\tName\tAge\t\tMovement");
				for(int k=0;k<i;k++) { //i개(실제 인스턴스 생성한 개수)를 입력받았으므로 i개를 입력함
					System.out.print(pet[k].species+"\t"+pet[k].name+"\t"+pet[k].age+"\t\t");
					pet[k].move(); 
				}	
				System.out.println(); //한줄 띄우기
			} //while문으로 돌아감
			
			else if(doNum==3) { //Exit을 선택할 때
				System.out.println("종료");
				System.exit(0); //프로그램 종료.
			}
			
			else { //1~3을 제외한 번호를 입력했을 때
				System.out.println("잘못된 입력");
				System.out.println();  //while문으로 돌아감.
			}
		
		}
	}
}
