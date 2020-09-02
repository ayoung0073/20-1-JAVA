package Week10_2_���ƿ�;
import java.util.*;
public class Week10_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Map<String,String> students=new HashMap<String,String>(); //HashMap ��ü ����
		Scanner kbd=new Scanner(System.in);//Scanner ��ü ����
		
		String id,name;
		String id_k; //key�� ������ ���� ����
		int maxLength=0; //���� �� �̸��� ���̸� ������ ���� ����, �ϴ� 0���� �ʱ�ȭ
		int minLength=0; //���� ª�� �̸��� ���̸� ������ ���� ����,�ϴ� 0���� �ʱ�ȭ
		String maxID=null; //���� �� �̸��� ID ���� ����
		String minID=null; //���� ª�� �̸��� ID ���� ����
		int student_cnt=0; //�л� ���� student_cnt ���� �� 0���� �ʱ�ȭ
		
		
		System.out.println("�л��� ID�� �̸��� ���ʷ� �Է��ϼ���. (����� 0 0 �Է�)");
		while(true)
		{
			id=kbd.next();
			name=kbd.next();
			if(id.equals("0") && name.equals("0")) break; // 0 0 �Է¹����� �ݺ��� ����
			students.put(id,name);
			maxLength=name.length(); //0 0�Է¹ޱ� �� ���������� ����id�� name�� maxLength�� minLength�� ����(0�� �ƴ� ���� �Է¹��� ������ �����ϱ� ����)
			minLength=name.length();
			maxID=id; //maxID�� minID���� ���� �Է¹��� ���� ������(null�� ������� �ʱ� ����)
			minID=id;
		}
		System.out.println("<�л����>");
		System.out.println("[ID]\t\t\t\t\t[NAME]");
		
		Set set=students.keySet(); //key���� set�� ����
		Iterator<String> it=set.iterator(); //iterator �ν��Ͻ��� ����
		
		while(it.hasNext()) 
		{
			student_cnt++; //while���� �ݺ��Ǹ� �л��� +1��
			id_k=it.next(); //id_k�� key�̴�(��, ���̵� ����)
			if(students.get(id_k).length()>maxLength) //maxLength���� ��(�̸�)�� ���̰� ũ��
			{
				maxLength=students.get(id_k).length(); //maxLength�� �� ��(�̸�)�� ���̷� ����, get�޼��带 �̿��� Ű�� �� ��ȯ, length�޼���� String���� ���̸� ��ȯ
				maxID=id_k; //�׶��� key�� maxID�� ����
			}
			else if(students.get(id_k).length()<minLength)//minLength���� ��(�̸�)�� ���̰� ������
			{
				minLength=students.get(id_k).length(); //minLength�� �� ��(�̸�)�� ���̷� ����
				minID=id_k; //�׶��� key�� minID�� ����
			}
			System.out.println(id_k+"\t\t\t\t\t"+students.get(id_k)); //Ű�� ���� ���
		}
		System.out.print("\n��ü �л���:");
		System.out.println(student_cnt); //��ü�л��� ���
		
		System.out.println("<���� �� �̸��� ���� �л�>");
		System.out.println("ID:"+maxID+"   Name:"+students.get(maxID)+"   ����:"+maxLength); 
		System.out.println("<���� ª�� �̸��� ���� �л�>");
		System.out.println("ID:"+minID+"   Name:"+students.get(minID)+"   ����:"+minLength);

		kbd.close(); //kbd ����
	}
	

}
