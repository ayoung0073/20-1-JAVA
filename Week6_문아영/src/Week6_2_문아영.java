import java.util.Scanner;
public class Week6_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
			
		int num=1; //������ ��ȣ�� �Է¹��� ���� ����. while���� ���ǿ� �����ϱ� ���� 5�� �ƴ� ���� ����.
		
		Emergency eg=new Emergency(); //Emergency��ü ���� ���������� eg��� ��.
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		while(num!=5) { //num�� 5�� �ƴϸ� while�� �ݺ�.
			System.out.println("What kind of Emergency?");
			System.out.println("1.Fire   2.Patient   3.Thief   4.Record   5.End");
			num=kbd.nextInt();//�Է¹��� ���� num�� ����
			
			switch(num) { 
			case 1: //num�� 1�� ��
				FireEngine fe=new FireEngine(); //���� ������ fe�� �� FireEngine ��ü �����Ѵ� 
				eg.EM_Call(fe);//EmergencyŬ������ EM_Call �޼��� ȣ��
				break;
			case 2:
				Ambulance ab=new Ambulance();//case1�� ���� �Ʒ� �ݺ�.
				eg.EM_Call(ab);
				break;
			case 3:
				PoliceCar pc=new PoliceCar(); 
				eg.EM_Call(pc);
				break;
			case 4: //num�� 4�� ��, �ݺ��ؼ� ������ ����Ʈ�� ����.
				eg.EM_record(); //EmergencyŬ������ EM_record�޼��� ȣ��
				break;
			case 5: //num�� 5�̸� ���� ���� �����ϰ� while�� ��������
				System.out.println("Finished");
				break;
			default: //num�� 1~5�� �ƴ� �ٸ� �����̸� 
				System.out.println("Wrong Input"); 
				break;
			}
   }

}
}