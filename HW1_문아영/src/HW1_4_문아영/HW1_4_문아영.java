package HW1_4_���ƿ�;
import java.util.Scanner;
public class HW1_4_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		int num; //�Է¹��� �л� �� num����
		int koreanSum=0;  //��ü �л��� ���� ���� ��
		int mathSum=0;//��ü �л��� ���� ���� ��
		int englishSum=0; //��ü �л��� ���� ���� ��
		double koreanAvg,mathAvg,englishAvg; //�� ������ ���
		
		
		System.out.println("How many students are there?");
		num=kbd.nextInt(); //�л� �� �Է¹ޱ�
		kbd.nextLine(); //����Ű ��������
		System.out.println("Input the information.");
		System.out.println(); //���ٶ���
		StudentScore student[]=new StudentScore[num]; //ũ�Ⱑ num�� StudentScore�� �迭 ���� 
		
		for(int i=0;i<num;i++) { //num�� for�� �ݺ�
			student[i]=new StudentScore(); //student�迭 i��° ��ü ����
			
			System.out.print("ID:");
			student[i].setId(kbd.nextLine()); //����Ŭ���� StudentInformation�� setId�޼��� ȣ��
			System.out.print("Name:");
			student[i].setName(kbd.nextLine());//����Ŭ����  StudentInformation�� setName�޼��� ȣ��
			System.out.print("Korean:");
			student[i].setKorean(kbd.nextInt()); //�ڼ�Ŭ���� StudentScore�� setKorean�޼��� ȣ��
			System.out.print("Math:");
			student[i].setMath(kbd.nextInt()); //���Ͱ��� �Ʒ� �ݺ�
			System.out.print("English:");
			student[i].setEnglish(kbd.nextInt());
			kbd.nextLine(); //����Ű ��������
			
			System.out.println(); //���ٰǳʶٱ�
		}
		System.out.println("Name\t\tID\tKOREAN\tMATH\tENGLISH\tSUM\tAVG"); //�Ӹ��� ���
		
		for(int i=0;i<num;i++) {  //num�� for�� �ݺ�
			student[i].display(); //�������̵��� display�޼��� ȣ��
			
			koreanSum+=student[i].getKorean(); //i��° �л��� �������� koreanSum�� ���ϱ�
			mathSum+=student[i].getMath(); //���� ���� �Ʒ� �ݺ�
			englishSum+=student[i].getEnglish();
		}
		koreanAvg=koreanSum/3.0; //for������ ���ؼ� ���� �������� 3�� ������ �� ������ ��� ���ϱ�
		mathAvg=mathSum/3.0; //���� ���� �Ʒ� �ݺ�
		englishAvg=englishSum/3.0;
		
		System.out.print("Subject Avg\t\t");
		System.out.printf("%.2f\t%.2f\t%.2f",koreanAvg,mathAvg,englishAvg); //�Ҽ��� 2�ڸ������� ��Ÿ���� ���� printf��
		System.out.println();
		System.out.println();
		
		System.out.println("<Students over the average>"); //������� ���� �л� ���
		System.out.println();
		
		System.out.println("Korean:");
		for(int i=0;i<num;i++) { 
			if(koreanAvg<student[i].getKorean()) System.out.print(student[i].getName()+"\t"); //����������պ��� ���� �л� �̸� ����(����Ŭ������ getName�޼��� ȣ��)
		}
		System.out.println(); //���� �ǳʶٱ�
		
		System.out.println("Math:"); //���� ���� �Ʒ� �ݺ�
		for(int i=0;i<num;i++) {
			if(mathAvg<student[i].getMath()) System.out.print(student[i].getName()+"\t");
		}
		System.out.println();
		
		System.out.println("English:");
		for(int i=0;i<num;i++) {
			if(englishAvg<student[i].getEnglish()) System.out.print(student[i].getName()+"\t");
		}
		System.out.println();
	}

}
