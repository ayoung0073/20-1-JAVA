package HW1_3_���ƿ�;
import java.util.Scanner;
public class HW1_3_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		String yOrN="y"; //String�� yOrN���� ����, while�� ���ǿ� �����ϱ����� "y"����
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		while(yOrN.equals("y")) { 
			System.out.println("Input a word");
			String str=kbd.next(); //String�� str�����ؼ� word �Է¹���
			char Arr[]=new char[100]; //���ڹ迭 Arr����. ũ��� 100���� �س���.
			Arr=str.toCharArray(); //String���� str�� ���ڹ迭�� ��ȯ
			
			if(check(Arr)==true) System.out.println("symmetry"); //ȣ���� check�޼��尡 true�� ��ȯ�ϸ� "symmetry" ���
			else System.out.println("Asymmetry"); //false��ȯ�ϸ� "Asymmetry" ���
			
			System.out.println(); //���� ����
			
			System.out.print("Try again?(y/n)");
			yOrN=kbd.next();//�ݺ��������� �Է¹���
			System.out.println(); //���� ����
			
			}
		}

	
	public static boolean check(char[] Arr) { //���ڹ迭�� �μ��� �� check�޼���(boolean�� ��ȯ�ϴ� �޼���)
		int num=Arr.length/2; //int�� num�����ؼ� Arr�� ���̰� Ȧ������ �߰� ������ �ε��������� ��Ī���� ��
		for(int i=0;i<num;i++) { 
			if(Arr[i]!=Arr[Arr.length-1-i]) return false; //ó���迭���� ���� i��°�� ���� ������ �迭���� ���� i��°�� ���� �ٸ��� false��ȯ�ϸ鼭 ����. �ϳ��� �ٸ��� ���Ī(Asymmetry)
		}
		return true; //for������ false�� ��ȯ�ϸ鼭 ���ᰡ �ȵǾ����� true��ȯ.(��Ī)

	}
}
