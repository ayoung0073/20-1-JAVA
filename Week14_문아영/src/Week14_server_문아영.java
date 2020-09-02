import java.io.*;
import java.net.*;
import java.util.*;

public class Week14_server_문아영 {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		ServerSocket serverSocket=null; //서버소켓 선언
		Socket socket=null; //소켓 선언
		int num=0, sum=0;  //num(몇번입력받는지),sum변수(합) 선언
		double avg=0.0; //avg변수(평균값) 선언
		String str=null; //입력받을 때 저장할 String형변수 선언
		
		try {
			serverSocket=new ServerSocket(9999); //포트번호 지정
			socket=serverSocket.accept(); //클라이언트의 connection 요청 기다리다가 accept
			
			Scanner in=new Scanner(socket.getInputStream()); //소켓 입력스트림 생성
			PrintWriter out=new PrintWriter(socket.getOutputStream()); //소켓 출력스트림 생성
			
			str=in.nextLine(); //입력스트림을 통해 클라이언트가 입력한 문자열 str에 저장
			System.out.println(str); //str을 콘솔에 출력
			
			out.println("How many numbers?"); //클라이언트에게 출력스트림을 통해 문자열 보냄
			out.flush(); //버퍼비우기
			
			str=in.nextLine(); //입력스트림을 통해 클라이언트가 입력한 문자열 str에 저장
			System.out.println(str); //출력
			
			num=Integer.parseInt(str); //str을 정수로 바꾼 것을 num에 대입
			
			out.println("Input "+num+" numbers"); //출력스트림을 통해 클라이언트에게 문자열 보냄
			out.flush();
			
			for(int i=0;i<num;i++) //클라이언트가 입력한 정수값만큼 for문 반복
			{
				str=in.nextLine(); //num번 클라이언트에게 입력 받음
				sum+=Integer.parseInt(str); //입력받은 문자열(숫자임)을 정수로 바꿔서 sum에 계속 더함
			}
			avg=(double)sum/num; //평균값 계산
			
			out.println("Sum: "+sum); //합을 클라이언트에게 출력스트림을 통해 보냄
			out.flush(); //버퍼 바로 비우기
			 
			out.println("Avg: "+avg); //평균을 클라이언트에게 출력스트림을 통해 보냄
			out.flush(); //버퍼 바로 비우기
			
			System.out.println("Service finished.");
			
			in.close(); //입력스트림 close
			out.close(); //출력스트림 close
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
			try {
				serverSocket.close(); //서버 소켓 close
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
