import java.util.Scanner;
public class Week4_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
	
		int num1; //ù��° �Է� ���� ���� ���� ����
		int num2;//�ι�° �Է� ���� ���� ���� ����
		
		System.out.print("ù��° ���� �Է�:");
		num1=kbd.nextInt(); //ù��° ���� �Է¹ޱ�
		System.out.print("�ι�° ���� �Է�:");
		num2=kbd.nextInt(); //�ι�° ���� �Է¹ޱ�
		System.out.print("Factorial("+num1+") - Factorial("+num2+") = ");
		System.out.println(Facto.factoVal(num1)-Facto.factoVal(num2)); //factoVal�޼���� static�޼����̱� ������ �ν��Ͻ��� �������� �ʰ� Ŭ���������� �޼��带  ȣ���� �� �ִ�.
		
	}

}
