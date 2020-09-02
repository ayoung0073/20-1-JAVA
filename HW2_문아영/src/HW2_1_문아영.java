

import java.io.*;
import java.util.*;

public class HW2_1_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Scanner kbd=new Scanner(System.in); //Scanner객체 생성
		String fileInputName=null; //파일이름변수 선언
		String fileOutputName=null;
		Scanner inputStream=null; //스트림변수 선언
		PrintWriter outStream=null;
		
		System.out.println("Input the filename to read.");
		fileInputName=kbd.nextLine(); //데이터를 읽을 파일이름 저장
		System.out.println("Input the filename to write.");
		fileOutputName=kbd.nextLine(); //데이터를 쓸 파일이름 저장
		try //예외 발생할 가능성 있는 문장들을 넣음
		{
			inputStream=new Scanner(new File(fileInputName)); //입력스트림 생성
			outStream=new PrintWriter(fileOutputName);//출력스트림 생성
			while(inputStream.hasNextLine()) //입력스트림을 통해 다음에 읽어올 문장이 있으면
			{
				String line=inputStream.nextLine(); //문자열을 String형인 참조변수 line에 대입
				StringTokenizer st=new StringTokenizer(line," ,\n"); //문자열을 분리자 ‘,’와 space와 ‘\n'를 이용해 나누기
				while(st.hasMoreTokens()) //token이 있는 동안
				{
					String word=st.nextToken(); //다음 token 반환해 word에 저장
					if(word.length()>4) //word의 길이가 4보다 크면
					{
						outStream.println(word); //출력스트림을 통해 word를 파일에 write
					}
				}
			}
			outStream.close(); //출력스트림 close
			inputStream.close(); //입력스트림 close
			System.out.println(fileOutputName+" is generated."); 
			kbd.close(); //kbd close
		}
		catch(FileNotFoundException e)//파일을 못 찾는 예외상황 발생했을 때 이 catch문 수행
		{
			System.out.println("Error in opening a file.");
			System.exit(1);
		}
		catch(IOException e)//IOException의 예외상황 발생했을 때 수행
		{
			System.out.println("IOException occurs");
			System.exit(1);
		}
		catch(Exception e)//가장 범위가 넓은 Exception
		{
			System.out.println("Exception");
		}
	}

}
