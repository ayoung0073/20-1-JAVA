
public class Week4_3_문아영 {
	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 1971068");
		System.out.println("성명: 문아영");
		System.out.println("============");
		
		int a=5,b=10;
		double da=3.4,db=5.2;
		char ca='a',cb='b';
		int iarr[]= {1,2,3};
		double darr[]= {1.1,2.2,3.3};
		char carr[]= {'a','p','p','l','e'};
		System.out.println("a+b="+sum(a,b));
		System.out.println("da+b="+sum(da,b));
		System.out.println("a+db="+sum(a,db));
		System.out.println("da+db="+sum(da,db));
		System.out.println("ca+cb="+sum(ca,cb));
		System.out.println("sum of Int_Arr="+sum(iarr));
		System.out.println("sum of Double_Arr="+sum(darr));
		System.out.println("sum of Char_Arr="+sum(carr));
		}
	
	static int sum(int a, int b) { return a+b;} //int형 매개변수가 두개있을 때, 그냥 더해도 int형이다.
	static double sum(double da, double db) { return da+db;} //두개의 double형 매개변수가 있으면 그냥 더해도 double형 반환
	static double sum(int a,double db) {return (double)a+db;} //int형 매개변수와 double형 매개변수를 그냥 더하면 int형이 되기때문에 int형매개변수를 double형으로 형변환 해준 다음 더하기
	static double sum(double da,int b) {return da+(double)b;}//위의 메서드의 매개변수의 순서만 다르지만 다른 메서드.
	static String sum(char ca,char cb) {return ca+""+cb;} //ca와 cb가 모두 문자형이기 때문에 더할 때 문자열로 더하기 위해서는 ""(빈문자열)을 더해서 문자열화해준다.
	static int sum(int iarr[]) { //int형 배열을 더할 때
		int inum=0; //for문에서 배열들을 더하기 위해 초기값 inum을 선언해서 inum에 0을 대입한다.
		for (int i=0;i<iarr.length;i++) { //iarr.length는 배열의 개수이다. 
			inum+=iarr[i]; //배열을 하나씩 다 더한다. 
		}
		return inum;  //합계 반환
}
	static double sum(double darr[]) { //double형 배열을 더할 때
		double dnum=0d; //dnum을 double형으로 해주기 위해 0뒤에 d를 붙인다.
		for (int i=0;i<darr.length;i++) {
			dnum+=darr[i]; //배열을 하나씩 다 더한다.
		}
		return dnum; //합계 반환
	}
	static String sum(char carr[]) { //char형 문자들을 연결할 때
		String str=""; //배열들은 char형이기 때문에 더할 때 문자열이 있어야하기 때문에 ""을 연결해서 문자열로 바꾼다.
		for(int i=0;i<carr.length;i++) {
			str=str+carr[i];
		}
		return str; //연결한 문자열 반환
	}
	}


