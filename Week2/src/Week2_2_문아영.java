import java.util.Scanner;
public class Week2_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		String cORf="c";
		String input="Y"; //처음 while문의 조건에 충족시키기 위해 "Y"로 초기화함
		double degree_c=0; //입력받을 섭씨온도의 변수를 degree_c로 두고 0으로 초기화함(문제에서 double형으로 두라고 함)
		int degree_f=0;//입력받을 화씨온도의 변수를 degree_f로 두고 0으로 초기화함
		
		Scanner keyboard=new Scanner(System.in); //Scanner 객체 생성
		
		while(input.equalsIgnoreCase("y")) {
			System.out.println("입력할 온도의 종류? C(섭씨) 또는 F(화씨):");
			cORf=keyboard.nextLine(); //온도 종류 입력 받기

			if(cORf.equalsIgnoreCase("c")) { //"c"나 "C"를 입력받는다면
				System.out.println("섭씨온도(실수) 입력");
				degree_c=keyboard.nextDouble(); 
				keyboard.nextLine(); //get carriage return(엔터 가져옴)
				degree_f=9*(int)degree_c/5+32; //화씨온도는 정수형이기 때문에 정수형으로 형변환 해야함
				System.out.println("섭씨 "+degree_c+"도/화씨 "+degree_f+"도");
			}
		    else if(cORf.equalsIgnoreCase("f")) { //"f"나 "F"를 입력받는다면
		    	System.out.println("화씨온도(정수) 입력");
		    	degree_f=keyboard.nextInt();
		    	keyboard.nextLine();//get carriage return(엔터 가져옴)
		    	degree_c=5*(degree_f-32)/(double)9; //섭씨온도는 double형이기 때문에 double형으로 형변환 해주고 계산해주어야함.
				System.out.print("화씨 "+degree_f+"도/섭씨 ");
				System.out.printf("%.1f도",degree_c); //실행 예시에서 소수점 아래 1자리까지 표시했으므로 printf를 이용해서 코드 작성.
				System.out.println();//줄넘김해준다
		    }
		    else {
		    	System.out.println("잘못된 입력");
		    	System.out.println();
		    }
			System.out.println("계속하시겠습니까?(Y)");
			input=keyboard.nextLine();
			if(!input.equalsIgnoreCase("y")) { //"Y"나 "y"가 아닌 문자열 입력받으면
				System.out.println("프로그램 종료");
				break; //while문 벗어난다
				
			}
			System.out.println(); //다시 while문 반복할 때 구분하기 위해 한 줄 넘김한다.
		}
	}

}
