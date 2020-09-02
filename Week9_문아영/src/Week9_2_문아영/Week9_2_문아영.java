package Week9_2_문아영;

import java.io.*;
import java.util.Scanner;

public class Week9_2_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Scanner keyboard=new Scanner(System.in);//Scanner객체 생성
		Dog myDog[]=new Dog[10]; //Dog형 배열 생성
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
		fileName=keyboard.nextLine();//데이터를 쓸 파일 입력 받아서 String형 fileName변수에 저장
		try //예외 발생할 가능성 있는 문장들을 try문 안에 넣음
		{
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileName)); //출력스트림 생성
			outputStream.writeObject(myDog);//Object 통째로 fileName에 쓰기
			outputStream.close(); //출력스트림 close
		}
		catch(IOException e)//IOException이란 예외상황이 발생했을 때 수행할 문장
		{
			System.out.println("Error writing to file "+fileName+".");
			System.exit(0);
		}
		catch(Exception e) //Exception 예외상황 발생했을 때 수행할 문장
		{
			System.out.println("Exception");
			System.exit(0);
		}
		
		Dog[] anotherArray=null; //Dog형 배열 null로 생성
		System.out.println("Name\t\tAge\t\tWeight\tBreed\t\t\tBoosterShot");
		ObjectInputStream inputStream=null;
		try
		{
			 inputStream=new ObjectInputStream(new FileInputStream(fileName)); //파일 fileName으로 입력스트림 생성
			anotherArray=(Dog[])inputStream.readObject(); //Object를 통째로 갖고 와서 anotherArray에 저장
			for(int i=0;i<10;i++) //배열 수만큼
			{
				System.out.println(anotherArray[i]); //anotherArray[i].toString()반환해 출력
			}
			System.out.println(); //한줄 건너뛰기
			System.out.println("Dogs older than 2 years and did not get the boosterShot.");
			for(int i=0;i<10;i++)
			{
				if(anotherArray[i].getAge()>2 && anotherArray[i].getBoosterShot()==false) //anotherArray[i]의 나이가 2세 초과이고, 예방접종을 안했으면
				{
					System.out.println(anotherArray[i].getName()+"\t\t\t"+anotherArray[i].getBreed()); //이름과 종 출력
				}
			}
			inputStream.close(); //입력스트림 close
		}
		catch(EOFException e)  //예외상황 발생했을 때의 catch문 수행
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
		System.out.println();//한줄건너뛰기
		System.out.println("Program finished"); 
		keyboard.close();//Scanner 객체 close
	}
}
