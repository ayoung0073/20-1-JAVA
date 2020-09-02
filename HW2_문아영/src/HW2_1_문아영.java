

import java.io.*;
import java.util.*;

public class HW2_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		String fileInputName=null; //�����̸����� ����
		String fileOutputName=null;
		Scanner inputStream=null; //��Ʈ������ ����
		PrintWriter outStream=null;
		
		System.out.println("Input the filename to read.");
		fileInputName=kbd.nextLine(); //�����͸� ���� �����̸� ����
		System.out.println("Input the filename to write.");
		fileOutputName=kbd.nextLine(); //�����͸� �� �����̸� ����
		try //���� �߻��� ���ɼ� �ִ� ������� ����
		{
			inputStream=new Scanner(new File(fileInputName)); //�Է½�Ʈ�� ����
			outStream=new PrintWriter(fileOutputName);//��½�Ʈ�� ����
			while(inputStream.hasNextLine()) //�Է½�Ʈ���� ���� ������ �о�� ������ ������
			{
				String line=inputStream.nextLine(); //���ڿ��� String���� �������� line�� ����
				StringTokenizer st=new StringTokenizer(line," ,\n"); //���ڿ��� �и��� ��,���� space�� ��\n'�� �̿��� ������
				while(st.hasMoreTokens()) //token�� �ִ� ����
				{
					String word=st.nextToken(); //���� token ��ȯ�� word�� ����
					if(word.length()>4) //word�� ���̰� 4���� ũ��
					{
						outStream.println(word); //��½�Ʈ���� ���� word�� ���Ͽ� write
					}
				}
			}
			outStream.close(); //��½�Ʈ�� close
			inputStream.close(); //�Է½�Ʈ�� close
			System.out.println(fileOutputName+" is generated."); 
			kbd.close(); //kbd close
		}
		catch(FileNotFoundException e)//������ �� ã�� ���ܻ�Ȳ �߻����� �� �� catch�� ����
		{
			System.out.println("Error in opening a file.");
			System.exit(1);
		}
		catch(IOException e)//IOException�� ���ܻ�Ȳ �߻����� �� ����
		{
			System.out.println("IOException occurs");
			System.exit(1);
		}
		catch(Exception e)//���� ������ ���� Exception
		{
			System.out.println("Exception");
		}
	}

}
