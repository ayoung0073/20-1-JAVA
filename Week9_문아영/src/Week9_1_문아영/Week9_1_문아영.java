package Week9_1_���ƿ�;
import java.io.*;
import java.util.Scanner;

public class Week9_1_���ƿ� {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Scanner keyboard=new Scanner(System.in); //Scanner ��ü ����
		String fileName=null; //String�� fileName ���� �� null�� �ʱ�ȭ(�����͸� �о�� ����)
		String newFileName=null; //�����͸� �� ���� ����(String��)
		
		System.out.println("File name for input:");
		fileName=keyboard.nextLine(); //������ �о�� ���� �̸� �Է��ϱ�
		System.out.println("File name for output:");
		newFileName=keyboard.nextLine(); //�����͸� �� ������ ���� �̸� �Է�
		try //���� �߻��� ���ɼ� �ִ� ������� ����
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileName)); //�Է½�Ʈ�� ����
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(newFileName)); //��½�Ʈ�� ����
			System.out.println("The numbrs in File, "+fileName);
			try //try�� �ȿ� �ٽ� ���� �߻��� ���ɼ� �ִ� ������� ����
			{
				while(true)
				{
					int anInteger=inputStream.readInt();//�Է� ��Ʈ���� ���� fileName���Ͽ� �ִ� ���� �о anInteger�� ����
					System.out.println(anInteger); //anInteger ���
					anInteger=2*anInteger; //anInteger�� 2���ؼ� anInteger�� �����ϱ�
					outputStream.writeInt(anInteger); //��½�Ʈ���� ���� 2���� anInteger�� newFileName ���Ͽ� ����
				}
			}
			catch(EOFException e) //���� try�ȿ��� fileName�� ���̻� ���� �� ���� �� 
			{
				System.out.println("End of reading from File, "+fileName);
				System.out.println(newFileName+" is generated.");
			}
			inputStream.close(); //�Է½�Ʈ�� close
			outputStream.close(); //��½�Ʈ�� close
	}
		catch(FileNotFoundException e) //�ܺ� try���� ������ �� ã�� ���ܻ�Ȳ �߻����� �� �� catch�� ����
		{
			System.out.println("Cannot find file "+fileName);
		}
		catch(IOException e)//IOException�� ���ܻ�Ȳ �߻����� �� ����
		{
			System.out.println("Problem with from file("+fileName+" or "+newFileName+")");
		}
		
		System.out.println(); //���� ����
		System.out.println("The numbers in new File, "+newFileName); 
		try //���� �߻��� ���ɼ� �ִ� ������� ����
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(newFileName)); //newFileName�� ���Ϸ� �Է½�Ʈ�� ����
			try //�ܺ� try�� �ȿ��� �ٽ� ���� �߻��� ���ɼ� �ִ� ������� ����
			{
				while(true)
				{
					int anInteger=inputStream.readInt();//�Է� ��Ʈ���� ���� newFileName���Ͽ� �ִ� ���� �о anInteger�� ����
					System.out.println(anInteger);//anInteger ���
				}
			}
			catch(EOFException e)//���� try�ȿ��� newFileName�� ���̻� ���� �� ���� �� catch�� ����
			{
				System.out.println("End of reading from 2nd File, "+newFileName);
			}
			inputStream.close(); //�Է½�Ʈ�� close
		}
		catch(FileNotFoundException e) //�ܺ� try���� ������ �� ã�� ���ܻ�Ȳ �߻����� �� �� catch�� ����
		{
			System.out.println("Cannot find file "+newFileName);
		}
		catch(IOException e)//IOException�� ���ܻ�Ȳ �߻����� �� ����
		{
			System.out.println("Problem with input from file "+newFileName);
		}
		catch(Exception e)//���� ������ ���� Exception
		{
			System.out.println("Exception");
		}
		keyboard.close(); //��ĳ�� ��ü close
}
}
