
class Facto{
	static int result;
	
	static int factoVal(int x) {
		result=1; //factoVal�޼��带 ������ ������ result 1�� �ʱ�ȭ(���ϸ� �� ���� ����� ������ ��� �������� ������ �ȵȴ�)
		while(x>0) { //x�� 0�� �Ǳ� ��(1�� ��)���� while���� ����
			result*=x; 
			x-=1; //���丮���̱� ������ x���� �ϳ��� �����Ѵ�.
		}
		return result; //result ��ȯ
	}
}