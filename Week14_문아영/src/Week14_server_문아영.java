import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_server_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		ServerSocket serverSocket=null; //�������� ����
		Socket socket=null; //���� ����
		int num=0, sum=0;  //num(����Է¹޴���),sum����(��) ����
		double avg=0.0; //avg����(��հ�) ����
		String str=null; //�Է¹��� �� ������ String������ ����
		
		try {
			serverSocket=new ServerSocket(9999); //��Ʈ��ȣ ����
			socket=serverSocket.accept(); //Ŭ���̾�Ʈ�� connection ��û ��ٸ��ٰ� accept
			
			Scanner in=new Scanner(socket.getInputStream()); //���� �Է½�Ʈ�� ����
			PrintWriter out=new PrintWriter(socket.getOutputStream()); //���� ��½�Ʈ�� ����
			
			str=in.nextLine(); //�Է½�Ʈ���� ���� Ŭ���̾�Ʈ�� �Է��� ���ڿ� str�� ����
			System.out.println(str); //str�� �ֿܼ� ���
			
			out.println("How many numbers?"); //Ŭ���̾�Ʈ���� ��½�Ʈ���� ���� ���ڿ� ����
			out.flush(); //���ۺ���
			
			str=in.nextLine(); //�Է½�Ʈ���� ���� Ŭ���̾�Ʈ�� �Է��� ���ڿ� str�� ����
			System.out.println(str); //���
			
			num=Integer.parseInt(str); //str�� ������ �ٲ� ���� num�� ����
			
			out.println("Input "+num+" numbers"); //��½�Ʈ���� ���� Ŭ���̾�Ʈ���� ���ڿ� ����
			out.flush();
			
			for(int i=0;i<num;i++) //Ŭ���̾�Ʈ�� �Է��� ��������ŭ for�� �ݺ�
			{
				str=in.nextLine(); //num�� Ŭ���̾�Ʈ���� �Է� ����
				sum+=Integer.parseInt(str); //�Է¹��� ���ڿ�(������)�� ������ �ٲ㼭 sum�� ��� ����
			}
			avg=(double)sum/num; //��հ� ���
			
			out.println("Sum: "+sum); //���� Ŭ���̾�Ʈ���� ��½�Ʈ���� ���� ����
			out.flush(); //���� �ٷ� ����
			 
			out.println("Avg: "+avg); //����� Ŭ���̾�Ʈ���� ��½�Ʈ���� ���� ����
			out.flush(); //���� �ٷ� ����
			
			System.out.println("Service finished.");
			
			in.close(); //�Է½�Ʈ�� close
			out.close(); //��½�Ʈ�� close
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
			try {
				serverSocket.close(); //���� ���� close
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
