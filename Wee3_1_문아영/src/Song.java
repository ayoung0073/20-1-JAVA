
public class Song { //Song�̶�� Ŭ���� ����
	String title; 
	String singer;
	int price;
	
	public void play() { //SongŬ�������� �޼��� play()����. �μ��� ����. void������ ��ȯ.
		System.out.println("�뷡����: "+"\""+title+"\""+" by "+singer); //ū����ǥ"�� ǥ���Ϸ��� �տ� ��������(\)�� ���� �ȴ�. "\""��� ���� �ȴ�
	}
	public void price() {//SongŬ�������� �޼��� price() ����. �μ��� ����. void������ ��ȯ
		System.out.println(price+"���Դϴ�."); //�������� ���
	}
}
