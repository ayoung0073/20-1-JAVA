import java.util.*;
public class HW2_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in);//��ĳ�� ��ü ����
		LinkedList<Character> userStack; //Character�� LinkedList Ŭ���� ����
		String userInput; //user�� �Է��ϴ� ���ڿ� ���� ��������: userInput
		char P[]; //user�� �Է��� ���ڿ��� �迭�� ������ ���ڹ迭 ����
		char yesOrno; //��� ��ȣ ���� �´��� Ʋ���� Ȯ���ϱ� ���� ����
		
		while(true) //while�� �ݺ�
		{
			yesOrno='y'; //��� ��ȣ���� �´ٰ� �⺻�� ���� 'y' �ƴϸ� 'n' ������ ��
			userStack=new LinkedList<Character>(); //LinkedList �ν��Ͻ� ����
			System.out.print("Input: ");
			userInput=kbd.nextLine(); //user�� �Է��� ���ڿ��� userInput�� ����
			
			if(userInput.equals("0"))  //userInput�� '0'�̸�
			{
				System.out.println("Program finished");
				break; //while�� ����
			}
			
			else //userInput�� '0'�� �ƴϸ�
			{
				P=new char[userInput.length()]; //user�� �Է��� ���ڿ��� ���� ũ��� �迭 ����
				P=userInput.toCharArray(); //String�� userInput�� ���ڹ迭�� ��ȯ
				
				for(int i=0;i<userInput.length();i++) //user�� �Է��� ���ڿ��� ���̸�ŭ for�� �ݺ�
				{
					if(P[i]=='{' ||P[i]=='['||P[i]=='(') //i��° �ε������� ������ �����̸�
					{
						userStack.addLast(P[i]); //stack�� push�Ѵ�
					}
					
					else if(P[i]=='}'||P[i]==']'||P[i]==')') //i��° �ε������� ������ ������ ��
					{
						if(userStack.isEmpty()) //���� stack�� ���������
						{
							System.out.println("Incorrect\n"); //��ȣ���� �ȸ±� ������ Ʋ��.
							yesOrno='n'; //yesOrno�� Ʋ���� �ǹ��ϴ� 'n'���� ����	
							break; //for�� ��������.
						}
						else //stack�� �� ������� ��
						{
							char popCh=userStack.removeLast(); //stack���� pop�� ���ڸ� popCh�� ����
						    if(P[i]=='}') //i��° �ε������� '}'�̸�(������ ���� �� �ϳ�)
							{
								if(popCh!='{') //������ ���ڿ� �´� ���� �ƴϸ�
								{
									System.out.println("Incorrect\n"); //Ʋ��
									yesOrno='n';  //yesOrno�� Ʋ���� �ǹ��ϴ� 'n'���� ����				
									break; //for��  ��������
								}
							}
		
							else if(P[i]==']') //i��° �ε������� ']'�̸�(������ ���� �� �ϳ�)
							{
								if(popCh!='[') //������ ���ڿ� �´� ���� �ƴϸ�
								{
									System.out.println("Incorrect\n"); //Ʋ��
									yesOrno='n'; //���� else�������� �ݺ�
									break;
								}
							}
						    
							else
							{
								if(popCh!='(')  //i��° �ε������� ')'�̸�(������ ���� �� �ϳ�)
							{
									System.out.println("Incorrect\n");//���� else���� ���� �ݺ�
									yesOrno='n';
									break;
								}
							}
						    
						}
					}
					
					
					else //������ ���ڳ� ������ ���ڳ� 0�� �ƴ� ��쿣
					{ 
						System.out.println("Wrong Input\n"); //�߸��Է�
						yesOrno='n';
						break; //for�� ��������
					}
				}
				
			}
			
			if (yesOrno=='y') //while�� �����ϰ� yesOrno�� 'y'�̸� ���� ���
			{
				System.out.println("Correct\n");
			}
		}
		kbd.close(); //while�� ���������� kbd close��
	
	}
}

	
