import java.util.*;
public class HW2_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in);//스캐너 객체 생성
		LinkedList<Character> userStack; //Character형 LinkedList 클래스 선언
		String userInput; //user가 입력하는 문자열 선언 참조변수: userInput
		char P[]; //user가 입력한 문자열을 배열로 저장할 문자배열 선언
		char yesOrno; //모든 괄호 쌍이 맞는지 틀린지 확인하기 위해 선언
		
		while(true) //while문 반복
		{
			yesOrno='y'; //모든 괄호쌍이 맞다고 기본값 설정 'y' 아니면 'n' 저장할 것
			userStack=new LinkedList<Character>(); //LinkedList 인스턴스 생성
			System.out.print("Input: ");
			userInput=kbd.nextLine(); //user가 입력한 문자열을 userInput에 저장
			
			if(userInput.equals("0"))  //userInput이 '0'이면
			{
				System.out.println("Program finished");
				break; //while문 종료
			}
			
			else //userInput이 '0'이 아니면
			{
				P=new char[userInput.length()]; //user가 입력한 문자열의 길이 크기로 배열 선언
				P=userInput.toCharArray(); //String형 userInput을 문자배열로 변환
				
				for(int i=0;i<userInput.length();i++) //user가 입력한 문자열의 길이만큼 for문 반복
				{
					if(P[i]=='{' ||P[i]=='['||P[i]=='(') //i번째 인덱스값이 열리는 문자이면
					{
						userStack.addLast(P[i]); //stack에 push한다
					}
					
					else if(P[i]=='}'||P[i]==']'||P[i]==')') //i번째 인덱스값이 닫히는 문자일 때
					{
						if(userStack.isEmpty()) //만약 stack이 비어있으면
						{
							System.out.println("Incorrect\n"); //괄호쌍이 안맞기 때문에 틀림.
							yesOrno='n'; //yesOrno에 틀림을 의미하는 'n'문자 대입	
							break; //for문 빠져나감.
						}
						else //stack이 안 비어있을 때
						{
							char popCh=userStack.removeLast(); //stack에서 pop한 문자를 popCh에 저장
						    if(P[i]=='}') //i번째 인덱스값이 '}'이면(닫히는 문자 중 하나)
							{
								if(popCh!='{') //닫히는 문자와 맞는 쌍이 아니면
								{
									System.out.println("Incorrect\n"); //틀림
									yesOrno='n';  //yesOrno에 틀림을 의미하는 'n'문자 대입				
									break; //for문  빠져나감
								}
							}
		
							else if(P[i]==']') //i번째 인덱스값이 ']'이면(닫히는 문자 중 하나)
							{
								if(popCh!='[') //닫히는 문자와 맞는 쌍이 아니면
								{
									System.out.println("Incorrect\n"); //틀림
									yesOrno='n'; //위의 else문과같이 반복
									break;
								}
							}
						    
							else
							{
								if(popCh!='(')  //i번째 인덱스값이 ')'이면(닫히는 문자 중 하나)
							{
									System.out.println("Incorrect\n");//위의 else문과 같이 반복
									yesOrno='n';
									break;
								}
							}
						    
						}
					}
					
					
					else //열리는 문자나 닫히는 문자나 0이 아닌 경우엔
					{ 
						System.out.println("Wrong Input\n"); //잘못입력
						yesOrno='n';
						break; //for문 빠져나감
					}
				}
				
			}
			
			if (yesOrno=='y') //while문 종료하고 yesOrno가 'y'이면 맞은 경우
			{
				System.out.println("Correct\n");
			}
		}
		kbd.close(); //while문 빠져나가면 kbd close함
	
	}
}

	
