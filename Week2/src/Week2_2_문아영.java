import java.util.Scanner;
public class Week2_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		String cORf="c";
		String input="Y"; //ó�� while���� ���ǿ� ������Ű�� ���� "Y"�� �ʱ�ȭ��
		double degree_c=0; //�Է¹��� �����µ��� ������ degree_c�� �ΰ� 0���� �ʱ�ȭ��(�������� double������ �ζ�� ��)
		int degree_f=0;//�Է¹��� ȭ���µ��� ������ degree_f�� �ΰ� 0���� �ʱ�ȭ��
		
		Scanner keyboard=new Scanner(System.in); //Scanner ��ü ����
		
		while(input.equalsIgnoreCase("y")) {
			System.out.println("�Է��� �µ��� ����? C(����) �Ǵ� F(ȭ��):");
			cORf=keyboard.nextLine(); //�µ� ���� �Է� �ޱ�

			if(cORf.equalsIgnoreCase("c")) { //"c"�� "C"�� �Է¹޴´ٸ�
				System.out.println("�����µ�(�Ǽ�) �Է�");
				degree_c=keyboard.nextDouble(); 
				keyboard.nextLine(); //get carriage return(���� ������)
				degree_f=9*(int)degree_c/5+32; //ȭ���µ��� �������̱� ������ ���������� ����ȯ �ؾ���
				System.out.println("���� "+degree_c+"��/ȭ�� "+degree_f+"��");
			}
		    else if(cORf.equalsIgnoreCase("f")) { //"f"�� "F"�� �Է¹޴´ٸ�
		    	System.out.println("ȭ���µ�(����) �Է�");
		    	degree_f=keyboard.nextInt();
		    	keyboard.nextLine();//get carriage return(���� ������)
		    	degree_c=5*(degree_f-32)/(double)9; //�����µ��� double���̱� ������ double������ ����ȯ ���ְ� ������־����.
				System.out.print("ȭ�� "+degree_f+"��/���� ");
				System.out.printf("%.1f��",degree_c); //���� ���ÿ��� �Ҽ��� �Ʒ� 1�ڸ����� ǥ�������Ƿ� printf�� �̿��ؼ� �ڵ� �ۼ�.
				System.out.println();//�ٳѱ����ش�
		    }
		    else {
		    	System.out.println("�߸��� �Է�");
		    	System.out.println();
		    }
			System.out.println("����Ͻðڽ��ϱ�?(Y)");
			input=keyboard.nextLine();
			if(!input.equalsIgnoreCase("y")) { //"Y"�� "y"�� �ƴ� ���ڿ� �Է¹�����
				System.out.println("���α׷� ����");
				break; //while�� �����
				
			}
			System.out.println(); //�ٽ� while�� �ݺ��� �� �����ϱ� ���� �� �� �ѱ��Ѵ�.
		}
	}

}
