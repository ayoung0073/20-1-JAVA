import java.util.Scanner;
public class Week5_1_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Play play=new Play(); //Play���� play��ü ����
		Film film=new Film(); //Film���� film��ü ����
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		System.out.println("Input Title for Play");
		play.setTitle(kbd.nextLine()); //title�Է¹ް� play�� setTitle�޼��忡 ������ �ν��Ͻ����� title�� ����
		
		System.out.println("Input Director for Play");
		play.setDirector(kbd.nextLine()); //director�Է¹ް� play�� setDirector�޼��忡 ������ �ν��Ͻ� ���� director�� ����.
		
		System.out.println("Input Writer for Play");
		play.setWriter(kbd.nextLine()); //writer�Է¹ް� play�� setWriter�޼��忡 �����ؼ� �ν��Ͻ����� writer�� ����.

		System.out.println("Input Title for Film");
		film.setTitle(kbd.nextLine()); //title�Է¹ް� film�� setTitle�޼��忡 ������ �ν��Ͻ����� title�� ����

		System.out.println("Input Director for Film");//director�Է¹ް� film�� setDirector�޼��忡 ������ �ν��Ͻ����� director�� ����
		film.setDirector(kbd.nextLine());

		System.out.println("Input Writer for Film");
		film.setWriter(kbd.nextLine());//writer�Է¹ް� film�� setWriter�޼��忡 �����ؼ� �ν��Ͻ����� writer�� ����.
	
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(kbd.nextInt());//���� �Է¹޾Ƽ� play�� setPerformance�޼����� �Ű������� ������ play�� �ν��Ͻ� ���� performaceCost�� ����
		
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(kbd.nextInt());//���� �Է¹޾Ƽ� film�� setBoxOfficeGross�޼����� �Ű������� ������ film�� �ν��Ͻ� ���� boxOfficeGross�� ����
		
		play.display(); //Production�� display�޼��� �������̵��� PlayŬ������ display�޼��� ����
		System.out.println();//���ٰǳʶٱ�
		film.display();//Production�� display�޼��� �������̵��� FilmŬ������ display�޼��� ����
		
		
		

	}

}
