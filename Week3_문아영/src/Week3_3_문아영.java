import java.util.Scanner;
public class Week3_3_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		String title; 
		int page;
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		MyFile fOld=new MyFile(); //MyFileŬ�������� fOld��� �̸��� ��ü ���� 
		MyFile fNew=new MyFile(); //MyFileŬ�������� fNew��� �̸��� ��ü ����
		
		System.out.println("--File�����Է�(����,��������)--");
		fOld.setTitle(kbd.nextLine()); //MyFileŬ������ �޼��带 �̿��ؼ� �Է¹��� String(���ڿ�)�� fOld�� title�� ����
		fOld.setPage(kbd.nextInt());//MyFileŬ������ �޼��带 �̿��ؼ� �Է¹��� int(����)�� fOld�� page�� ����
		fOld.fileCopy(fNew); //fOld�� �������� fNew�� ����
		System.out.println("<���� File>");
		fOld.fileInfo(); //fOld�� ���� ���
		System.out.println("<����� File>");
		fNew.fileInfo(); //fNew�� ������ ���
	}

}
