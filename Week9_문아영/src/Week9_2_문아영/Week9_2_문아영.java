package Week9_2_���ƿ�;

import java.io.*;
import java.util.Scanner;

public class Week9_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Scanner keyboard=new Scanner(System.in);//Scanner��ü ����
		Dog myDog[]=new Dog[10]; //Dog�� �迭 ����
		myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog\t", false);
		myDog[1] = new Dog("JJong", 5, 5.5, "Mix\t\t", false);
		myDog[2] = new Dog("Kong", 4, 3, "Poodle\t", true);
		myDog[3] = new Dog("Apple", 2, 2.5, "Collie\t", true);
		myDog[4] = new Dog("Candy", 5, 5.5, "Coca\t", false);
		myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
		myDog[6] = new Dog("Peace", 3, 2.5, "Huskey\t", false);
		myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
		myDog[8] = new Dog("Windy", 2, 9, "Jindo\t", true);
		myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz\t", false);

		String fileName=null;
		System.out.println("Input File name to write Dog data");
		fileName=keyboard.nextLine();//�����͸� �� ���� �Է� �޾Ƽ� String�� fileName������ ����
		try //���� �߻��� ���ɼ� �ִ� ������� try�� �ȿ� ����
		{
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileName)); //��½�Ʈ�� ����
			outputStream.writeObject(myDog);//Object ��°�� fileName�� ����
			outputStream.close(); //��½�Ʈ�� close
		}
		catch(IOException e)//IOException�̶� ���ܻ�Ȳ�� �߻����� �� ������ ����
		{
			System.out.println("Error writing to file "+fileName+".");
			System.exit(0);
		}
		catch(Exception e) //Exception ���ܻ�Ȳ �߻����� �� ������ ����
		{
			System.out.println("Exception");
			System.exit(0);
		}
		
		Dog[] anotherArray=null; //Dog�� �迭 null�� ����
		System.out.println("Name\t\tAge\t\tWeight\tBreed\t\t\tBoosterShot");
		ObjectInputStream inputStream=null;
		try
		{
			 inputStream=new ObjectInputStream(new FileInputStream(fileName)); //���� fileName���� �Է½�Ʈ�� ����
			anotherArray=(Dog[])inputStream.readObject(); //Object�� ��°�� ���� �ͼ� anotherArray�� ����
			for(int i=0;i<10;i++) //�迭 ����ŭ
			{
				System.out.println(anotherArray[i]); //anotherArray[i].toString()��ȯ�� ���
			}
			System.out.println(); //���� �ǳʶٱ�
			System.out.println("Dogs older than 2 years and did not get the boosterShot.");
			for(int i=0;i<10;i++)
			{
				if(anotherArray[i].getAge()>2 && anotherArray[i].getBoosterShot()==false) //anotherArray[i]�� ���̰� 2�� �ʰ��̰�, ���������� ��������
				{
					System.out.println(anotherArray[i].getName()+"\t\t\t"+anotherArray[i].getBreed()); //�̸��� �� ���
				}
			}
			inputStream.close(); //�Է½�Ʈ�� close
		}
		catch(EOFException e)  //���ܻ�Ȳ �߻����� ���� catch�� ����
		{
			System.out.println("End of FIle Exception\n");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found Exception\n");
		}
		catch(IOException e)
		{
			System.out.println("IO Exception\n");
		}
		catch(Exception e)
		{
			System.out.println("Exception\n");
		}
		System.out.println();//���ٰǳʶٱ�
		System.out.println("Program finished"); 
		keyboard.close();//Scanner ��ü close
	}
}
