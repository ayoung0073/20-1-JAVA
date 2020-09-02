package Week9_1_문아영;
import java.io.*;
import java.util.Scanner;

public class Week9_1_문아영 {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Scanner keyboard=new Scanner(System.in); //Scanner 객체 생성
		String fileName=null; //String형 fileName 선언 및 null로 초기화(데이터를 읽어올 파일)
		String newFileName=null; //데이터를 쓸 파일 선언(String형)
		
		System.out.println("File name for input:");
		fileName=keyboard.nextLine(); //데이터 읽어올 파일 이름 입력하기
		System.out.println("File name for output:");
		newFileName=keyboard.nextLine(); //데이터를 써 생성할 파일 이름 입력
		try //예외 발생할 가능성 있는 문장들을 넣음
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileName)); //입력스트림 생성
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(newFileName)); //출력스트림 생성
			System.out.println("The numbrs in File, "+fileName);
			try //try문 안에 다시 예외 발생할 가능성 있는 문장들을 넣음
			{
				while(true)
				{
					int anInteger=inputStream.readInt();//입력 스트림을 통해 fileName파일에 있는 수를 읽어서 anInteger에 대입
					System.out.println(anInteger); //anInteger 출력
					anInteger=2*anInteger; //anInteger를 2배해서 anInteger에 저장하기
					outputStream.writeInt(anInteger); //출력스트림을 통해 2배한 anInteger을 newFileName 파일에 쓰기
				}
			}
			catch(EOFException e) //내부 try안에서 fileName에 더이상 읽을 게 없을 때 
			{
				System.out.println("End of reading from File, "+fileName);
				System.out.println(newFileName+" is generated.");
			}
			inputStream.close(); //입력스트림 close
			outputStream.close(); //출력스트림 close
	}
		catch(FileNotFoundException e) //외부 try에서 파일을 못 찾는 예외상황 발생했을 때 이 catch문 수행
		{
			System.out.println("Cannot find file "+fileName);
		}
		catch(IOException e)//IOException의 예외상황 발생했을 때 수행
		{
			System.out.println("Problem with from file("+fileName+" or "+newFileName+")");
		}
		
		System.out.println(); //한줄 띄우기
		System.out.println("The numbers in new File, "+newFileName); 
		try //예외 발생할 가능성 있는 문장들을 넣음
		{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(newFileName)); //newFileName의 파일로 입력스트림 생성
			try //외부 try문 안에서 다시 예외 발생할 가능성 있는 문장들을 넣음
			{
				while(true)
				{
					int anInteger=inputStream.readInt();//입력 스트림을 통해 newFileName파일에 있는 수를 읽어서 anInteger에 대입
					System.out.println(anInteger);//anInteger 출력
				}
			}
			catch(EOFException e)//내부 try안에서 newFileName에 더이상 읽을 게 없을 때 catch문 수행
			{
				System.out.println("End of reading from 2nd File, "+newFileName);
			}
			inputStream.close(); //입력스트림 close
		}
		catch(FileNotFoundException e) //외부 try에서 파일을 못 찾는 예외상황 발생했을 때 이 catch문 수행
		{
			System.out.println("Cannot find file "+newFileName);
		}
		catch(IOException e)//IOException의 예외상황 발생했을 때 수행
		{
			System.out.println("Problem with input from file "+newFileName);
		}
		catch(Exception e)//가장 범위가 넓은 Exception
		{
			System.out.println("Exception");
		}
		keyboard.close(); //스캐너 객체 close
}
}
