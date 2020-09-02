import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_client_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Socket socket=null; //���� ����
		String str=null; //�������� ���� ���ڿ� ������ ���� ����
		int num; //��� �Է����� ������ ���� ����
		
		Scanner kbd=new Scanner(System.in); //��ĳ�� ��ü ����
		
		try {
			socket=new Socket("192.168.0.81",9999); //server�� IP�ּҿ� ��Ʈ��ȣ
			
			Scanner in=new Scanner(socket.getInputStream()); //���� �Է½�Ʈ�� ����
			PrintWriter out=new PrintWriter(socket.getOutputStream()); //���� ��½�Ʈ�� ����
			
			out.println("Hello?"); //�������� ��½�Ʈ���� ���� ���ڿ� ����
			out.flush(); //���� �ٷ� ����
			
			str=in.nextLine(); //�Է� ��Ʈ���� ���� ������ ���� ���ڿ� str�� ����
			System.out.println(str);
			
			String strUser=kbd.nextLine(); //�Է��� �� strUser�� ����
			out.println(strUser); //strUser���ڿ��� �������� ���� (��½�Ʈ���� ����)
			out.flush(); //���ۺ���
			num=Integer.parseInt(strUser); //strUser�� ������ ��ȯ�� num�� ����
			
			str=in.nextLine(); //29-30��° ���� �ݺ�
			System.out.println(str);
			
			for(int i=0;i<num;i++) //num�� for�� �ݺ�
			{
				out.println(kbd.nextLine()); //num�� �Է��Ѱ��� �������� ����
				out.flush(); //�ѹ����������� ���ۺ���
			}
			
			str=in.nextLine(); //29-30��° ���� �ݺ�
			System.out.println(str);
			
			str=in.nextLine();
			System.out.println(str);
			
			in.close(); //�Է½�Ʈ�� close
			out.close(); //��½�Ʈ�� close
			kbd.close(); //kbd close
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close(); //���� close
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
