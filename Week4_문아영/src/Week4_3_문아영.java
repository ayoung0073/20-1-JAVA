
public class Week4_3_���ƿ� {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		int a=5,b=10;
		double da=3.4,db=5.2;
		char ca='a',cb='b';
		int iarr[]= {1,2,3};
		double darr[]= {1.1,2.2,3.3};
		char carr[]= {'a','p','p','l','e'};
		System.out.println("a+b="+sum(a,b));
		System.out.println("da+b="+sum(da,b));
		System.out.println("a+db="+sum(a,db));
		System.out.println("da+db="+sum(da,db));
		System.out.println("ca+cb="+sum(ca,cb));
		System.out.println("sum of Int_Arr="+sum(iarr));
		System.out.println("sum of Double_Arr="+sum(darr));
		System.out.println("sum of Char_Arr="+sum(carr));
		}
	
	static int sum(int a, int b) { return a+b;} //int�� �Ű������� �ΰ����� ��, �׳� ���ص� int���̴�.
	static double sum(double da, double db) { return da+db;} //�ΰ��� double�� �Ű������� ������ �׳� ���ص� double�� ��ȯ
	static double sum(int a,double db) {return (double)a+db;} //int�� �Ű������� double�� �Ű������� �׳� ���ϸ� int���� �Ǳ⶧���� int���Ű������� double������ ����ȯ ���� ���� ���ϱ�
	static double sum(double da,int b) {return da+(double)b;}//���� �޼����� �Ű������� ������ �ٸ����� �ٸ� �޼���.
	static String sum(char ca,char cb) {return ca+""+cb;} //ca�� cb�� ��� �������̱� ������ ���� �� ���ڿ��� ���ϱ� ���ؼ��� ""(���ڿ�)�� ���ؼ� ���ڿ�ȭ���ش�.
	static int sum(int iarr[]) { //int�� �迭�� ���� ��
		int inum=0; //for������ �迭���� ���ϱ� ���� �ʱⰪ inum�� �����ؼ� inum�� 0�� �����Ѵ�.
		for (int i=0;i<iarr.length;i++) { //iarr.length�� �迭�� �����̴�. 
			inum+=iarr[i]; //�迭�� �ϳ��� �� ���Ѵ�. 
		}
		return inum;  //�հ� ��ȯ
}
	static double sum(double darr[]) { //double�� �迭�� ���� ��
		double dnum=0d; //dnum�� double������ ���ֱ� ���� 0�ڿ� d�� ���δ�.
		for (int i=0;i<darr.length;i++) {
			dnum+=darr[i]; //�迭�� �ϳ��� �� ���Ѵ�.
		}
		return dnum; //�հ� ��ȯ
	}
	static String sum(char carr[]) { //char�� ���ڵ��� ������ ��
		String str=""; //�迭���� char���̱� ������ ���� �� ���ڿ��� �־���ϱ� ������ ""�� �����ؼ� ���ڿ��� �ٲ۴�.
		for(int i=0;i<carr.length;i++) {
			str=str+carr[i];
		}
		return str; //������ ���ڿ� ��ȯ
	}
	}


