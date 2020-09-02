
class Facto{
	static int result;
	
	static int factoVal(int x) {
		result=1; //factoVal메서드를 실행할 때마다 result 1로 초기화(안하면 그 전에 저장된 값으로 계속 곱해지기 때문에 안된다)
		while(x>0) { //x가 0이 되기 전(1일 때)까지 while문을 돈다
			result*=x; 
			x-=1; //팩토리얼이기 때문에 x값이 하나씩 감소한다.
		}
		return result; //result 반환
	}
}