package HW1_1_문아영;

public class Time { //Time 클래스 생성
	private int hour; //인스턴스변수 hour(시간) private으로 선언
	private int minute; //인스턴스변수 minute(분) private으로 선언
	
	private boolean isValid(int hour,int minute) { //인수 hour와 minute이 제대로 된 hour와 minute인지 boolean형으로 반환하는 메서드
												   //private으로 선언한 메서드이기 때문에 같은 클래스에서만 호출가능함(여기에서는 setTime메서드에서 호출당함)
		if (hour>=0 && hour<=23 && minute>=0 && minute<=59) return true;//hour가 0이상이고 23이하이고, minute이 0이상이고 59이하이면 true반환
		else return false; //그 외는 false반환
	}
	public void setTime(int hour,int minute) { //알맞은 인수 hour와 minute이면 인스턴스변수 저장하는 setTime메서드
		if (isValid(hour,minute)) { //isValid메서드가 true로 반환하면
			this.hour=hour; //인스턴스변수 저장함
			this.minute=minute;
		}
		else System.out.println("Wrong Input"); //isValid메서드가 false로 반환하면 "Wrong Input"출력
	}
	public int getTime(char ch) { //인수에 따라 인스턴스변수 hour이나 minute 반환하는 메서드
		if (ch=='H' || ch=='h') return hour; //인수가 'h'나 'H'이면 hour반환
		else if (ch=='M' || ch=='m') return minute; //인수가 'm'이나 'M'이면 minute반환
		else return 0; //그외는 0을 반환
	}
}
