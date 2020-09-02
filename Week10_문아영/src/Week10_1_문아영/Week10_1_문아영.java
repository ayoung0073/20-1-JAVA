package Week10_1_���ƿ�;
import java.util.*;
public class Week10_1_���ƿ� {
	static Scanner kbd=new Scanner(System.in); //Scanner��ü static���� ����
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		ArrayList<Student> studentList=new ArrayList<Student>(); //StudentŬ������ ArrayList ����
	
		int index=0; //studenList �迭�� index
		int selectNum=1; //�Է¹���  ��ȣ(1~4 ��)
		
		System.out.println("Input Student Name, ID, and age. 0 for name to quit.");		
		try { //���ܰ� �߻��� �� �ִ� ����� ����
		while(true)
		{
			String name=kbd.next();
			if (name.equals("0")) break; //���� �Է¹޴� �̸���"0"�̸� while�� ���������� �Է� �׸� ����
			else //"0"�� �ƴϸ�
			{
				studentList.add(index,new Student(name,kbd.next(),kbd.nextInt())); //3���� �μ��� �ִ� Student�����ڸ� �̿��� �Է¹ް� ArrayList�迭�� index��ġ�� ����
				
				index++; //���� �迭�� index
			}

		}
		System.out.println("NUMBER\tNAME\t\tID\t\t\t\tAGE");
		printResult(studentList); //����Ʈ �����ִ� static �޼��� printResultȣ��
		
		while(selectNum!=4) //4��(����)�� �Է¹��� ������ �ݺ��� ����.
		{
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information   2.delete information   3.show list   4.Finish program");
			selectNum=kbd.nextInt();
			if(selectNum==1) //1�� ������ ��
			{
				addStudent(studentList); //student�� �߰��ϴ� addStudent�޼��� ȣ��
			}
			else if(selectNum==2) //2�� ������ ��
			{
				deleteStudent(studentList); //student�� �����ϴ� deleteStudent�޼��� ȣ��
			}
			else if(selectNum==3) //3�� ������ ��
			{
				System.out.println("NUMBER\tNAME\t\tID\t\t\t\tAGE");
				printResult(studentList); //printResult �޼��� ȣ��
			}
			else if(selectNum==4); //4���� �����ϸ� �ݺ��� ����
			else System.out.println("Wrong input."); //1,2,3,4�� �ƴ� �� �ԷµǸ� "Wrong input"�� ����ϰ� �ݺ��� �ٽ� ����
		}
		kbd.close();
	}catch(Exception e) { //Exception�߻��ϸ�
		System.out.println("Exception\n"); //Exception ���
	}
	}
	
	public static void printResult(List<Student> studentList) throws Exception //����Ʈ �����ִ� �޼��� ����
	{
		for(int i=0;i<studentList.size();i++) //studentList�� �迭 ������ŭ for�� �ݺ�
		{
			System.out.println((i+1)+"\t\t\t"+studentList.get(i).name+"\t\t"+studentList.get(i).id+"\t\t"+studentList.get(i).age); //�ε����� i�� List�� element�� name, id, age ���
		}
	}
	
	public static void deleteStudent(List<Student> studentList) throws Exception //student�� �����ϴ� �޼��� ����
	{
		System.out.println("Input Student Number to delete.");
		int deleteNum=kbd.nextInt(); //������ �л��� ��ȣ �Է��ϱ�
		studentList.remove(studentList.get(deleteNum-1)); //�ε����� 0���� �����ϹǷ� -1�ؼ� studentList�� deleteNum-1 ��ġ�� element ����
		printResult(studentList);//���� �� student�� ����Ʈ�� ������
		
	}
	
	public static void addStudent(List<Student> studentList) throws Exception //student�� �߰��ϴ� �޼��� ����
	{
		System.out.println("Input new Student Name, ID, and age, and the location");
		Student newStudent=new Student(kbd.next(),kbd.next(),kbd.nextInt()); //3���� �μ��� �ִ� �����ڸ� �̿��� �Է¹޾� Student �ν��Ͻ� ���� (��������:newStudent)
		int newIndex=kbd.nextInt()-1; //�߰��� ��ġ��ȣ�� �Է¹���(-1�� �ϴ� ������ �迭�� �ε����� 0���� �����ϱ⶧���̴�)
		studentList.add(newIndex,newStudent); //List�� add�޼��带 �̿��� �迭 �߰�
		printResult(studentList); //����Ʈ�� �����ִ� �޼��� ȣ��
		
	}
	
}
