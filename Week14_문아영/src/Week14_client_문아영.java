import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_client_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		Socket socket=null; //소켓 선언
		String str=null; //서버에게 받은 문자열 저장할 변수 선언
		int num; //몇번 입력할지 저장할 변수 선언
		
		Scanner kbd=new Scanner(System.in); //스캐너 객체 생성
		
		try {
			socket=new Socket("192.168.0.81",9999); //server의 IP주소와 포트번호
			
			Scanner in=new Scanner(socket.getInputStream()); //소켓 입력스트림 생성
			PrintWriter out=new PrintWriter(socket.getOutputStream()); //소켓 출력스트림 생성
			
			out.println("Hello?"); //서버에게 출력스트림을 통해 문자열 보냄
			out.flush(); //버퍼 바로 비우기
			
			str=in.nextLine(); //입력 스트림을 통해 서버가 보낸 문자열 str에 저장
			System.out.println(str);
			
			String strUser=kbd.nextLine(); //입력한 값 strUser에 저장
			out.println(strUser); //strUser문자열을 서버에게 보냄 (출력스트림을 통해)
			out.flush(); //버퍼비우기
			num=Integer.parseInt(strUser); //strUser을 정수로 변환해 num에 저장
			
			str=in.nextLine(); //29-30번째 문장 반복
			System.out.println(str);
			
			for(int i=0;i<num;i++) //num번 for문 반복
			{
				out.println(kbd.nextLine()); //num번 입력한값을 서버에게 보냄
				out.flush(); //한번보낼때마다 버퍼비우기
			}
			
			str=in.nextLine(); //29-30번째 문장 반복
			System.out.println(str);
			
			str=in.nextLine();
			System.out.println(str);
			
			in.close(); //입력스트림 close
			out.close(); //출력스트림 close
			kbd.close(); //kbd close
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close(); //소켓 close
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
