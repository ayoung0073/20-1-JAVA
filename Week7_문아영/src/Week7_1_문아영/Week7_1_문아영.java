package Week7_1_���ƿ�;
import java.util.Scanner;
public class Week7_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");

		Scanner kbd=new Scanner(System.in); //Scanner ��ü ����
		Pet pet[]=new Pet[10]; //�������� pet�� ������ Pet���� �迭 ���� (�ִ� 10������)
		
		int i=0; //pet�迭�� index, 0���� �����ϹǷ� 0���� �ʱ�ȭ
		int doNum=1;  //���ϴ� �۾� ��ȣ. while���� ���ǿ� �����ϱ� ���� 1�� �ʱ�ȭ�ص�
		int petNum;  //���� ������ �� �� ��ȣ. 
		
		while(doNum!=3) {
			System.out.println("���ϴ� �۾��� �����Դϱ�?");
			System.out.println("1. New input   2. Output   3. Exit");
			doNum=kbd.nextInt(); //�۾��� ��ȣ �Է¹���
			if(doNum==1) { //New input ������ ��
				petNum=0; //petNum�� 0���� �ʱ�ȭ.(�̶� �ʱ�ȭ �� ������ ���� �� �ٽ� New input�۾��� �� �� petNum�� �ʱ�ȭ�ؾߵǱ� ������, while�� ������ petNum==0�̱� ������ 0���� �ʱ�ȭ��)
				while(petNum==0) {
					System.out.println("���� �����Դϱ�?");
					System.out.println("1. Dog   2. Cat   3. Snake   4. Bird");
					petNum=kbd.nextInt();
					switch(petNum){ 
					case 1: //1�� �����ϸ�
						pet[i]=new Dog(); //Dog �ν��Ͻ��� ����Ű�� pet[i]�� ����
						pet[i].species="Dog"; //pet[i]�� �ν��Ͻ� ���� species ����.
						break;
					case 2: //���� ���� �Ʒ� �ݺ�
						pet[i]=new Cat();
						pet[i].species="Cat\t"; //"\t"�� ������ "Cat"���� �ϸ� ������ �ȵǰ�, "Cat\t"�� �ϴϱ� ���ĸ����� ��.
						break;
					case 3:
						pet[i]=new Snake();
						pet[i].species="Snake";
						break;
					case 4:
						pet[i]=new Bird();
						pet[i].species="Bird";
						break;
					default: //1~4�� �ƴ� ��ȣ�� �Է��ϸ�
						System.out.println("�߸��� �Է�");
						System.out.println(); //���� ����
						petNum=0; //break;�� ���� �ʾƾ� while������ ���ư� �� �ִ�. while���� ���ǿ� �����ϱ� ���� petNum�� 0 ����.
					}
				}
					kbd.nextLine(); //EnterŰ ��������
					System.out.print("Name:");
					pet[i].name=kbd.nextLine(); //pet[i]�� name�Է¹ޱ�
					System.out.print("Age:");
					pet[i].age=kbd.nextInt(); //pet[i]�� age�Է¹ޱ�
					System.out.println(); //���� ����
					
					i++; //pet[i]�� �Է��� ��� �޾����Ƿ� i++�� ��.
			}//while������ ���ư�
			
			else if(doNum==2) { //Output ������ �� (input�� ��� ���� �����)
				System.out.println("\nSpecies\tName\tAge\t\tMovement");
				for(int k=0;k<i;k++) { //i��(���� �ν��Ͻ� ������ ����)�� �Է¹޾����Ƿ� i���� �Է���
					System.out.print(pet[k].species+"\t"+pet[k].name+"\t"+pet[k].age+"\t\t");
					pet[k].move(); 
				}	
				System.out.println(); //���� ����
			} //while������ ���ư�
			
			else if(doNum==3) { //Exit�� ������ ��
				System.out.println("����");
				System.exit(0); //���α׷� ����.
			}
			
			else { //1~3�� ������ ��ȣ�� �Է����� ��
				System.out.println("�߸��� �Է�");
				System.out.println();  //while������ ���ư�.
			}
		
		}
	}
}
